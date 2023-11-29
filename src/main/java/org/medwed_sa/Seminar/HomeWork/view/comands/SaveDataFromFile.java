package org.medwed_sa.Seminar.HomeWork.view.comands;


import org.medwed_sa.Seminar.HomeWork.view.View;

public class SaveDataFromFile extends Command{


    public SaveDataFromFile(View view) {
        super(view, "Сохранить дерево в файл...");
    }

    @Override
    public void execute() {
        getView().saveDataFromFile();

    }
}
