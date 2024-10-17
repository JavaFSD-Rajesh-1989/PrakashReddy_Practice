package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
    public static void main(String[] args) {
        // Load Hibernate configuration and entity
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(User.class);

        // Build SessionFactory and open a session
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Begin transaction, save user, and commit
        session.beginTransaction();
        User user = new User();
        user.setId(1);
        user.setName("John Doe");
        session.save(user);

        session.getTransaction().commit();
        session.close();
    }
}
