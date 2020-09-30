package ir.hasan.bimarestammospring.controoller;

import ir.hasan.bimarestammospring.model.PersonEntity;
import ir.hasan.bimarestammospring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import java.util.List;


@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;



    @PostMapping("/p1")
    public Object getAllPeople(@RequestParam(required = false) String id, String firstName) {
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); // Strength set as 16
//        String encodedPassword = encoder.encode(firstName);

        if (id != null) {

//            if(   personRepository.findById(id).isPresent())
//            {
////                if(encoder.matches(firstName,personRepository.findById(id).get().getFirstName()))
////                {
////
////                    return 2;
////                }
////                else
////
////                {
////                    return 5;
////                }
//                personRepository.findById(id);
//
//            }
            System.out.println(id+"-"+firstName);
            return  personRepository.findById(id);

        } else {
            List people = new ArrayList();
            personRepository.findAll().forEach(people::add);
            return people;
        }

    }
  
//    @GetMapping("/{id}")
//    public PersonEntity getPerson(@PathVariable String id) {
//        Optional<PersonEntity> personOptional = personRepository.findById(id);
//        if (personOptional.isPresent()) {
//            return personOptional.get();
//        } else {
//            throw new RuntimeException("Person not found");
//        }
//    }

    @PostMapping
    public PersonEntity savePersonEntity(@RequestBody PersonEntity personEntity) {
        return personRepository.save(personEntity);
    }

    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable String id)  {
try {
    personRepository.deleteById(id);
    return "deleted";
}catch (Exception e)
{
    return e.getMessage() + "fgfgfgggfg";
}

    }



}
