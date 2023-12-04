package org.example.entity.service;
import java.util.ArrayList;
import java.util.List;

import org.example.interfaces.EducationalUnit;

public class DepartmentService implements EducationalUnit {
    //Composite Pattern========
    private String name;
    private List<EducationalUnit> units;
    public DepartmentService(String name) {
        this.name = name;
        this.units = new ArrayList<>();
    }
    public void addUnit(EducationalUnit unit) {
        units.add(unit);

    }

    @Override
    public void displayDetails() {
        System.out.println("Composite Pattern======== School: " + name);
        for (EducationalUnit unit : units) {
            unit.displayDetails();
        }
    }
}
