package org.example;


import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        User user = new User();
        user.setName("saman");
        user.setUserName("saman mher");
        user.setPassWord("1382");
        session.save(user);
        session.getTransaction().commit();
        session.close();


    }


}