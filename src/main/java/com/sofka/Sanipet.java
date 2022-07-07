package com.sofka;

import com.sofka.employee.Doctor;
import com.sofka.employee.Schedule;
import com.sofka.employee.Stylist;

public class Sanipet {
    public static void main(String[] args) {

        Schedule schedule = new Schedule(1,"8 am", "7 pm");
        System.out.println(  schedule.getDay() +" " + schedule.getEntranceHour()+" " +
                schedule.getOutHour());

        System.out.println("------------------------------------");
        Doctor doctor = new Doctor("Davinson", "Rincon", 1);
        System.out.println(doctor.getName() + " "+ doctor.getSurname());
        doctor.getSchedules();
        System.out.println("*****************");

        System.out.println("*****************");
        Doctor doctor2 = new Doctor("Mateo", "Minota", 2);
        System.out.println(doctor2.getName() + " "+ doctor2.getSurname());
        doctor2.getSchedules();

        System.out.println("*****************");

        System.out.println("*****************");
        Stylist stylist = new Stylist("Jessica", "Perez");
        System.out.println(stylist.getName()+" "+stylist.getSurname());
        stylist.getSchedules();

        System.out.println("*****************");

    }
}
