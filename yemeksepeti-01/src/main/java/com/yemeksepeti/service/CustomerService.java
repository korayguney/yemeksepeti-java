package com.yemeksepeti.service;

import com.yemeksepeti.model.Customer;
import com.yemeksepeti.repository.CrudRepository;
import com.yemeksepeti.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerService implements CrudRepository<Customer> {
    EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

    @Override
    public List<Customer> findAll() {
        return em.createQuery("FROM Customer c", Customer.class).getResultList();
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void saveToDatabase(Customer object) {

    }

    @Override
    public void deleteFromDatabase(Customer object) {

    }

    @Override
    public void deleteFromDatabase(int id) {

    }

    @Override
    public void updateOnDatabase(Customer object, int id) {

    }
}
