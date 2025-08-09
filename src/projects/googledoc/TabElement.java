package projects.googledoc;

public class TabElement implements DocumentElement{
    private String tab;

    public TabElement(String tab){
        this.tab = tab;
    }

    @Override
    public String render() {
        return tab;
    }
}
