package gr.hua.dit.ds.demo2.dao;

import gr.hua.dit.ds.demo2.entity.Request;

import java.util.List;

public interface RequestDAO {

    public List<Request> getRequests();

    public Request saveRequest(Request request);

    public Request getRequests(int id);

}
