package edu.htu.upskilling.web.models;

public class User {
	int id;
	String name;
	String password;

	public User() {
	}
	
	public User(String userName, String password) {
		this.name = userName;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		StringBuffer b=new StringBuffer();
		b.append(getId());
		b.append(",");
		b.append(getName());
		return b.toString();
	}

}
