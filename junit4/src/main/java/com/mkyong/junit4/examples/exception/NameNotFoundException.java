package com.mkyong.junit4.examples.exception;

public class NameNotFoundException extends Exception {
	private int errCode;

	public NameNotFoundException(int errCode, String message) {
		super(message);
		this.errCode = errCode;
	}

	public int getErrCode() {
		return errCode;
	}

	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}
}
