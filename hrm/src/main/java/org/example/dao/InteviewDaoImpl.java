package org.example.dao;

import java.io.Serializable;

import org.example.entities.Interview;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InteviewDaoImpl implements InterviewDao{

    @Override
    public boolean save(Interview interview) throws Exception {
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            Serializable result = (Serializable) session.save(interview);

            transaction.commit();

            return (result != null);

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    
}
