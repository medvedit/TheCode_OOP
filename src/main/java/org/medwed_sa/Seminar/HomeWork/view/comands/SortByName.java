package org.medwed_sa.Seminar.HomeWork.view.comands;


import org.medwed_sa.Seminar.HomeWork.view.View;

public class SortByName extends Command {

    public SortByName(View view) {
        super(view, "Отсортировать список по имени:");
    }

    public void execute() {
        getView().sortByName();
    }
}
