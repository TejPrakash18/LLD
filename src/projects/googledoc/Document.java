package projects.googledoc;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private final List<DocumentElement> elements = new ArrayList<>();

    public void addElement(DocumentElement element){
        elements.add(element);
    }

    public String render(){
        StringBuilder sb = new StringBuilder();
        for (DocumentElement element: elements ){
            sb.append(element.render());
        }
        return sb.toString();
    }
}
