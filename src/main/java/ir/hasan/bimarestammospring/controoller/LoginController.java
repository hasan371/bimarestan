package ir.hasan.bimarestammospring.controoller;
import ir.hasan.bimarestammospring.model.LoginEntity;

import ir.hasan.bimarestammospring.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

  @Autowired
  private LoginRepository loginRepository;

  @GetMapping
  public List<LoginEntity> getuser(@RequestParam(required = false) String user1) {
    if (user1 != null) {
      return loginRepository.findByUser1(user1);
    } else {
      List<LoginEntity> people = new ArrayList<>();
      loginRepository.findAll().forEach(people::add);
      return people;
    }
  }

  public List getUserByRoll(EntityManager entityManager, String rollNo) {

    String queryStr = "select * from PASS where PASS1 = ?1";

    Query query = entityManager.createNativeQuery(queryStr);
    query.setParameter(1, rollNo);


    return query.getResultList();

  }

}