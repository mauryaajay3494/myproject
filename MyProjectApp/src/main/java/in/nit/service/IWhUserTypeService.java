package in.nit.service;

import java.util.List;

import in.nit.model.WhUserType;

public interface IWhUserTypeService {
	
	Integer saveWhUserType(WhUserType wob);

	List<WhUserType> getAllWhUserTypes();

	void deleteWhUserType(Integer id);

	WhUserType getOneWhUserType(Integer id);

	void updateWhUserType(WhUserType wob);
	
	List<Object[]> getUserIdAndUserCode(String userType);

}
