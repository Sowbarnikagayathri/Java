package com.user.registration;

import com.user.registration.dao.UserDAO;
import com.user.registration.entity.Users;
import com.user.registration.exception.UserNotFoundException;
import com.user.registration.service.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RegistrationApplicationTests {

    @Mock
    private UserDAO userDAO;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUsers_ReturnsUserList() {
        // Arrange
        List<Users> mockUsersList = new ArrayList<>();
        Mockito.when(userDAO.findAll()).thenReturn(mockUsersList);

        // Act
        List<Users> result = userService.getUsers();

        // Assert
        Assertions.assertEquals(mockUsersList, result);
        Mockito.verify(userDAO).findAll();
    }

    @Test
    public void testAddUsers_ValidUser_ReturnsAddedUser() throws UserNotFoundException {
        // Arrange
        Users mockUser = new Users();
        mockUser.setFirstname("John");
        Mockito.when(userDAO.save(Mockito.any(Users.class))).thenReturn(mockUser);

        // Act
        Users result = userService.addUsers(mockUser);

        // Assert
        Assertions.assertEquals(mockUser, result);
        Mockito.verify(userDAO).save(mockUser);
    }

    @Test
    public void testAddUsers_EmptyFirstname_ThrowsUserNotFoundException() {
        // Arrange
        Users mockUser = new Users();
        mockUser.setFirstname("");
        mockUser.setLastname("Doe");

        // Act & Assert
        Assertions.assertThrows(UserNotFoundException.class, () -> userService.addUsers(mockUser));
        Mockito.verify(userDAO, Mockito.never()).save(Mockito.any(Users.class));
    }

    @Test
    public void testUpdateUsers_ValidUser_ReturnsUpdatedUser() {
        // Arrange
        Users mockUser = new Users();
        Mockito.when(userDAO.save(Mockito.any(Users.class))).thenReturn(mockUser);

        // Act
        Users result = userService.updateUsers(mockUser);

        // Assert
        Assertions.assertEquals(mockUser, result);
        Mockito.verify(userDAO).save(mockUser);
    }

    @Test
    public void testGetUserById_ExistingId_ReturnsUser() throws UserNotFoundException {
        // Arrange
        int userId = 1;
        Users mockUser = new Users();
        Mockito.when(userDAO.findById(userId)).thenReturn(Optional.of(mockUser));

        // Act
        Users result = userService.getUserById(userId);

        // Assert
        Assertions.assertEquals(mockUser, result);
//        Mockito.verify(userDAO).findById(userId);
    }

    @Test
    public void testGetUserById_NonExistingId_ThrowsUserNotFoundException() {
        // Arrange
        int userId = 1;
        Mockito.when(userDAO.findById(userId)).thenReturn(Optional.empty());

        // Act & Assert
        Assertions.assertThrows(UserNotFoundException.class, () -> userService.getUserById(userId));
        Mockito.verify(userDAO).findById(userId);
    }

    @Test
    public void testGetRelatedUser_ReturnsUserList() {
        // Arrange
        List<Users> mockUsersList = new ArrayList<>();
        Mockito.when(userDAO.getUser()).thenReturn(mockUsersList);

        // Act
        List<Users> result = userService.GetRelatedUser();

        // Assert
        Assertions.assertEquals(mockUsersList, result);
        Mockito.verify(userDAO).getUser();
    }

    @Test
    public void testGetUserName_ReturnsUserList() {
        // Arrange
        List<Users> mockUsersList = new ArrayList<>();
        Mockito.when(userDAO.getname()).thenReturn(mockUsersList);

        // Act
        List<Users> result = userService.GetUserName();

        // Assert
        Assertions.assertEquals(mockUsersList, result);
        Mockito.verify(userDAO).getname();
    }
}

