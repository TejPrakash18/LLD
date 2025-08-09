package projects.googledoc;

public class NewLine implements DocumentElement{

    private String newLine;

    public NewLine(String newLine){
        this.newLine = newLine;
    }

    @Override
    public String render() {
        return newLine;
    }
}
