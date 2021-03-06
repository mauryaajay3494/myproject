package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IUomDao;

@Repository
public class UomDaoImpl implements IUomDao {

	@Autowired
	private HibernateTemplate ht;
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Object[]> getUomTypeCount() {
		String hql=" select unitType,count(unitType) "
				+ " from in.nit.model.UomType "
				+ " group by unitType ";
		return (List<Object[]>) ht.find(hql);
	}

}
