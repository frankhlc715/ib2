package com.ib2.afs.system.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ib2.afs.common.util.ThreadContextUtil;
import com.ib2.afs.system.controller.UserManageController;
import com.ib2.afs.system.dao.UserManageDAO;
import com.ib2.afs.system.dto.UserDTO;
import com.ib2.afs.system.service.UserManageService;

@Service("userManageService")
class UserManageServiceImpl implements UserManageService {
	private static final Logger USER_SERVICE_LOG = LogManager.getLogger(UserManageServiceImpl.class);
	@Autowired
	private UserManageDAO userManageDAO;
	
	public List<UserDTO> getUser(String userName) {
		USER_SERVICE_LOG.debug("/*************UserManageServiceImpl thread contex user is ===>"+ThreadContextUtil.get("userName"));
		UserDTO user = new UserDTO();
		user.setUserName(userName);
		return userManageDAO.getUser(user);
	}

	public void addUser(UserDTO user) {
		// TODO Auto-generated method stub
		userManageDAO.addUser(user);
	}

	public void updateUser(UserDTO user) {
		// TODO Auto-generated method stub
		userManageDAO.updateUser(user);
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userManageDAO.deleteUser(id);
	}

	
	
}
