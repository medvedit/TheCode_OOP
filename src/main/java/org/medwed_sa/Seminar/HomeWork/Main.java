package org.medwed_sa.Seminar.HomeWork;


import org.medwed_sa.Seminar.HomeWork.model.familyTree.FamilyTree;
import org.medwed_sa.Seminar.HomeWork.model.human.Gender;
import org.medwed_sa.Seminar.HomeWork.model.human.Human;
import org.medwed_sa.Seminar.HomeWork.model.save.FileHandler;
import org.medwed_sa.Seminar.HomeWork.view.Console;
import org.medwed_sa.Seminar.HomeWork.view.View;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//
//        FamilyTree<Human> familyTreeList = getFamilyTreeTest();
//
//
//        save(familyTreeList);
//        System.out.println(familyTreeList);
//        FamilyTree<Human> familyTreeRead = read();
//
//
//        System.out.println(getHumanListInfoIterator(familyTreeRead));
//
//        familyTreeRead.sortByFirstName();
//        System.out.println(familyTreeRead);
//        familyTreeRead.sortByAge();
//        System.out.println(familyTreeRead);

        View view = new Console();
        view.start();



    }


//    private static String getHumanListInfoIterator(FamilyTree<Human> familyList) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Список семейного древа через iterator:\n");
//        for (Human human : familyList) {
//            sb.append(human);
//            sb.append("\n");
//        }
//        return sb.toString();
//    }

    private static FamilyTree<Human> read() {
        FileHandler<Human> fileHandler = new FileHandler<>();
        return fileHandler.readFile(new FileHandler<Human>().getFilePath());
    }
    private static void save(FamilyTree<Human> familyTreeForPreservation) {
        FileHandler<Human> fileHandler = new FileHandler<>();
        fileHandler.saveFile(familyTreeForPreservation, fileHandler.getFilePath());
    }


    private static FamilyTree<Human> getFamilyTreeTest() {

        FamilyTree<Human> familyTree = new FamilyTree<>("Ивановы");

        Human oleg = new Human("Олег", Gender.Male,
                LocalDate.of(1988, 3, 5));
        Human irina = new Human("Ирина", Gender.Female,
                LocalDate.of(1993, 12, 11));

//        System.out.println(oleg.toString());

        Human varvara = new Human("Кристина", Gender.Female,
                LocalDate.of(2020, 6, 15), oleg, irina);
        Human evgeniy = new Human("Евгений", Gender.Male,
                LocalDate.of(2018, 5, 12), oleg, irina);

        familyTree.addHuman(oleg);
//        familyTree.addHuman(oleg); // Выдает сообщение о не возможности добавить человека.
        familyTree.addHuman(irina);

//        familyTree.setWedding(oleg.getId(), irina.getId());
        familyTree.setWedding(oleg, irina);


        familyTree.addHuman(varvara);
        familyTree.addHuman(evgeniy);

        Human larisa = new Human("Лариса", Gender.Female,
                LocalDate.of(1955, 9, 1));

        larisa.addChild(oleg);

//        System.out.println(larisa);
        familyTree.addHuman(larisa);


//        System.out.println(oleg.getFindInfoAboutChildren());
//        System.out.println(oleg.getBirthDate());
//        System.out.println(evgeniy.getFindMotherName());
//        System.out.println(evgeniy.getFindFatherName());
//        System.out.println(evgeniy.getFather());
//        System.out.println(larisa.getAge());
//        System.out.println(familyTree.getById(4));
//        System.out.println(familyTree.getSiblings(3));
//        System.out.println(familyTree.getByFirstName(irina.getFirstName()));


        return familyTree;
    }

}
