package gr.hua.dit.ds.demo2.entity;

import jakarta.persistence.*;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer Id;

    @Column
    private String appoinment_date;

    public Request(Integer id, String appoinment_date) {
        this.Id = id;
        this.appoinment_date = appoinment_date;
    }

    public Request(){
    }

    public Integer getId() {
        return Id;
    }

    public String getAppoinment_date() {
        return appoinment_date;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setAppoinment_date(String appoinment_date) {
        this.appoinment_date = appoinment_date;
    }

    @Override
    public String toString(){
        return "Request{" +
                "id=" + Id +
                ", appoinment date=" + appoinment_date + '\'' +
                '}';
    }

}
