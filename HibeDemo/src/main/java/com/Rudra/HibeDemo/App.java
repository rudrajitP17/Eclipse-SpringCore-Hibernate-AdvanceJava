package com.Rudra.HibeDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException
    {
        System.out.println( "Project Started" );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Student st=new Student();
        st.setId(103);
        st.setName("Tudra");
        st.setCity("Pol");
        
        Address ad=new Address();
        ad.setCity("Kol");
        ad.setOpen(true);
        ad.setStreet("Bahadur");
        ad.setX(12.22);
        ad.setDatetime(new Date());
        
        FileInputStream fis=new FileInputStream("src/main/java/pic.jpeg");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        System.out.println(st);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        
    }
}
