package solidforclass.dependency;

public class Driver {
    public static void main(String[] args) {
        DeveloperInterface nodejs = new NodeJsDeveloper();
        Project project = new Project(nodejs);
        nodejs.develop();

        DeveloperInterface java = new javaDeveloper();
        Project project1 = new Project(java);
        java.develop();

    }
}
