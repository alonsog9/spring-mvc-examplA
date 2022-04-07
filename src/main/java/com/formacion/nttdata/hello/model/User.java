package com.formacion.nttdata.hello.model;

public class User {
	String userName;
	String userSurname;
	int userTag; //variable para el numero, nombre del imput en el formulario

	public int getUserTag() { //nuevos geter y seter para llamar al tag
		return userTag;
	}
	public void setUserTag(int userTag) {
		this.userTag = userTag;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
	
}