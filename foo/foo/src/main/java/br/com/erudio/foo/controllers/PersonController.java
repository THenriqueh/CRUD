package br.com.erudio.foo.controllers;

import br.com.erudio.foo.model.Person;
import br.com.erudio.foo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)

    public Person findById(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll() {
        return service.findAll();
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    @PutMapping(value = "/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person update(@PathVariable ("id") String id, @RequestBody Person person) {
     return service.update(id, person);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") String id){
        service.delete(id);
    }


}

