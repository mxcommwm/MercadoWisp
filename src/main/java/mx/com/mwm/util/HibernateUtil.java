package mx.com.mwm.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactoryObj = buildSessionFactoryObj();

	@SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactoryObj() {
		try {
			sessionFactoryObj=new Configuration().configure().buildSessionFactory();
			
		} catch (ExceptionInInitializerError exceptionObj) {
			exceptionObj.printStackTrace();
		}
		return sessionFactoryObj;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactoryObj;
	}

}
