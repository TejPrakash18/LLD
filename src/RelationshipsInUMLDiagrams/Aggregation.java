package RelationshipsInUMLDiagrams;


import java.util.ArrayList;
import java.util.List;

class School{
    String name;
    List<Department> departmentsList;

    School(String name){
        this.name = name;
        this.departmentsList = new ArrayList<>();
    }

    void addDepartment(Department dept){
        departmentsList.add(dept);
    }
}
class Department{
    String name;

    Department(String name){
        this.name = name;
    }
}
public class Aggregation {
    public static void main(String[] args) {
//        System.out.println("Aggregation...!");

        School gcmt =new School("GCMT");
        Department bca = new Department("BCA");
        Department bba =  new Department("BBA");

        gcmt.addDepartment(bca);
        gcmt.addDepartment(bba);

        System.out.println(gcmt.name +" has Department");

        for (Department dept : gcmt.departmentsList){
            System.out.println("-" + dept.name);
        }


        System.out.println();

        School mgp =new School("MGP");
        Department computerScience = new Department("Computer Science");
        Department electronicScience =  new Department("Electronic Science");

        mgp.addDepartment(computerScience);
        mgp.addDepartment(electronicScience);

        System.out.println(mgp.name +" has Department");

        for (Department dept : mgp.departmentsList){
            System.out.println("-" + dept.name);
        }
    }
}
