package org.medwed_sa.Seminar.HomeWork.view.comands;


import org.medwed_sa.Seminar.HomeWork.view.View;

public class ReadDataFromFile extends Command {

    public ReadDataFromFile(View view) {
        super(view, "Загрузить дерево из файла");
    }

    @Override
    public void execute() {
        getView().readDataFromFile();

    }
}
