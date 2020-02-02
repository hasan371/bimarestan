package ir.hasan.bimarestammospring.controoller;
import ir.hasan.bimarestammospring.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

@Autowired
  private   LoginRepository loginRepository;



}
