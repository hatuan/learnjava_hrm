package org.example.dao;

import org.example.entities.Jobs;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;

public class JobDaoImpl implements JobDao {
    @Override
    public boolean save(Jobs job) throws Exception {
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            Serializable result = (Serializable) session.save(job);

            transaction.commit();

            return (result != null);

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
