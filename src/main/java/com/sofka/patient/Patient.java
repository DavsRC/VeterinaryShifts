package com.sofka.patient;

import java.util.Date;

public abstract class Patient {

    protected String clinicNumber;
    protected String name;
    protected String breed;
    protected Owner owner;
    protected boolean isVaccinated;
    protected Date desparasitationDate;

    protected String generateNumber(){
        return null;
    }

}
