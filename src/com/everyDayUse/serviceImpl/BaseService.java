package com.everyDayUse.serviceImpl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import net.sf.ehcache.search.expression.Criteria;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.erveryDayUse.domain.Consume;
import com.everyDayUse.dao.IGenericDao;



abstract class BaseService <T,ID extends Serializable>{
	/**
	 * ���key��map�л�ȡָ����ֵ
	 * @param map
	 * @param str
	 * @return
	 */
	protected String getMap(Map<String, String[]> map , String str) {
		//System.out.println(map.get(str)[0]);
		return map.get(str)==null? null:map.get(str)[0];
	}
	
	/**
	 * ���pageBean��criteria,��dao����ѯ���������ĵ�ǰҳ��Ľ��
	 * @param p
	 * @param dc
	 * @param dao
	 */
	/*protected void findGoodsPage(Pagination<T> p,DetachedCriteria dc,IGenericDao<T, ID> dao){
		
		//��ȡ�ܼ�¼��
		long totalCount = dao.findTotalCountPage(dc);
		p.setTotalCount(totalCount);
		//��ѯ����б�
		dc.setProjection(null);
		dc.setResultTransformer(dc.ROOT_ENTITY);
		List<T>	 resultList = dao.finListPageByCriteria(dc,p.getFirstResult(),p.getmaxResults());
		p.setList(resultList);
	}*/
	public static Double findSingleSumOfPay(String SumOfcolume, String SumOfTime,
			String initOfDay, String date ,IGenericDao<Consume, Integer> genericDao) {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Consume.class).add(Restrictions.between(SumOfTime, initOfDay, date));
		Double pay = genericDao.findSingltomPayment(criteria, SumOfcolume);
		return pay;
	}
}
