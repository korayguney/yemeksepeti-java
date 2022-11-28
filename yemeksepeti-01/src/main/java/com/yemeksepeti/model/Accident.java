package com.yemeksepeti.model;

import java.time.LocalDate;

public class Accident {
    private LocalDate accidentDate;

    public Accident(LocalDate accidentDate) {
        this.accidentDate = accidentDate;
    }

    public LocalDate getAccidentDate() {
        return accidentDate;
    }

    public void setAccidentDate(LocalDate accidentDate) {
        this.accidentDate = accidentDate;
    }

    @Override
    public String toString() {
        return "Accident{" +
                "accidentDate=" + accidentDate +
                '}';
    }
}
