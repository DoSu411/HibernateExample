package de.dosu411.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
	Alien telusko = new Alien();
	telusko.setAid(101);
	telusko.setAname("Navin");
	telusko.setColor("Green");

	Configuration config = new Configuration();

	SessionFactory sf = config.buildSessionFactory();
	Session session = sf.openSession();

	session.save(telusko);
    }
}
