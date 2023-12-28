package gr.hua.dit.ds.demo2.rest;

import gr.hua.dit.ds.demo2.dao.RequestDAO;
import gr.hua.dit.ds.demo2.entity.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/request")
public class RequestRestController {

    @Autowired
    private RequestDAO requestDao;

    @GetMapping("")
    public List<Request> getRequests(){
        return requestDao.getRequests();
    }

    @PostMapping("")
    public Request saveSRequest(@RequestBody  Request request){
        return requestDao.saveRequest(request);
    }

}
