package org.medwed_sa.Seminar.HomeWork.view.comands;


import org.medwed_sa.Seminar.HomeWork.view.View;

public class AddHuman extends Command {

    public AddHuman(View view) {
        super(view, "Добавить человека:");
    }

    @Override
    public void execute() {
        getView().addHuman();
    }
}
