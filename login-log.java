package com.xuyanbo.wx.entity.admin;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {
	
	private static final long serialVersionUID = 4921884361526800678L;
	private Integer id;
	private String loginStatus;
	private Date loginTime;
	private String loginUser;
	private String loginIp;
	private String loginDesc;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public String getLoginDesc() {
		return loginDesc;
	}
	public void setLoginDesc(String loginDesc) {
		this.loginDesc = loginDesc;
	}
	
}
