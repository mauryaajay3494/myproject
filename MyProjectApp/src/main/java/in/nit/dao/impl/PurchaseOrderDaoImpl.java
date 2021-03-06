package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IPurchaseOrderDao;
import in.nit.model.PurchaseOrder;

@Repository
public class PurchaseOrderDaoImpl implements IPurchaseOrderDao {

	@Autowired
	private HibernateTemplate ht;
	
	public Integer savePurchaseOrder(PurchaseOrder obs) {
		return (Integer) ht.save(obs);
	}
	
	public List<PurchaseOrder> getAllPurchaseOrders() {
		return ht.loadAll(PurchaseOrder.class);
	}
	
	public void deletePurchaseOrder(Integer id) {
		ht.delete(new PurchaseOrder(id));
	}
	
	public PurchaseOrder getOnePurchaseOrder(Integer id) {
		return ht.get(PurchaseOrder.class,id);
	}
	
	public void updatePurchaseOrder(PurchaseOrder obs) {
		ht.update(obs);
	}
	
	public List<Object[]> getOrdIdAndOrdCode() {
		String hql=" select ordId,ordCode from "+PurchaseOrder.class.getName()+" ";
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Object[]> list=(List<Object[]>) ht.find(hql);
		return list;
	}
}
