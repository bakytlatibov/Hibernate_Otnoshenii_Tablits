package com.peaksoft;

import com.peaksoft.oneToOne.Passport;
import com.peaksoft.oneToOne.User;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Session session=HibernateUtil.getSessionFactory().openSession();
        Passport passport=new Passport();
        passport.setNumber("00001");
        User user=new User("Bakyt","Latibov",22);
        user.setPassport(passport);
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }
}
