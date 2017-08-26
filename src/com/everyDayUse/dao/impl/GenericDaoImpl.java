package com.everyDayUse.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.classic.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.hql.ast.tree.SessionFactoryAwareNode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.erveryDayUse.domain.Consume;
import com.erveryDayUse.domain.User;
import com.everyDayUse.dao.IGenericDao;
import com.everyDayUse.utils.DataUtils;

@NamedQueries(value={@NamedQuery(name="findEveryDayPaySql",query=" sum(singltonPayment) from Consume where consumeTime between ? and ?")})
public class GenericDaoImpl<T, ID extends Serializable> extends
		HibernateDaoSupport implements IGenericDao<T, ID > {
	/**
	 * 获取对象
	 */
	@Override
	public T findObject(
			DetachedCriteria criteria) { 
		List<T> list = super.getHibernateTemplate().findByCriteria(criteria);
		return (T) (list.size()==0 ? null:list.get(0));
	}
	
	@Override
	public List<T> findAll(Class<T> domainClass) {
		List<T> loadAll = super.getHibernateTemplate().loadAll(domainClass);
		return loadAll;
	}

	@Override
	public void delete(Object domain) {
		super.getHibernateTemplate().delete(domain);

	}

	@Override
	public void update(Object domain) {
		super.getHibernateTemplate().update(domain);
	}

	@Override
	public void save(Object domain) {
		super.getHibernateTemplate().save(domain);
		
	}

	@Override
	public List<T> findByCriteria(DetachedCriteria criteria) {
		return super.getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public T findObjectById(Class<T> domainClass ,ID id) {
		return super.getHibernateTemplate().get(domainClass, id);
	}

	@Override
	public long findTotalCountPage(DetachedCriteria dc) {
		dc.setProjection(Projections.rowCount());
		List<Long> list = super.getHibernateTemplate().findByCriteria(dc);
		return list.isEmpty()? 0:list.get(0);
	}

	@Override
	public List<T> finListPageByCriteria(DetachedCriteria dc, int firstResult,
			int getmaxResults) {
		return super.getHibernateTemplate().findByCriteria(dc, firstResult, getmaxResults);
	}

	@Override
	public void updateField(User model) {
		
		
	}

	@Override
	public Double findSingltomPayment(DetachedCriteria criteria,String str) {
		criteria.setProjection(Projections.sum(str));
		List<Double> list = super.getHibernateTemplate().findByCriteria(criteria);
		/*if (list.size()==0&& list.get(0)==null) {
			return 0.0;
		}else{
			return list.get(0);
		}*/
		//System.out.println(list);
		//System.out.println(list.get(0));
		if (list==null||list.size()==0||list.get(0)==null) {
			return 0.0;
		}else{
			return list.get(0);
		}
		//return list.size()==0 ? 0.0 :list.get(0);
	}

	


}
