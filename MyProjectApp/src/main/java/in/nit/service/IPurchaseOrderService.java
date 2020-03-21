package in.nit.service;

import java.util.List;

import in.nit.model.PurchaseOrder;

public interface IPurchaseOrderService {

	Integer savePurchaseOrder(PurchaseOrder obs);

	List<PurchaseOrder> getAllPurchaseOrders();

	void deletePurchaseOrder(Integer id);

	PurchaseOrder getOnePurchaseOrder(Integer id);

	void updatePurchaseOrder(PurchaseOrder obs);
	
	List<Object[]> getOrdIdAndOrdCode();

}
