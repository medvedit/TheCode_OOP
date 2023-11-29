package org.medwed_sa.Seminar.HomeWork.view.comands;


import org.medwed_sa.Seminar.HomeWork.view.View;

public class sortById extends Command {

    public sortById(View view) {
        super(view, "Отсортировать список по ID человека...");
    }

    @Override
    public void execute() {
        getView().sortById();
    }
}
