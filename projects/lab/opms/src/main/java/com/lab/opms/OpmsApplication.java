package com.lab.opms;

import com.lab.opms.patient.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class OpmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpmsApplication.class, args);
    }

    @GetMapping
    public List<Patient> hello() {
        return List.of(new Patient(1234L, "Rakesh", "Radharamanan", LocalDate.of(1982, Month.MARCH, 15), 40));
    }

}
