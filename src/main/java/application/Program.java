package application;

import domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

    public static void main(String[] args){

        //************************************************************************************************************
        //  first lesson
        //************************************************************************************************************

        /*
        Person p1 = new Person(1, "Carlos da Silva", "carlos@gmail.com");
        Person p2 = new Person(2, "Joaquim Torres", "joaquim@gmail.com");
        Person p3 = new Person(3, "Ana Maria", "ana@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        */

        //************************************************************************************************************
        //  second lesson - using JPA EntityManager - EntityManagerFactory provides instances of EntityManager for
        //  connecting to same database and JPA EntityManager is used to access a database in a particular application.
        //************************************************************************************************************

        /*
        Person p1 = new Person(null, "Carlos da Silva", "carlos@gmail.com");
        Person p2 = new Person(null, "Joaquim Torres", "joaquim@gmail.com");
        Person p3 = new Person(null, "Ana Maria", "ana@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();

        System.out.println("Pronto!");
        em.close();
        emf.close();
        */

        //************************************************************************************************************
        //  third lesson - using EntityManager Method - find
        //************************************************************************************************************

        /*
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
        EntityManager em = emf.createEntityManager();

        Person p = em.find(Person.class, 2);

        System.out.println(p);

        System.out.println("Pronto!");
        em.close();
        emf.close();
        */

        //************************************************************************************************************
        //  fourth lesson - using EntityManager Method - remove
        //************************************************************************************************************

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
        EntityManager em = emf.createEntityManager();

        Person p = em.find(Person.class, 2);

        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
