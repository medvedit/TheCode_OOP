package org.medwed_sa.Seminar.HomeWork;

import org.medwed_sa.Seminar.HomeWork.familyTree.FamilyTree;
import org.medwed_sa.Seminar.HomeWork.human.Gender;
import org.medwed_sa.Seminar.HomeWork.human.Human;
import org.medwed_sa.Seminar.HomeWork.save.FileHandlerService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FamilyTree<Human> familyTreeList = getFamilyTreeTest();

        save(familyTreeList);

        FamilyTree<Human> familyTreeRead = read();

        System.out.println(familyTreeRead);
        familyTreeRead.getByName();
        System.out.println(familyTreeRead);
        familyTreeRead.getByAge();
        System.out.println(familyTreeRead);




    }

    private static FamilyTree<Human> read(){
        FileHandlerService service = new FileHandlerService();
        return (FamilyTree) service.readFile();
    }

    private static void save(FamilyTree<Human> familyTreeForPreservation) {
        FileHandlerService service = new FileHandlerService();
        service.saveFile(familyTreeForPreservation);
    }


    private static FamilyTree<Human> getFamilyTreeTest() {

        FamilyTree<Human> familyTree = new FamilyTree<>("Test");

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
//        System.out.println(familyTree.getInfo());



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
