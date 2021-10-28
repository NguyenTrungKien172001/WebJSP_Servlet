package com.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.model.Content;
import com.utils.HibernateUtils;

public class ContentDAO {
	// them du lieu
			public Content store(Content entity) {

				Session session = HibernateUtils.getSession();
				session.beginTransaction();

				Integer id = (Integer) session.save(entity);

				session.getTransaction().commit();
				entity.setId(id);

				return entity;
			}

		// lay du lieu
			public List<Content> paginate(int offset, int limit) {
				String hql = "FROM Content";
				Session session = HibernateUtils.getSession();
				Query query = session.createQuery(hql);
				query.setFirstResult(offset);
				query.setMaxResults(offset + limit);

				List<Content> listContent = query.getResultList();

				return listContent;
			}
			
			//get All
			public List<Content> getAll() {
				String hql = "FROM Content";
				Session session = HibernateUtils.getSession();
				Query query = session.createQuery(hql);
				List<Content> listContent = query.getResultList();

				return listContent;
			}

		//lay du lieu = id
			public Content findById(int id) {
				Session session = HibernateUtils.getSession();
				Content entity = session.get(Content.class, id);
				return entity;
			}

		//cap nhat
			public void update(Content entity) {
				Session session = HibernateUtils.getSession();
				session.clear();

				try {
					session.beginTransaction();
					session.update(entity);
					session.getTransaction().commit();
				} catch (Exception e) {
					e.printStackTrace();
					session.getTransaction().rollback();
				}
			}

		//xoa
			public void delete(Content entity) {
				Session session = HibernateUtils.getSession();
				session.clear();

				try {
					session.beginTransaction();
					session.delete(entity);
					session.getTransaction().commit();
				} catch (Exception e) {
					e.printStackTrace();
					session.getTransaction().rollback();
					throw e;
				}
			}
}
