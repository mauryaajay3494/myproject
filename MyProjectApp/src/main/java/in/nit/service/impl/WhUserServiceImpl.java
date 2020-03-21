package in.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IWhUserDao;
import in.nit.service.IWhUserService;

@Service
public class WhUserServiceImpl implements IWhUserService {

	@Autowired
	private IWhUserDao dao;
	
	@Transactional(readOnly=true)
	public List<Object[]> getWareHouseIdTypeCount() {
		return dao.getWareHouseIdTypeCount();
	}

}
