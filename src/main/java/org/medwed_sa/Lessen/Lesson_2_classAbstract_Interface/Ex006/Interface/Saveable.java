package org.medwed_sa.Lessen.Lesson_2_classAbstract_Interface.Ex006.Interface;


import org.medwed_sa.Lessen.Lesson_2_classAbstract_Interface.Ex006.Document.TextDocument;

public interface Saveable {

    void SaveAs(TextDocument document, String path);
}
