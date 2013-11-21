package es.upm.muss.agile.dao.hibernate;

import java.util.List;

import org.hibernate.Query;

import es.upm.muss.agile.dao.IdeaDao;
import es.upm.muss.agile.dao.UserDao;
import es.upm.muss.agile.model.Idea;
import es.upm.muss.agile.model.User;

/**
 * 
 * @author nanobeto@hotmail.com
 *
 */
public class IdeaDaoHibernate  extends GenericDaoHibernate<Idea, Long> implements IdeaDao{

	/**
     * Constructor that sets the entity to User.class.
     */
    public IdeaDaoHibernate() {
        super(Idea.class);
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<Idea> getIdeas() {
		Query qry = getSession().createQuery("from Idea i order by upper(i.title)");
		return qry.list();
	}
	
	
	public Idea save(Idea idea){
		if (log.isDebugEnabled()) {
			log.debug("idea's id: " + idea.getId());
		}
        getSession().saveOrUpdate(idea);
        getSession().flush();
        return idea;
    }		
}
