package Configuration;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateConfig {
	
	public static SessionFactory getConfiguration() {
		Configuration cfg=new Configuration();
		cfg.configure();//hibernate.cfg.xml read the file
		SessionFactory sf=cfg.buildSessionFactory();
		return sf;
	}
	
}
