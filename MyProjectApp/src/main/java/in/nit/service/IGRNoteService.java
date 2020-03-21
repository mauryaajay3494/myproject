package in.nit.service;

import java.util.List;

import in.nit.model.GRNote;

public interface IGRNoteService {

	Integer saveGRNote(GRNote gob);

	List<GRNote> getAllGRNotes();

	void deleteGRNote(Integer id);

	GRNote getOneGRNote(Integer id);

	void updateGRNote(GRNote gob);

}
