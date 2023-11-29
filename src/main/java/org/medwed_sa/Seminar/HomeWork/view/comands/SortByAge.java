package org.medwed_sa.Seminar.HomeWork.view.comands;


import org.medwed_sa.Seminar.HomeWork.view.View;

public class SortByAge extends Command {

    public SortByAge(View view) {
        super(view, "Отсортировать список по возрасту...");
    }

    public void execute() {
        getView().sortByAge();
    }
}
