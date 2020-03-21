package in.nit.dao;
import java.util.List;

import in.nit.model.UomType;


public interface IUomTypeDao {
	
	Integer saveUomType(UomType uob);

	List<UomType> getAllUomTypes();

	void deleteUomType(Integer id);

	UomType getOneUomType(Integer id);

	void updateUomType(UomType uob);

	List<Object[]> getUnitIdAndUnitModel();
}
