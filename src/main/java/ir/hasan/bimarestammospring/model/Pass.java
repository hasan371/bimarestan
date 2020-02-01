package ir.hasan.bimarestammospring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pass {
    @Id
    private  int id;
    private String pass1;
    private  String user1;
    private String dastresi;
    private String name1;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPass1() {
        return pass1;
    }

    public void setPass1(String pass1) {
        this.pass1 = pass1;
    }

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getDastresi() {
        return dastresi;
    }

    public void setDastresi(String dastresi) {
        this.dastresi = dastresi;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
}
