package com.github.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {
    private String name;
    private String deptName;

    private List<Faculty> facultyList;

    public Supervisor(String name, String deptName) {
        this.name = name;
        this.deptName = deptName;
        this.facultyList = new ArrayList<>();
    }

    public void add(Faculty professor) {
        facultyList.add(professor);
    }

    public void remove(Faculty professor) {
        facultyList.remove(professor);
    }

    public List<Faculty> getMyFaculty() {
        return facultyList;
    }

    @Override
    public String getDetails() {
        return name + " is a " + deptName + " and has " + facultyList.size() + " faculty members";
    }
}
