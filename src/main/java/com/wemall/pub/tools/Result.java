package com.wemall.pub.tools;

public class Result<T> {
	
	public static Integer SUCCESS = 1;
	public static Integer FAIL = 0;
	private Integer resultCode;
	private T data;
	private String msg;
	public Integer getResultCode() {
		return resultCode;
	}
	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
