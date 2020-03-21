package in.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.IUomDao;
import in.nit.service.IUomService;

@Service
public class UomServiceImpl implements IUomService {

	@Autowired
	private IUomDao dao;
	
	public List<Object[]> getUomTypeCount() {
		return dao.getUomTypeCount();
	}

}
