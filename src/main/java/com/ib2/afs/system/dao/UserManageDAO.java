package com.ib2.afs.system.dao;

import java.util.List;

import com.ib2.afs.system.dto.UserDTO;

public interface UserManageDAO {
	public List<UserDTO> getUser(UserDTO user);
	
	public void addUser(UserDTO user);
	
	public void updateUser(UserDTO user);
	
	public void deleteUser(int id);
}
