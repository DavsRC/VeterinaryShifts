package com.sofka.employee;

import java.util.ArrayList;

public class Doctor extends Employee{


    public Doctor(String name, String surname, int workday){
        this.name = name;
        this.surname = surname;
        setSchedule(workday);
    }


    protected void setSchedule(int workday){
        switch (workday){
            case 1: {

                Schedule schedule1 =  new Schedule(1,"8 AM", "7 PM");
                Schedule schedule2 =  new Schedule(2,"8 AM", "7 PM");
                Schedule schedule3 =  new Schedule(3,"8 AM", "7 PM");

                this.schedules.add(schedule1);
                this.schedules.add(schedule2);
                this.schedules.add(schedule3);
                break;

            }
            case 2:{
                Schedule schedule4 =  new Schedule(4,"8 AM", "7 PM");
                Schedule schedule5 =  new Schedule(5,"8 AM", "7 PM");
                Schedule schedule6 =  new Schedule(6,"9 AM", "3 PM");

                this.schedules.add(schedule4);
                this.schedules.add(schedule5);
                this.schedules.add(schedule6);
                break;
            }
        }
    }

}
