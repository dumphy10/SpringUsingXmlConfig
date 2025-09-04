package org.aadi;

public class Alien {


    private int age;

    public void code(){
        System.out.println("Coding");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Alien() {
        System.out.println("Alien Object created");
    }
}
