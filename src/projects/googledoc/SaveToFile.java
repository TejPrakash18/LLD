package projects.googledoc;

import java.io.*;

public class SaveToFile implements Persistence{

    private final String filepath;

    public SaveToFile(String filepath){
        this.filepath = filepath;
    }
    @Override
    public void save(Document document) {
        String content = document.render();
        File file = new File(filepath);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write(content);
            System.out.println("Document save to file: "+ file);
        } catch (IOException e) {
            System.out.println( "Error saving document "+ e.getMessage());
        }
    }
}
