package in.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IShipmentDao;
import in.nit.service.IShipmentService;

@Service
public class ShipmentServiceImpl implements IShipmentService {

	@Autowired
    private IShipmentDao dao;
    
	@Transactional(readOnly=true)
	public List<Object[]> getShipmentModeCount() {
		return dao.getShipmentModeCount();
	}

}
