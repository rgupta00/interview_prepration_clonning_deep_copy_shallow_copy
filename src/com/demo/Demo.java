package com.demo;

import java.time.Month;
import java.util.Date;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date d1 = new Date();

		Person person1 = new Person(2, "amit", 45, d1);

		System.out.println(person1);

		Person person2 = (Person) person1.clone();

		System.out.println(person2);

//		person1.setName("sumit");
//
//		System.out.println("---------about mutable data---------------");
//		System.out.println(person2);
//		System.out.println(person1);

		person1.getDob().setDate(1);
		
		
		System.out.println("---------about mutable data---------------");
		
		System.out.println(person2);
		System.out.println(person1);

	}

}






