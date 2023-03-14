package br.com.erudio.foo.services;

import br.com.erudio.foo.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {
    private final AtomicLong counter = new AtomicLong();

    public Person create(Person person){
        return person;
    }

    public Person update(String id, Person person){

        return person;
    }

    public  void delete(String id){

    }


    public Person findById(String id) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstname("Thallis");
        person.setLastName("Ferreira");
        person.setAdress("Estrada do Morro da conceição 395 - Recipe/PE");
        person.setGender("M");

        return person;
    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
            return persons;
    }



    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstname("Algum nome" + i);
        person.setLastName("Algum sobrenome");
        person.setAdress("Algum endereço");
        person.setGender("Male");
        return person;
    }
}
