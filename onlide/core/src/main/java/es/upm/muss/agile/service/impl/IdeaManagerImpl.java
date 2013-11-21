package es.upm.muss.agile.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.upm.muss.agile.dao.IdeaDao;
import es.upm.muss.agile.model.Idea;
import es.upm.muss.agile.service.IdeaManager;

@Service("ideaManager")
public class IdeaManagerImpl extends GenericManagerImpl<Idea, Long> implements IdeaManager {
	IdeaDao ideaDao;
	
    @Autowired
    public IdeaManagerImpl (IdeaDao ideaDao) {
        super(ideaDao);
        this.ideaDao = ideaDao;
    }

	
	@Override
	public List<Idea> getIdeas() {
		return ideaDao.getIdeas();
	}

	@Override
	public Idea save(Idea idea) {
		return ideaDao.save(idea);
	}
}
