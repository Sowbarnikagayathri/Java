package com.user.registration.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.registration.entity.Users;

@Repository
public interface UserDAO extends JpaRepository<Users, Integer>, CrudRepository<Users, Integer>{
	
	@Query("select u from Users u")

	List<Users> getUser();

	@Query("select u from Users u where firstname like 'K%'")

	List<Users> getname();

}
