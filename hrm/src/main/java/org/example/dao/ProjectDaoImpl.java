package org.example.dao;

import org.example.entities.Projects;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;

public class ProjectDaoImpl implements ProjectDao {
    
    @Override
    public boolean save(Projects project) throws Exception {
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Serializable result = (Serializable) session.save(project);
            transaction.commit();

            return (result != null);

        } finally {
            if (session != null) {
                session.close();
            }
        }

    }
}
