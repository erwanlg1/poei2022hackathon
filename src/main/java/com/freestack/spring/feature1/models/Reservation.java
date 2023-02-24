package com.freestack.spring.feature1.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int durée;

    private LocalDateTime creneau;

    public Reservation(){}

    public Reservation(int durée, LocalDateTime creneau){
        this.durée = durée;
        this.creneau = creneau;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDurée() {
        return durée;
    }

    public void setDurée(int durée) {
        this.durée = durée;
    }

    public LocalDateTime getCreneau() {
        return creneau;
    }

    public void setCreneau(LocalDateTime creneau) {
        this.creneau = creneau;
    }
}
