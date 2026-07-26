package com.app.beans;

import java.util.Arrays;

public class ColorFactory {
	private String[] colors;

	public void setColors(String[] colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "ColorFactory [colors=" + Arrays.toString(colors) + "]";
	}

	
}
