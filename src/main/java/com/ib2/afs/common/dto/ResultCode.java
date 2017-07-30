package com.ib2.afs.common.dto;

public enum ResultCode {
	success				("0","成功"),
	fail				("-1","失败"),
	noData				("-4","无数据"),
	//系统模块
	/**系统错误**/
	systemError       	("10001","系统错误"),
	
	//用户权限验证模块
	/**Token为空**/
	needToken		  	("20001","Token为空"),
	/**Token验证失败**/
	tokenInvalid 	("20002","用户未登录或者登录超时"),
	;
	
	private String resultCode;
	private String message;
	
	private ResultCode(String resultCode,String message){
		this.resultCode = resultCode;
		this.message = message;
	}

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
}
