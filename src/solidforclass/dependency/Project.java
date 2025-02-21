package solidforclass.dependency;

public class Project {
    public DeveloperInterface developerInterface;
    Project(DeveloperInterface developerInterface){
        this.developerInterface = developerInterface;
    }
}
