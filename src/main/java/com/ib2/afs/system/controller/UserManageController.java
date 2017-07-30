package com.ib2.afs.system.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ib2.afs.common.dto.JsonResult;
import com.ib2.afs.common.util.ThreadContextUtil;
import com.ib2.afs.system.dto.UserDTO;
import com.ib2.afs.system.service.UserManageService;

@Controller
@RequestMapping("/user")
public class UserManageController {
	private static final Logger USER_LOG = LogManager.getLogger(UserManageController.class);
	
	@Autowired
	private UserManageService userManageService;
	
	@ResponseBody
	@RequestMapping("/getUser.do")
	public JsonResult<List<UserDTO>> addUser(UserDTO user){
		USER_LOG.debug("/*************UserManageController thread contex user is ===>"+ThreadContextUtil.get("userName"));
		List<UserDTO> list = userManageService.getUser(user.getUserName());
		JsonResult<List<UserDTO>> result = new JsonResult<List<UserDTO>>();
		result.setData(list);
		result.setSuccessMsg("查询用户信息成功！");
		return result;
	}
	
	public static void main(String[] args) {
		UserDTO user = new UserDTO();
		user.setUserName("frank");
		System.out.println(JSON.toJSONString(user));
	}
}
