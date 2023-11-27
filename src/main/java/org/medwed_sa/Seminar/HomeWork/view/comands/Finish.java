package org.medwed_sa.Seminar.HomeWork.view.comands;


import org.medwed_sa.Seminar.HomeWork.view.View;

public class Finish extends Command {

    public Finish(View view) {
        super(view, "До новых встреч...");
    }

    @Override
    public void execute() {
        getView().finish();
    }
}
