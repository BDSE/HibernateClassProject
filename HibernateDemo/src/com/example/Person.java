/**
 * Class Person refer to the Person table of the data base.
 */
package com.example;

import java.util.Date;

public class Person {
	
	public Person() {

	}
	
	Person(String fn, String ln, String un, String pwrd, String email){
		this.FirstName = fn;
		this.LastName = ln;
		this.UserName = un;
		this.Password =  pwrd;
		this.Email = email;
	}

	private int id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String UserName;
	private String Password;
	private Date Date;
	

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public static void main(String[] args) {

	}

	void show(){
		System.out.println(id+" : "+FirstName+" : "+LastName+" : "+UserName+" : "+Password+" : "+Email);
	}
}
