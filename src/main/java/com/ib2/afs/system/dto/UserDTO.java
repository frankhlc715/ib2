package com.ib2.afs.system.dto;

import com.ib2.afs.common.dto.BaseDTO;

public class UserDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5206175069978129674L;

	private String id;
	
	private String userName;
	
	private String passWord;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
