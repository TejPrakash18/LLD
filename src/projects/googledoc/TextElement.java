package projects.googledoc;

public class TextElement implements DocumentElement {
    private final String text;

    public TextElement(String text){
        this.text = text;
    }

    public String render() {
        return text +"\n";
    }
}
