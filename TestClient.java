package Eample.Hibernate;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class TestClient {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Employee emp = new Employee();
		emp.setEmpNo(101);
		emp.setEmpName("Saquib");
		emp.setEmpSal(120000);
		s.persist(emp);
		// s.save(emp);
		Transaction t = s.beginTransaction();
		t.commit();
		System.out.println(" Object is Added...");
		s.close();
		sf.close();
		}
}
