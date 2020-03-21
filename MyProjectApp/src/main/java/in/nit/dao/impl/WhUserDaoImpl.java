package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IWhUserDao;

@Repository
public class WhUserDaoImpl implements IWhUserDao {

	@Autowired
	private HibernateTemplate ht;
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Object[]> getWareHouseIdTypeCount() {
      String hql=" select userIdType,count(userIdType) "
      		+ " from in.nit.model.WhUserType "
      		+ " group by userIdType ";
		return (List<Object[]>) ht.find(hql);
	}

}
