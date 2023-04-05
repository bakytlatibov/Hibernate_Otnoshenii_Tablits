package com.peaksoft.oneToMany;

import com.peaksoft.HibernateUtil;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.jpa.JpaComplianceViolation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[]args){
        Session session= HibernateUtil.getSessionFactory().openSession();
        Employee employee=new Employee();
        employee.setName("Bakyt");
        employee.setSalary(200000);

        Company company=new Company();
        company.setName("Google");

        employee.setCompany(company);

        List<Employee>employees=new ArrayList<>();
        employees.add(employee);
        company.setEmployees(employees);
        session.beginTransaction();
        session.save(company);
        session.getTransaction().commit();
        session.close();
    }
}
