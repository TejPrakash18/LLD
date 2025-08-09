package projects.googledoc;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        Persistence saveToFile = new SaveToFile("./src/projects/googledoc/output.txt");

        DocumentEditor documentEditor = new DocumentEditor(doc, saveToFile);

        documentEditor.addText("Hello Tej....!!");
        documentEditor.addNewLine("\n");
        documentEditor.addImage("/images/java.png");
        documentEditor.addTab("\t");
        documentEditor.addText("Hello, Happy day");
        documentEditor.addNewLine("\n");
        documentEditor.addText("Java is the best programming language for learn System Design");

        documentEditor.renderDoc();
        documentEditor.save();

    }
}
