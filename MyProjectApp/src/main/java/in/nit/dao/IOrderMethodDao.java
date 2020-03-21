package in.nit.dao;

import java.util.List;

import in.nit.model.OrderMethod;

public interface IOrderMethodDao {
	public Integer saveOrderMethod(OrderMethod om) ;
	List<OrderMethod> getAllOrderMethods();
	public void deleteOrderMethod(Integer id);
	OrderMethod getOneOrderMethod(Integer id);
		
	void updateOrderMethod(OrderMethod om);
	
    List<Object[]> getOrderIdAndOrderCode(String mode);
}
