package ir.hasan.bimarestammospring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Online_users {
    @Id
    private int id;
    private  String session1;
    private String time1;
    private String day1;
    public String getSession1() {
        return session1;
    }

    public void setSession1(String session1) {
        this.session1 = session1;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getDay1() {
        return day1;
    }

    public void setDay1(String day1) {
        this.day1 = day1;
    }




}
