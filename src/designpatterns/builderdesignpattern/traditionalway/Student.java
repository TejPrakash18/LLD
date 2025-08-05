package builderdesignpattern.traditionalway;

import builderdesignpattern.CarBuilder;

public class Student {
    private int id;
    private String rollNo;
    private String name;
    private String course;
    private String email;
    private String phoneNo;
    private String address;

     private Student(StudentBuilder studentBuilder){
        this.id = studentBuilder.id;
        this.rollNo = studentBuilder.rollNo;
        this.name = studentBuilder.name;
        this.course = studentBuilder.course;
        this.email = studentBuilder.email;
        this.phoneNo = studentBuilder.phoneNo;
        this.address = studentBuilder.address;
    }

    @Override
    public String toString(){
        return "Student [id= "+ id +", roll no= "+ rollNo +", name= "+ name +", course= " + course +", email= " + email + ", phone= " + phoneNo +", Address= " + address +"]";
    }

    public static class StudentBuilder{

        private int id;
        private String rollNo;
        private String name;
        private String course;
        private String email;
        private String phoneNo;
        private String address;

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setRollNo(String rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
