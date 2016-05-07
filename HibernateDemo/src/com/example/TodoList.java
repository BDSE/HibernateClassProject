package com.example;

public class TodoList {
	
	public TodoList(){
		
	}

	public TodoList(int personId, String task) {
		this.personId = personId;
		this.task = task;
	}
	private int id;
	private int personId;
	private String task;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	void show(){
		System.out.println(id+" : "+personId+" : "+task);
	}
}
