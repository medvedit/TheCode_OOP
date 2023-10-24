package org.medwed_sa.Seminar.HomeWork;

import org.medwed_sa.Seminar.HomeWork.familyTree.FamilyTree;
import org.medwed_sa.Seminar.HomeWork.human.Gender;
import org.medwed_sa.Seminar.HomeWork.human.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FamilyTree first = new FamilyTree("New");

        Human oleg = new Human("Олег", Gender.Male,
                LocalDate.of(1988, 3, 5));
        Human irina = new Human("Ирина", Gender.Female,
                LocalDate.of(1993, 12, 11));

        System.out.println(oleg.toString());

        Human varvara = new Human("Кристина", Gender.Female,
                LocalDate.of(2010, 6, 15), oleg, irina);
        Human evgeniy = new Human("Евгений", Gender.Male,
                LocalDate.of(2015, 5, 12), oleg, irina);

        first.addHuman(oleg);
        first.addHuman(oleg); // Выдает сообщение о не возможности добавить человека.
        first.addHuman(irina);
        first.addHuman(varvara);
        first.addHuman(evgeniy);

        System.out.println(first.toString());


        System.out.println(oleg.getFindInfoAboutChildren());
        System.out.println(oleg.getBirthDate());
        System.out.println(evgeniy.getFindMotherName());
        System.out.println(evgeniy.getFindFatherName());
        System.out.println(evgeniy.getFather());

    }
}
