package org.example.dao;

import org.example.entities.Employees;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;

public class EmployeeDaoImpl implements EmployeeDao{
    
    @Override
    public boolean save(Employees employee) throws Exception {
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            Serializable result = (Serializable) session.save(employee);

            transaction.commit();

            return (result != null);

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
