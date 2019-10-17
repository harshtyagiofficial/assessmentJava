package com.myproject.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myproject.model.ProjectModelClass;

@Component
public class ProjectDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Transactional
	public void saveShoes(ProjectModelClass projectmodelclass) {
		Session session = sessionFactory.getCurrentSession();
		session.save(projectmodelclass);
	}
	
	
	
	@Transactional
	public ArrayList<ProjectModelClass> getShoesBySize(int shoeSize) {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(ProjectModelClass.class);
		cr.add(Restrictions.eq ("size", shoeSize));
		ArrayList<ProjectModelClass> pms = (ArrayList<ProjectModelClass>)cr.list();
		return pms;
	}

	@Transactional
	public ArrayList<ProjectModelClass> getShoesByBrand(String brand) {
		Session session = sessionFactory.getCurrentSession();
		String str = brand+"%";
		Criteria cr = session.createCriteria(ProjectModelClass.class);
		cr.add(Restrictions.ilike("brandName", str));
		ArrayList<ProjectModelClass> pms = (ArrayList<ProjectModelClass>)cr.list();
		return pms;
	}
	
	@Transactional
	public void deleteById(int id) {
		Session session = sessionFactory.getCurrentSession();
		ProjectModelClass pmc = (ProjectModelClass)session.get(ProjectModelClass.class, id);
		session.delete(pmc);
	}
	
	
	@Transactional
	public ArrayList<ProjectModelClass> getList() {
		Session session= sessionFactory.getCurrentSession();
		//session.g
		ArrayList<ProjectModelClass> pmc = (ArrayList<ProjectModelClass>)session.createQuery("from ProjectModelClass").list();
		return pmc;
	}
	
	
	
	@Transactional
	public void updateShoes(int id, String name, int size) {
		
		Session session = sessionFactory.getCurrentSession();
		ProjectModelClass pmc = new ProjectModelClass();
		pmc.setSerialNumber(id);
		pmc.setBrandName(name);
		pmc.setSize(size);
		session.update(pmc);
	}
	

}

