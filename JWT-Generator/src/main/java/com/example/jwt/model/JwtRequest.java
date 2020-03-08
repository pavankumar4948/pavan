package com.example.jwt.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {
	private static final long serialVersionUID = 5926468583005150707L;
	private String iss;
	private String exp;
	private String usertype;
	private String bupaUserId;
	private String oid;
	private String clientAppName;
	// need default constructor for JSON Parsing
	public JwtRequest() {
	}
	public String getIss() {
		return iss;
	}
	public void setIss(String iss) {
		this.iss = iss;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getBupaUserId() {
		return bupaUserId;
	}
	public void setBupaUserId(String bupaUserId) {
		this.bupaUserId = bupaUserId;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getClientAppName() {
		return clientAppName;
	}
	public void setClientAppName(String clientAppName) {
		this.clientAppName = clientAppName;
	}

	

}
