package org.medwed_sa.Seminar.HomeWork.view.comands;


import org.medwed_sa.Seminar.HomeWork.view.View;

public class GetHumanList extends Command {

    public GetHumanList(View view) {
        super(view, "Получить список людей:");
    }

    @Override
    public void execute() {
        getView().getHumanList();
    }
}
