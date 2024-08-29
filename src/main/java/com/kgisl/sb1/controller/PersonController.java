package com.kgisl.sb1.controller;
import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import com.kgisl.sb1.entity.Person;
import com.kgisl.sb1.repository.PersonRepository;
 
@RestController
@RequestMapping("/persons")  // Base path for all person-related endpoints
public class PersonController {
 
    @Autowired
    private PersonRepository personRepository;
 
    // GET all persons
    @GetMapping
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
 
    // GET person by ID
    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        Optional<Person> person = personRepository.findById(id);
        return person.orElseThrow(() -> new RuntimeException("Person not found"));
    }
 
    // POST to create a new person
    @PostMapping
    public Person createPerson(@RequestBody Person newPerson) {
        return personRepository.save(newPerson);
    }
 
    // PUT to update an existing person
    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person updatedPerson) {
        return personRepository.findById(id)
                .map(person -> {
                    // Update the fields as necessary
                    return personRepository.save(new Person(id, updatedPerson.uname(), updatedPerson.email()));
                })
                .orElseThrow(() -> new RuntimeException("Person not found"));
    }
 
    // DELETE to remove a person by ID
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
    }
}