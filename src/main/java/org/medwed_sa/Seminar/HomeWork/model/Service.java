package org.medwed_sa.Seminar.HomeWork.model;


import org.medwed_sa.Seminar.HomeWork.model.familyTree.FamilyTree;
import org.medwed_sa.Seminar.HomeWork.model.human.Gender;
import org.medwed_sa.Seminar.HomeWork.model.human.Human;
import org.medwed_sa.Seminar.HomeWork.model.save.Writable;

import java.time.LocalDate;

public class Service {
    private FamilyTree<Human> activeTree;
    private Writable<FamilyTree<Human>> writable;

    public Service(Writable<FamilyTree<Human>> writable) {
        this.writable = writable;
        activeTree = new FamilyTree<>();
    }


    public boolean saveFile(String filePath) {
        if (writable == null) {
            return false;
        }
        return writable.saveFile(activeTree, filePath);
    }

    public boolean readFile(String filePath) {
        FamilyTree<Human> tempTree = new FamilyTree<>();
        tempTree = writable.readFile(filePath);
        if (writable == null) {
            return false;
        }
        activeTree = tempTree;
        return true;
    }

    public String addHuman(String name, String genderString, String birthDate){
        Gender gender = Gender.valueOf(genderString);
        LocalDate humanBirthDate = LocalDate.parse(birthDate);
        Human human = new Human(name, gender, humanBirthDate);
        activeTree.addHuman(human);
        return "Человек успешно добавлен в дерево";
    }

    public void sortByFirstName() {
        activeTree.sortByFirstName();
    }

    public void sortByAge() {
        activeTree.sortByAge();
    }

    public void sortById() {
        activeTree.sortById();
    }

    public String getHumanList() {
        return activeTree.getInfo();
    }

    public void setParent(int person_id, int parent_id){
        Human human = activeTree.getById(person_id);
        human.addParent(activeTree.getById(parent_id));
        activeTree.getById(parent_id).addChild(human);
    }

    public boolean checkId(int id){
        return activeTree.checkId(id);
    }
}
