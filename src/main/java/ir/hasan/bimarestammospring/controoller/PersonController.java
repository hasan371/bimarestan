package ir.hasan.bimarestammospring.controoller;

import ir.hasan.bimarestammospring.model.PersonEntity;
import ir.hasan.bimarestammospring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/p1")
    public Object getAllPeople(@RequestParam(required = false) String id) {
        if (id != null ) {

            return personRepository.findById(id);
        } else {
            List<PersonEntity> people = new ArrayList<>();
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
    public String deletePerson(@PathVariable String id) {
        personRepository.deleteById(id);
        return "deleted";
    }



}
