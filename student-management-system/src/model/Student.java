package model;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setID(int newID){
        this.id = newID;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    @Override
    public String toString(){
        return "ID: " + id + ",Name: " + name + ",Age: " + age;
    }
}
