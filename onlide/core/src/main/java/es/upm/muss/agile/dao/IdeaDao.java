package es.upm.muss.agile.dao;

import java.util.List;

import es.upm.muss.agile.model.Idea;

/**
 * 
 * @author nanobeto@hotmail.com
 *
 */
public interface IdeaDao extends GenericDao<Idea, Long> {

	 List<Idea> getIdeas();
	 Idea save(Idea idea);

}
