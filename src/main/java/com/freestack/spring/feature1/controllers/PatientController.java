package com.freestack.spring.feature1.controllers;

import com.freestack.spring.feature1.models.Patient;
import org.example.Medecin;
import org.example.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private Patient patient;

    public PatientController(Patient patient){this.patient = patient;}

    @GetMapping("/reservations")
    public List<Reservation> getReservation(){return this.patient.getReservation();}

    @GetMapping("/medecins")
    public List<Medecin> getMedecins(){return this.patient.getMedecins();}
}
