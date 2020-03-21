package in.nit.service;

import java.util.List;

import in.nit.model.Document;

public interface IDocumentService {
	
	Integer saveDocumentService(Document doc);
	List<Object[]> getFileIdAndNames();
	Document getOneDocuments(Integer id);

}
