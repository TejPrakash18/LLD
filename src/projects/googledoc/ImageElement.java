package projects.googledoc;

public class ImageElement implements DocumentElement{

    private final String path;

    public ImageElement(String path){
        this.path = path;
    }

    @Override
    public String render() {
        return path + "\n";
    }
}
