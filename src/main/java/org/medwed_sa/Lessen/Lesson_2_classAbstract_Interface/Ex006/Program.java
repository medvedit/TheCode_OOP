package org.medwed_sa.Lessen.Lesson_2_classAbstract_Interface.Ex006;


import org.medwed_sa.Lessen.Lesson_2_classAbstract_Interface.Ex006.Applications.Notepad;
import org.medwed_sa.Lessen.Lesson_2_classAbstract_Interface.Ex006.Format.Json;
import org.medwed_sa.Lessen.Lesson_2_classAbstract_Interface.Ex006.Format.Md;
import org.medwed_sa.Lessen.Lesson_2_classAbstract_Interface.Ex006.Format.Txt;

public class Program {
    public static void main(String[] args) {

        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("src/main/java/org/medwed_sa/Lessen/Lesson_2_classAbstract_Interface/Ex006/File/file1",
                new Txt());
        notes.SaveAs("src/main/java/org/medwed_sa/Lessen/Lesson_2_classAbstract_Interface/Ex006/File/file2",
                new Md());
        notes.SaveAs("src/main/java/org/medwed_sa/Lessen/Lesson_2_classAbstract_Interface/Ex006/File/file3",
                new Json());

    }
}
