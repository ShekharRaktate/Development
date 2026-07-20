package Com.sr.main;
//import org.hibernate.SessionFactory;
import Configuration.HibernateConfig;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateConfig.getConfiguration();
		System.out.println("table created successfully!...");
	}

}
