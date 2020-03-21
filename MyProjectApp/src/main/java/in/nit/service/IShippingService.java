package in.nit.service;

import java.util.List;

import in.nit.model.Shipping;

public interface IShippingService {

	Integer saveShipping(Shipping sob);

	List<Shipping> getAllShippings();

	void deleteShipping(Integer id);

	Shipping getOneShipping(Integer id);

	void updateShipping(Shipping sob);

}
