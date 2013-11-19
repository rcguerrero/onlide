package es.upm.muss.agile.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import es.upm.muss.agile.dao.hibernate.GenericDaoHibernate;
import es.upm.muss.agile.model.User;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class GenericDaoTest extends BaseDaoTestCase {
    Log log = LogFactory.getLog(GenericDaoTest.class);
    GenericDao<User, Long> genericDao;
    @Autowired
    SessionFactory sessionFactory;

    @Before
    public void setUp() {
        genericDao = new GenericDaoHibernate<User, Long>(User.class, sessionFactory);
    }

    @Test
    public void getUser() {
        User user = genericDao.get(-1L);
        assertNotNull(user);
        assertEquals("user", user.getUsername());
    }
}
