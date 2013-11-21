package es.upm.muss.agile.service;

import java.util.List;

import es.upm.muss.agile.model.Idea;

public interface IdeaManager extends GenericManager<Idea, Long>{
	 List<Idea> getIdeas();
	 Idea save(Idea idea);
}