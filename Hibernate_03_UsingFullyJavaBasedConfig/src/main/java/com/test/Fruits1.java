package com.test;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Fruits;
import com.utils.HibernateUtil;
public class Fruits1 {
    public static void main(String[] args) {
       
    	// transient state
    	Fruits f1 = new Fruits(1,"Sugarcane",180,6,"Kolhapur");
        Fruits f2 = new Fruits(2,"Oranges",70,12,"Nashik");
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            
            // persistent state 
            // save the student objects
            session.saveOrUpdate(f1);
            session.saveOrUpdate(f2);
                   
            //--------------------------------------------
            // commit transaction
            transaction.commit();
            
       // detached state
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        
               
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Fruits> fruits = session.createQuery("from Fruits", Fruits.class).list();

            fruits.forEach(s->System.out.println("fruitName >>>"+ s.getFruitNm()+   "Prize >>>"  + s.getFruitPrz() +  "Ng>>>" +   s.getQuantity() + "City" + s.getDcity()));
            
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
