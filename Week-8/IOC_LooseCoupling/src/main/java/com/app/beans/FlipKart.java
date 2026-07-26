package com.app.beans;

import java.util.Arrays;
import java.util.Random;

public class FlipKart {

		private Courier courier;
		public void setCourier(Courier courier) {
			this.courier=courier;
			
		}
		public String shopping (String[] items) {
			Random r=new Random(10000);
			int orderId=r.nextInt();
			String msg=courier.deliver(orderId);
			return Arrays.toString(items)+msg;
		}
}
