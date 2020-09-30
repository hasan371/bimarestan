package ir.hasan.bimarestammospring.controoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Properties;


@Controller

public class LoginController {
@Autowired
private JavaMailSender javaMailSender;

  @RequestMapping(  value = "/login" ,method = RequestMethod.GET)
  public String loginasli(@RequestParam (required = false)  String firstName) {
//      SimpleMailMessage msg = new SimpleMailMessage();
//      msg.setTo("saber100.saber100@gmail.com", "to_2@gmail.com", "to_3@yahoo.com");
//
//      msg.setSubject("Testing from Spring Boot");
//      msg.setText("Hello World \n Spring Boot Email");
//
//      javaMailSender.send(msg);

      return "asli.html";

  }
//  public List getUserByRoll(EntityManager entityManager, String rollNo) {
//
//    String queryStr = "select * from PASS where PASS1 = ?1";
//
//    Query query = entityManager.createNativeQuery(queryStr);
//    query.setParameter(1, rollNo);
//
//
//    return query.getResultList();
//
//  }


}