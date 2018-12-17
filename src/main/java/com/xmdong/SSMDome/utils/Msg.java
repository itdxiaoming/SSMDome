package com.xmdong.SSMDome.utils;

import java.util.HashMap;
import java.util.Map;

public class Msg {

    // 100成功 200失败
    private int code;
    private String msg;

    private Map<String, Object> reulst = new HashMap<String, Object>();

    public static Msg sussess(String msg) {
	Msg result = new Msg();
	result.code = 100;
	result.msg = msg == null || "".equals(msg) ? "成功" : msg;
	return result;
    }

    public static Msg fail(String msg) {
	Msg result = new Msg();
	result.code = 200;
	result.msg = msg == null || "".equals(msg) ? "失败" : msg;
	return result;
    }

    public Msg add(String key, Object value) {
	this.getReulst().put(key, value);
	return this;
    }

    public int getCode() {
	return code;
    }

    public void setCode(int code) {
	this.code = code;
    }

    public String getMsg() {
	return msg;
    }

    public void setMsg(String msg) {
	this.msg = msg;
    }

    public Map<String, Object> getReulst() {
	return reulst;
    }

    public void setReulst(Map<String, Object> reulst) {
	this.reulst = reulst;
    }

}
