package RelationshipsInUMLDiagrams;

// Interface (Abstract definition)
interface Animals {
    void eat();   // Abstract method
    void sleep(); // Abstract method
}

// Class realizing the interface
class Dogs implements Animals {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

// Another class realizing the interface
class Cat implements Animals {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

// Main class
public class Realization {
    public static void main(String[] args) {
        Animals dog = new Dogs(); // Realization through implementation
        dog.eat();
        dog.sleep();

        Animals cat = new Cat(); // Realization through implementation
        cat.eat();
        cat.sleep();
    }
}

