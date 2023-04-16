package com.demo;

import java.util.Date;
import java.util.Objects;

public class Person implements Cloneable{
	private int id;
	
	private int age;

	private String name;
	private Date dob;

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person person=(Person) super.clone();
		person.dob=(Date) dob.clone();
		return person;
		//return super.clone();//default copy , shallow copy vs deep
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(int id, String name, int age, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
	}

	public Person() {
	}

	
	
	
	
	// what is the contract bw eq and hashcode
	// if 2 object are eq then there hashcode must be same .. reverse not need to be
	// true

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(" it is called just before object is removed by GC");
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dob, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(dob, other.dob) && id == other.id && Objects.equals(name, other.name);
	}

}
