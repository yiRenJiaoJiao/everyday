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

	//���
	/**
	 * ��ӹ���
	 * @param domain
	 */
	void save(Object domain);
		
	//ɾ��
	/**
	 * ɾ������
	 * @param domain
	 */
	void delete(Object domain);
	
	//����
	/**
	 * ���¸���
	 * @param domain
	 */
	void update(Object domain);
	
	//��ѯ����
	/**
	 * ��ѯ����
	 * @param domainClass
	 * @return
	 */
	List<T1> findAll(Class<T1> domainClass);
	
	//������ѯ
	/**
	 * ģ����ѯ
	 * @param criteria
	 * @return
	 */
	List<T1> findByCriteria(DetachedCriteria criteria);
	
	//����id���в�ѯ
	/**
	 * ����id��ѯ������һ������
	 * @param domainClass
	 * @param id
	 * @return
	 */
	T1 findObjectById(Class<T1> domainClass,ID id);
	/**
	 * ʹ��criteria��QBC����ѯ����ȡ���ݵ��ܼ�¼��
	 * @param dc
	 * @return
	 */
	long findTotalCountPage(DetachedCriteria dc);
	/**
	 * ʹ��criteria (QBC)�����Ӳ�ѯ��ȡ������ҳ������ݼ���
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
