package org.medwed_sa.Seminar.HomeWork.presenter;

import org.medwed_sa.Seminar.HomeWork.model.service.Service;
import org.medwed_sa.Seminar.HomeWork.model.save.FileHandler;
import org.medwed_sa.Seminar.HomeWork.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service(new FileHandler<>());
    }

    public void addHuman(String name, String gender, String birthDate) {
        String answer = service.addHuman(name, gender, birthDate);
        view.printAnswer(answer);
    }

    public void setParent(int personId, int parentId){
        service.setParent(personId, parentId);
    }

    public void getHumanList() {
        String answer = service.getHumanList();
        view.printAnswer(answer);
    }

    public void sortByName() {
        service.sortByFirstName();
        getHumanList();

    }

    public void sortByAge() {
        service.sortByAge();
        getHumanList();
    }

    public void sortById() {
        service.sortById();
        getHumanList();
    }

    public boolean readFile(String filePath) {
        return service.readFile(filePath);
    }

    public boolean saveFile(String filePath) {
        return service.saveFile(filePath);
    }

}
