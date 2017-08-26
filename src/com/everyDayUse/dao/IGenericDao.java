package com.everyDayUse.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.erveryDayUse.domain.Consume;
import com.erveryDayUse.domain.ConsumeType;
import com.erveryDayUse.domain.User;


public interface IGenericDao<T1, ID extends Serializable> {

	T1 findObject(DetachedCriteria criteria);

	//添加
	/**
	 * 添加功能
	 * @param domain
	 */
	void save(Object domain);
		
	//删除
	/**
	 * 删除功能
	 * @param domain
	 */
	void delete(Object domain);
	
	//更新
	/**
	 * 更新更能
	 * @param domain
	 */
	void update(Object domain);
	
	//查询所有
	/**
	 * 查询所有
	 * @param domainClass
	 * @return
	 */
	List<T1> findAll(Class<T1> domainClass);
	
	//条件查询
	/**
	 * 模糊查询
	 * @param criteria
	 * @return
	 */
	List<T1> findByCriteria(DetachedCriteria criteria);
	
	//根据id进行查询
	/**
	 * 根据id查询，返回一个对象
	 * @param domainClass
	 * @param id
	 * @return
	 */
	T1 findObjectById(Class<T1> domainClass,ID id);
	/**
	 * 使用criteria（QBC）查询，获取数据的总记录数
	 * @param dc
	 * @return
	 */
	long findTotalCountPage(DetachedCriteria dc);
	/**
	 * 使用criteria (QBC)外连接查询获取给定的页码的数据集合
	 * @param dc
	 * @param firstResult
	 * @param getmaxResults
	 * @return
	 */
	List<T1> finListPageByCriteria(DetachedCriteria dc, int firstResult,
			int getmaxResults);

	void updateField(User model);

	//Double findEveryDayPay(Integer id, String date, String date1);

	 Double findSingltomPayment(DetachedCriteria criteria, String string);


	//Double findSingltment(DetachedCriteria criteria);

	
}
