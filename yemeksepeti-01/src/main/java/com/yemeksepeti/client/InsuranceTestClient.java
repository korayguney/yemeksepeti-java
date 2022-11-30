package com.yemeksepeti.client;

import com.yemeksepeti.controller.CustomerController;
import com.yemeksepeti.model.*;
import com.yemeksepeti.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class InsuranceTestClient {
    public static void main(String[] args) {

       // saveTestDAta();
        CustomerController customerController = new CustomerController();
        List<Customer> customers = customerController.findAllCustomers();

        System.out.println("========== CUSTOMER LIST ==========");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println("========== END OF CUSTOMER LIST ==========");

    }

    private static void saveTestDAta() {
        Customer customer1 = new Customer("Ali Veli", "addr1", 1111111111L, "1232435");
        Customer customer2 = new Customer("Ayşe Kaya", "addr2", 2222222222L, "32452343");
        Customer customer3 = new Customer("Ahmet Mehmet", "addr3", 33333333333L, "312312331");

        Vehicle car1 = new Car("Toyota", 2018, "34VG555", "red");
        Vehicle car2 = new Car("Mercedes", 2017, "34TT555", "black");
        Vehicle moto1 = new Moto("BMW", 2016, "34TT15", 512.34);
        Vehicle moto2 = new Moto("Yamaha", 2020, "06TT555", 222.34);
        Vehicle moto3 = new Moto("Kawasaki", 2022, "07AD555", 309.34);

        car1.setCustomer(customer1);
        car2.setCustomer(customer2);
        moto1.setCustomer(customer3);
        moto2.setCustomer(customer2);
        moto3.setCustomer(customer1);

        Accident accident1 = new Accident(LocalDate.of(2021, Month.DECEMBER, 11));
        Accident accident2 = new Accident(LocalDate.of(2020, Month.JANUARY, 22));
        Accident accident3 = new Accident(LocalDate.of(2018, Month.JUNE, 01));

        car1.getAccidents().add(accident1);
        car1.getAccidents().add(accident3);
        car2.getAccidents().add(accident2);
        moto1.getAccidents().add(accident1);
        moto3.getAccidents().add(accident3);

        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

        try {
            em.getTransaction().begin();

            em.persist(car1);
            em.persist(car2);
            em.persist(moto1);
            em.persist(moto2);
            em.persist(moto3);

            em.persist(customer1);
            em.persist(customer2);
            em.persist(customer3);

            em.persist(accident1);
            em.persist(accident2);
            em.persist(accident3);

            em.getTransaction().commit();
            System.out.println("Tables created...");
        } catch (Exception e){
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }
}
