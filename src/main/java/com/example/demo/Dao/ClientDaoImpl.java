package com.example.demo.Dao;


import com.example.demo.Entities.Client;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Component
public class ClientDaoImpl implements ClientDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void InsertClient(Client client) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(client);
        transaction.commit();
        session.flush(); //address will not get saved without this

    }

    @Override
    public Client SelectClient(String Id) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Client  client= (Client) session.createCriteria(Client.class).add(Restrictions.eq("id", Id)).uniqueResult();
        transaction.commit();
        session.flush(); //address will not get saved without this

        return client;

    }
//
//    @Override
//    public void DeleteClient(String id) {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Query query = session.createQuery("delete from Client where id=id");
//        query.setParameter("id", id);
//        query.executeUpdate();
//        transaction.commit();
//
//        session.flush(); //address will not get saved without this
//
//    }

    @Override
    public void UpdateClient(Client client) {


        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(client);
        transaction.commit();

        session.flush(); //address will not get saved without this

    }

    @Override
    public void D(String Id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("delete from Client where id=:id");
        query.setParameter("id", Id);
        query.executeUpdate();
        transaction.commit();

        session.flush(); //address will not get saved without this
    }


    @Override
    public List<Client> AllClientsClient() {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Client> list = session.createCriteria(Client.class).list();
        transaction.commit();
        session.flush(); //address will not get saved without this

        return list;

    }

}
