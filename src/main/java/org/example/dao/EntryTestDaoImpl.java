package org.example.dao;

import java.io.Serializable;

import org.example.entities.EntryTest;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EntryTestDaoImpl implements EntryTestDao{

    @Override
    public boolean save(EntryTest entryTest) throws Exception {
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            Serializable result = (Serializable) session.save(entryTest);

            transaction.commit();

            return (result != null);

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    
}
