package com.ib2.afs.common.dto;

import java.util.HashMap;

public class JsonResult<T> {
	/**
	 * 
	 */
	private String resultCode=ResultCode.success.getResultCode();
	/**
	 * 
	 */
	private String message;
	private T data;
	
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	public JsonResult(String resultCode, String message, T data) {
		super();
		this.resultCode = resultCode;
		this.message = message;
		this.data = data;
	}
	public JsonResult() {
		super();
	}
	public static JsonResult<Object> getResult(String resultCode ,String message ,Object data){
		JsonResult<Object> jsonResult = new JsonResult<Object>();
		jsonResult.setData(data);
		jsonResult.setResultCode(resultCode);
		jsonResult.setMessage(message);
		if(data == null) data = new HashMap<String, Object>();
		jsonResult.setData(data);
		return jsonResult;
	}
	
	public void setSuccessMsg(String msg){
		this.resultCode=ResultCode.success.getResultCode();
		this.message=msg;
	}	
	
	public void setErrorMsg(String resultCode,String msg){
		this.resultCode=resultCode;
		this.message=msg;
	}
}
