package org.medwed_sa.Seminar.HomeWork.view.comands;


import org.medwed_sa.Seminar.HomeWork.view.View;

public class SetParent extends Command {


    public SetParent(View view) {
        super(view, "Установить родителя");
    }

    @Override
    public void execute() {
        getView().setParent();
    }
}
