package in.nit.dao;


import java.util.List;

import in.nit.model.ShipmentType;

public interface IShipmentTypeDao {

	public Integer saveShipmentType(ShipmentType ob);
	List<ShipmentType> getAllShipmentTypes();
	public void deleteShipmentType(Integer id);
	ShipmentType getOneShipmentType(Integer id);
	void updateShipmentType(ShipmentType ob);
	List<Object[]> getShipIdAndShipcode();
	
	

}
