package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IOrderDao;

@Repository
public class OrderDaoImpl implements IOrderDao{
	
	@Autowired
	private HibernateTemplate ht;
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Object[]> getOrderTypeCount(){
		String hql=" select orderType,count(orderType) " 
				+" from in.nit.model.OrderMethod "
				+ " group by orderType ";
		return (List<Object[]>)ht.find(hql);
	}

}
