package projects.googledoc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile implements Persistence {

    private final String filepath;

    public SaveToFile(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void save(Document document) {
        String content = document.render();
        File file = new File(filepath);

        // Ensure parent directories exist
        File parentDir = file.getParentFile();
        if (parentDir != null && !parentDir.exists()) {
            boolean created = parentDir.mkdirs();
            if (created) {
                System.out.println("Created directories: " + parentDir.getAbsolutePath());
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
            System.out.println("Document saved to file: " + filepath);
        } catch (IOException e) {
            System.out.println("Error saving document: " + e.getMessage());
        }
    }
}
