package gr.hua.dit.ds.demo2.dao;

import gr.hua.dit.ds.demo2.entity.Request;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RequestDAOlmpl implements RequestDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Request> getRequests() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Request> query = currentSession.createQuery("from Request", Request.class);

        List<Request> requests = query.getResultList();

        return requests;

    }

    @Override
    public Request saveRequest(Request request) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.save(request);

        return request;
    }

    @Override
    public Request getRequests(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Request request =currentSession.get(Request.class, id);
        return request;
    }

}
