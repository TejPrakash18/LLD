package projects.googledoc;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        Persistence saveToFile = new SaveToFile("./src/projects/googledoc/output.txt");

        DocumentEditor documentEditor = new DocumentEditor(doc, saveToFile);

        documentEditor.addText("Hello Tej....!!");
        documentEditor.addImage("/images/java.png");

        documentEditor.renderDoc();
        documentEditor.save();

    }
}
