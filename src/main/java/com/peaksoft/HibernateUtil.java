package com.peaksoft;

import com.peaksoft.oneToMany.Company;
import com.peaksoft.oneToMany.Employee;
import com.peaksoft.oneToOne.Passport;
import com.peaksoft.oneToOne.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory buildSessionFactory(){
        SessionFactory sessionFactory  = null;
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Company.class)
                    .addAnnotatedClass(Employee.class)
                    .buildSessionFactory();
        }catch (Exception e){
            e.printStackTrace();
        }
        return sessionFactory;
    }
    public static SessionFactory getSessionFactory(){
        return buildSessionFactory();
    }
        }

