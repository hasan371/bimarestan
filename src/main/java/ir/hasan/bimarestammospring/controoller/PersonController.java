package ir.hasan.bimarestammospring.controoller;

import ir.hasan.bimarestammospring.model.PersonEntity;
import ir.hasan.bimarestammospring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<PersonEntity> getAllPeople(@RequestParam(required = false) String firstName) {
        if (firstName != null ) {
            return personRepository.findByFirstName(firstName);
        } else {
            List<PersonEntity> people = new ArrayList<>();
            personRepository.findAll().forEach(people::add);
            return people;
        }
    }

    @GetMapping("/{id}")
    public PersonEntity getPerson(@PathVariable String id) {
        Optional<PersonEntity> personOptional = personRepository.findById(id);
        if (personOptional.isPresent()) {
            return personOptional.get();
        } else {
            throw new RuntimeException("Person not found");
        }
    }

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
