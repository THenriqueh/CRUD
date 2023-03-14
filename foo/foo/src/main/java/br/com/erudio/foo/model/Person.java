package br.com.erudio.foo.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

    private Long id;
    private String firstname;
    private String lastName;
    private String adress;
    private String gender;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId().equals(person.getId()) && getFirstname().equals(person.getFirstname()) && getLastName().equals(person.getLastName()) && getAdress().equals(person.getAdress()) && getGender().equals(person.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstname(), getLastName(), getAdress(), getGender());
    }


}
