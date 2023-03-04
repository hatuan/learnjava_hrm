package org.example.dao;

import java.io.Serializable;

import org.example.entities.Candidate;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CandidateDaoImpl implements CandidateDao{

    @Override
    public boolean save(Candidate candidate) throws Exception {
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            Serializable result = (Serializable) session.save(candidate);
            
            transaction.commit();

            return (result != null);

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    
}
