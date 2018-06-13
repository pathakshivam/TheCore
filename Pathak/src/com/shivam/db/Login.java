package com.shivam.db;

import java.util.Iterator;
import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.shivam.entity.UserInfo;


public class Login {
	Configuration cf = new Configuration();
	SessionFactory sf = cf.configure().buildSessionFactory();
	Session session = sf.openSession();

	public int getData(UserInfo user) {
		try{
			UserInfo tempU;
			session.beginTransaction();
			String HQL = "from UserInfo";
			Query<UserInfo> query = session.createQuery(HQL,UserInfo.class);
			List<UserInfo> l = query.list();			
			Iterator<UserInfo> iter = l.iterator();
			while(iter.hasNext()){
				tempU = iter.next();
				if(user.getID() == tempU.getID()){
					if(user.getPassword().equals(tempU.getPassword())){
						return 1;
					}
				}
			}
			return 0;
			//session.getTransaction().commit();
			//session.close();
			//sf.close();
		}catch(Exception ex){
			System.out.println(ex);
			return 0;
		}

	}

	public void saveData(UserInfo user) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

}
