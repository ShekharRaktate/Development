package com.app.beans;

import java.util.Map;

public class College {
	private Map<String, String>facultySubject;
	private Map<?, ?>keyValue;
	public void setFacultySubject(Map<String, String> facultySubject) {
		this.facultySubject = facultySubject;
	}
	public void setKeyValue(Map<?, ?> keyValue) {
		this.keyValue = keyValue;
	}
	@Override
	public String toString() {
		return "College [facultySubject=" + facultySubject + ", keyValue=" + keyValue + "]";
	}
	
}
