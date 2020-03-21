package in.nit.service;

import java.util.List;

import in.nit.model.UomType;

public interface IUomTypeService {
	
	Integer saveUomType(UomType uob);

	List<UomType> getAllUomTypes();

	public void deleteUomType(Integer id);

	UomType getOneUomType(Integer id);

	void updateUomType(UomType uob);

	List<Object[]> getUnitIdAndUnitModel();
}
