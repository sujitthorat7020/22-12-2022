package com.exercise.bll;

public class Author {
	
	private String firstName;
	private String lastName;
	private String bookName;
	
	public Author(){}
	 
	
	public Author(String firstName,String lastName,String bookname)
	{
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.bookName=bookName;
	}
	
	public Author(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName= lastName;
	}
	
	 
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getBookname() {
		return bookName;
	}


	public void setBookname(String bookname) {
		this.bookName = bookName;
	}


	public String toString(){
		
		return "The details of the book are: " + firstName + ", " + lastName + ", " + bookName;
	}
	

}