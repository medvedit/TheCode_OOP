package org.medwed_sa.Seminar.HomeWork.view.comands;


import org.medwed_sa.Seminar.HomeWork.view.View;

public class NoSortedList extends Command {

    public NoSortedList(View view) {
        super(view, "Неотсортированный список");
    }

    @Override
    public void execute() {
        getView().noSortedList();
    }
}
