package com.ib2.afs.system.service;

import java.util.List;

import com.ib2.afs.system.dto.UserDTO;

public interface UserManageService {
	public List<UserDTO> getUser(String userName);
	
	public void addUser(UserDTO user);
	
	public void updateUser(UserDTO user);
	
	public void deleteUser(int id);
}
