package com.app.beans;

import java.util.Properties;

public class FruitStore {
	private Properties fruitColors;
	public void setFruitColors(Properties fruitColors) {
		this.fruitColors=fruitColors;
	}
	@Override
	public String toString() {
		return "FriutStore [fruitColors=" + fruitColors + "]";
	}
	
}
