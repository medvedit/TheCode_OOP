package org.medwed_sa.Lessen.Lesson_2_classAbstract_Interface.Ex006.Format;

import org.medwed_sa.Lessen.Lesson_2_classAbstract_Interface.Ex006.Document.TextDocument;

import java.io.FileWriter;
import java.io.IOException;


public class Md extends TextFormat {

    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".md", false)) {
            writer.write("## <Md Format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
