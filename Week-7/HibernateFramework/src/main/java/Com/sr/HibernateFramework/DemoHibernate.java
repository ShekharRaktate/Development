package Com.sr.HibernateFramework;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//for demo purpose we use product
@Entity
public class DemoHibernate {
		@Id
		private int pId;
		
		private String name;
		private double price;
		private int qty;
		public DemoHibernate() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getpId() {
			return pId;
		}
		public void setpId(int pId) {
			this.pId = pId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		
		
	

}
