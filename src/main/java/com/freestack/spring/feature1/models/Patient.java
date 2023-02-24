package com.freestack.spring.feature1.models;

import org.example.Medecin;
import org.example.Reservation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public  class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private List<Reservation> reservation;

    private List<Medecin> medecins;

    public Patient(){}

    public Patient(String name){
        this.name = name;
    }

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

    public List<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }

    public List<Medecin> getMedecins() {
        return medecins;
    }

    public void setMedecins(List<Medecin> medecins) {
        this.medecins = medecins;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Patient{");
        sb.append(" id=").append(id);
        sb.append(", name=").append(name).append('\'');
        sb.append(", reservation=").append(reservation).append('\'');
        sb.append(", medecins=").append(medecins).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
