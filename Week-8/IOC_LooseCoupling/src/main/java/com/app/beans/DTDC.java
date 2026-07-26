package com.app.beans;

public class DTDC implements Courier {
	@Override
	public String deliver(int orderId) {
		return orderId+" order is delivery with Ekart";
	}
}
