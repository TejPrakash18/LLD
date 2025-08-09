package projects.googledoc;

public class DocumentEditor {

    private final Document document;
    private final Persistence persistence;

    public DocumentEditor(Document document, Persistence persistence){
        this.document = document;
        this.persistence = persistence;
    }

    public void addText(String text){
        document.addElement(new TextElement(text));
    }

    public void addImage(String filePath){
        document.addElement(new ImageElement(filePath));
    }

    public void addTab(String tab){
        document.addElement(new TabElement(tab));
    }
    public void addNewLine(String newLine){
        document.addElement(new NewLine(newLine));
    }
    public void save(){
        persistence.save(document);
    }

    public void renderDoc() {
        System.out.println(document.render());
    }

}
