package com.snailxr.base.support;

public class RetObj {
	private boolean flag = true;
	private String msg;
	private Object obj;
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public RetObj() {

	}
	public RetObj(boolean flag, String msg, Object obj) {
		super();
		this.flag = flag;
		this.msg = msg;
		this.obj = obj;
	}
	public RetObj(boolean flag, String msg) {
		super();
		this.flag = flag;
		this.msg = msg;
	}
	
}
