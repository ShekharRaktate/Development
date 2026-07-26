package com.app.beans;

public class BlueDart implements Courier {
	@Override
	public String deliver(int orderId) {
		return orderId+" order is delivery with BlueDart";
	}
}
