package RelationshipsInUMLDiagrams;




// Association
//Definition: A relationship between two classes that establishes a connection for interaction.
//Key Points:
//Denotes "uses-a" or "has-a" relationships.
//Represented by a solid line (------>).
//Can be unidirectional or bidirectional.
// Example: A Teacher teaches Students.



class Teacher{
    String name;

    Teacher(String name){
        this.name = name;
    }
}

class Student{
    String name;
    Teacher teacher; // Association

    Student(String name, Teacher teacher){
        this.name = name;
        this.teacher = teacher;
    }
}

public class Association {
    public static void main(String[] args) {
        System.out.println("Association...");
        Teacher teacher = new Teacher("Mr. Tej");
        Student student = new Student("Neha", teacher);
        System.out.println(student.name+" is taught by "+ student.teacher.name);
    }
}


