package gr.hua.dit.ds.demo2.controller;

import gr.hua.dit.ds.demo2.dao.RequestDAO;
import gr.hua.dit.ds.demo2.entity.Request;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("request")
public class RequestController {

    @Autowired
    private RequestDAO requestDAO;
    private List<Request> requests = new ArrayList<Request>();

    @PostConstruct
    public void setup() {
        Request Stud1= new Request(1, "dfgdfg");
        Request Stud2= new Request(1, "dfgdfg");
        Request Stud3= new Request(1, "dfgdfg");
        requests.add(Stud1);
        requests.add(Stud2);
        requests.add(Stud3);
    }

    @GetMapping("")
    public String showRequests(Model model){


        model.addAttribute("requests", requestDAO.getRequests());

        return "requests";
    }

    @GetMapping("/{id}")
    public String showRequest(@PathVariable Integer id, Model model){
        Request request = requestDAO.getRequests(id);
        model.addAttribute("requests", request);
        return "requests";
    }

    @GetMapping("/new")
    public String addRequest(Model model){
        Request request = new Request();
        model.addAttribute("request", request);

        return "add_request";

    }

    @PostMapping("/new")
    public String saveRequest(@ModelAttribute("request") Request request, Model model) {
        requestDAO.saveRequest(request);
        model.addAttribute("students", requestDAO.getRequests());
        return "students";
    }

}
