package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IOrderMethodDao;
import in.nit.model.OrderMethod;
@Repository

public class OrderMethodDaoImpl implements IOrderMethodDao {
	@Autowired
	private HibernateTemplate ht;


	@Override
	public Integer saveOrderMethod(OrderMethod om) {
		Integer id=(Integer)ht.save(om);

		return id;
	}
	public List<OrderMethod> getAllOrderMethods(){
		return ht.loadAll(OrderMethod.class);

	}
	public void deleteOrderMethod(Integer id) {
		ht.delete(new OrderMethod(id));		
	}

	public OrderMethod getOneOrderMethod(Integer id) {
		return ht.get(OrderMethod.class, id);
	}
	public void updateOrderMethod(OrderMethod om) {
		ht.update(om);
	}
	
	public List<Object[]> getOrderIdAndOrderCode(String mode){
		String hql=" select orderId,orderCode from "+OrderMethod.class.getName()+" "+" where orderMode=?0";
		@SuppressWarnings({ "deprecation", "unchecked" })
		List<Object[]> list=(List<Object[]>) ht.find(hql, mode);
		return list;
	}

}
