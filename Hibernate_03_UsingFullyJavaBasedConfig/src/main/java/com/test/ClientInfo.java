package com.test;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Client;
import com.utils.HibernateUtil;
public class ClientInfo {

	public static void main(String[] args) {
		
		Client Info = new Client("saurabh","kolhapur","mca");
		Client Info1 = new Client("nikhil","kolhapur","msc");
		Client Info2 = new Client("rupesh","akola","BE");
		
		Transaction transaction = null;
		
		try(Session session=HibernateUtil.getSessionFactory().openSession()) {
			
			transaction = session.beginTransaction();
			
			session.save(Info);
			session.save(Info1);
			session.save(Info2);
			
			transaction.commit();
			
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			List<Client> cl= session.createQuery("from Client", Client.class).list();
			
			cl.forEach(i -> System.out.println("ClientId > "+ i.getClId()+ "Client_name > "+ i.getClNm()+ "Client_city > "+ i.getCity() + "Client_Qali > "+ i.getqulifications()));
			
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
		}
		
	}

}
