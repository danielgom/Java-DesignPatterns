package com.github.designpatterns.structural.composite;

import java.io.FilterInputStream;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Supervisor deanOfTech = new Supervisor("Dr. Mike", "Dean of Tech");
        Supervisor chairOfMath = new Supervisor("Dr. John", "Chair of Math");
        Supervisor chairOfCs = new Supervisor("Dr. Ian", "Chair of CS");

        Professor drSteve = new Professor("Dr. Steve", "MathProfessor1", 100);
        Professor drJane = new Professor("Dr. Jane", "MathProfessor2", 101);

        Professor drBob = new Professor("Dr. Bob", "CSProfessor1", 102);
        Professor drSue = new Professor("Dr. Sue", "CSProfessor2", 103);

        deanOfTech.add(chairOfMath);
        deanOfTech.add(chairOfCs);

        // Professors of maths report to a chair of maths
        chairOfMath.add(drSteve);
        chairOfMath.add(drJane);

        // Professors of cs report to a chair of cs
        chairOfCs.add(drBob);
        chairOfCs.add(drSue);

        System.out.println(deanOfTech.getDetails());


        List<Faculty> chairs = deanOfTech.getMyFaculty();
        for (Faculty chair : chairs) {
            System.out.println(chair.getDetails());
        }

        List<Faculty> professors = chairOfMath.getMyFaculty();
        for (Faculty professor : professors) {
            System.out.println(professor.getDetails());
        }

        List<Faculty> csProfessors = chairOfCs.getMyFaculty();
        for (Faculty professor : csProfessors) {
            System.out.println(professor.getDetails());
        }

        chairOfCs.remove(drSue);
        System.out.println("Dr sue is removed from the chair of cs");

        List<Faculty> csFaculty = chairOfCs.getMyFaculty();
        for (Faculty faculty : csFaculty) {
            System.out.println(faculty.getDetails());
        }
    }
}
