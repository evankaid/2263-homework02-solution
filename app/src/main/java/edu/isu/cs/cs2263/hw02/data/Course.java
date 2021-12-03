package edu.isu.cs.cs2263.hw02.data;

import lombok.Getter;
import lombok.Setter;
import lombok.val;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Course {

    public static final String[] CODES = { "CS", "CHEM", "PHYS", "MATH", "BTNY", "ZOO" };
    public static final String[] DEPTS = { "Computer Science", "Chemistry", "Physics", "Mathematics", "Botany", "Zoology" };

    private @Getter @Setter int number;
    private @Getter @Setter String name;
    private @Getter @Setter int credits;
    private @Getter @Setter String code;

    public Course() {}

    public Course(String name, String code, int number, int credits) {
        this.name = name;
        this.code = code;
        this.number = number;
        this.credits = credits;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s (%d)", code, number, name, credits);
    }




}
