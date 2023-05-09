package com.cg.day2;



	class Animal {

		void eat()
		{
			System.out.println("method of base class");
			System.out.println("Animal");
		}
	}

	class Dog extends Animal {

		void eat()
		{
			System.out.println("method of derived class");
			System.out.println("Dog");
		}
	}

	public class methodOverride{

		public static void main(String args[])
		{
			Dog d1 = new Dog();
			Animal a1 = new Animal();

			d1.eat();
			a1.eat();

			Animal animal = new Dog();
			// eat() method of animal class is overridden by
			// base class eat()
			animal.eat();
		}
	}


