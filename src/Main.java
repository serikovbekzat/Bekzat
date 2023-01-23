package com.company;

public class Student extends Person{
    private double gpa;

    //getter = accessors
    //setter = mutators

    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void eat() {
        System.out.println("Eating junk food");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping not well, because of the exams");
    }

    @Override
    public String toString() {
        return getId() + ": " + getName() + " " +getSurname() + " - " + gpa;
    }
}