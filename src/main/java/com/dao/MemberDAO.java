package com.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.model.Member;
import com.utils.HibernateUtils;

public class MemberDAO {
	// them du lieu
		public Member store(Member entity) {

			Session session = HibernateUtils.getSession();
			session.beginTransaction();

			Integer id = (Integer) session.save(entity);

			session.getTransaction().commit();
			entity.setId(id);

			return entity;
		}

	// lay du lieu
		public List<Member> paginate(int offset, int limit) {
			String hql = "FROM Member";
			Session session = HibernateUtils.getSession();
			Query query = session.createQuery(hql);
			query.setFirstResult(offset); 
			query.setMaxResults(offset + limit);

			List<Member> listMember = query.getResultList();

			return listMember;
		}
		
		//get All
		public List<Member> getAll() {
			String hql = "FROM Member";
			Session session = HibernateUtils.getSession();
			Query query = session.createQuery(hql);
			List<Member> listMember = query.getResultList();

			return listMember;
		}

	//lay du lieu = id
		public Member findById(int id) {
			Session session = HibernateUtils.getSession();
			Member entity = session.get(Member.class, id);
			return entity;
		}

	//cap nhat
		public void update(Member entity) {
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
		public void delete(Member entity) {
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
	//login
		public Member login(String email, String password) {
			String hql = "SELECT obj FROM Member obj WHERE obj.Email = :Email AND obj.Password = :Password AND obj.DeleteAt = 0";
			Query query = HibernateUtils.getSession().createQuery(hql);
			query.setParameter("Email", email);
			query.setParameter("Password", password);
			try {
				Member entity = (Member) query.getSingleResult();
				
				return entity;
			} catch (Exception e) {
				System.out.println("Email or Password is Null");
//				e.printStackTrace();
			}
			
			
			
			return null;
		}
}
