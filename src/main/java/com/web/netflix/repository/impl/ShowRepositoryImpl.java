package com.web.netflix.repository.impl;

import com.web.netflix.repository.ShowRepository;
import com.web.netflix.entity.NetflixTitle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ShowRepositoryImpl implements ShowRepository {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<NetflixTitle> getAll() throws Exception {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        return session.createQuery("from NetflixTitle ").getResultList();
    }
}
