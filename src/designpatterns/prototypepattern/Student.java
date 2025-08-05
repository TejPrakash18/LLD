package prototypepattern;

public class Student implements Prototype{
    private int id;
    private String rollNumber;
    private String name;
    private String address;


    Student(){}

    Student(int id, String rollNumber, String name, String address){
        this.id = id;
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
    }
    @Override
    public Prototype clone() {
        return new Student(id, rollNumber, name, address);
    }

    @Override
    public String toString(){
        return "id = "+ id + ", roll number = "+ rollNumber + ", name = "+ name + ", addres = "+address;
    }
}
