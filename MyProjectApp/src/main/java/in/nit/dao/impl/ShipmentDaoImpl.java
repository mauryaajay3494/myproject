package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IShipmentDao;

@Repository
public class ShipmentDaoImpl implements IShipmentDao {
	
	@Autowired
	private HibernateTemplate ht;
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Object[]> getShipmentModeCount() {   
		String hql="  select shipmode,count(shipmode)  "     
	+ " from  in.nit.model.ShipmentType  "     
				+ " group by shipmode ";    
		return (List<Object[]>)ht.find(hql);
	}

}
