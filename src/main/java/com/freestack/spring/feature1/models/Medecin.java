package com.freestack.spring.feature1.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private List<Reservation> agenda;

    public Medecin(){}

    public Medecin(String name){this.name = name; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Reservation> getReservations() {
        return agenda;
    }

    public void setReservations(List<Reservation> agenda) {
        this.agenda = agenda;
    }
}
