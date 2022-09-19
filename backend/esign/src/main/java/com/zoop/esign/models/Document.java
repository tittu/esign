package com.zoop.esign.models;

import java.util.ArrayList;

public class Document{
    public String data;
    public String info;
    public ArrayList<Sign> sign;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public ArrayList<Sign> getSign() {
		return sign;
	}
	public void setSign(ArrayList<Sign> sign) {
		this.sign = sign;
	}
    
    
}
