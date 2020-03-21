package in.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IOrderDao;
import in.nit.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {
	
	@Autowired
	private IOrderDao dao;
	
	@Transactional(readOnly=true)
	public List<Object[]> getOrderTypeCount() {
		return dao.getOrderTypeCount();
	}

}
