package com.technicalkeeda.dao.impl;

import com.technicalkeeda.entity.TrnMovies;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.technicalkeeda.dao.MovieDao;

import javax.persistence.EntityManager;

public class MovieDaoImpl implements MovieDao {

    @Autowired
    private EntityManager entityManager;

//	private HibernateTemplate hibernateTemplate;

//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
//	}

    @Override
    public void createMovie(TrnMovies trnMovies)
    {
//        hibernateTemplate.saveOrUpdate(trnMovies);
        entityManager.persist(trnMovies);
    }
}