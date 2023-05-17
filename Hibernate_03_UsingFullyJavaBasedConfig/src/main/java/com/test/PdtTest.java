package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Product;
import com.utils.HibernateUtil;
public class PdtTest {
    public static void main(String[] args) {
       
    	// transient state
    	Product prd1 = new Product("Checks Shirt", 1500, "White", 42);
    	Product prd2 = new Product("Addidas", 4999, "Gray", 11);
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            
            // persistent state 
            // save the student objects
            session.save(prd1);
            session.save(prd2);
                   
            //--------------------------------------------
            // commit transaction
           transaction.commit();
            
       // detached state
        } catch (Exception e) {
        	System.out.println("Exception here");
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        
               
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Product> products = session.createQuery("from Product", Product.class).list();

            products.forEach(s->System.out.println("Product Name >>> "+ s.getPrdNm() +   " Price >>> "  + s.getPrdPrz() +  " Product Color >>> " +   s.getColor() +  " Product Size >>> " + s.getSize()));
            
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}

