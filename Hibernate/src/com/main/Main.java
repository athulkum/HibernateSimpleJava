package com.main;

import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {





        Configuration configuration = new Configuration();
        configuration.configure("/com/resource/hibernate.cfg.xml");

        configuration.addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student();
        student.setId(101);
        student.setName("amit");
        student.setMarks(102000);


        session.save(student);

        transaction.commit();
        session.close();
        System.out.println("inserted");


    }
}