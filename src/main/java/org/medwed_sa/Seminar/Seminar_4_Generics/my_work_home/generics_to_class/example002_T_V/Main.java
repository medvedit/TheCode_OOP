package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example002_T_V;

public class Main {
    public static void main(String[] args) {
        Gen<Integer, String> exemplarGen = new Gen<>(88, "Текст. Строка");
        exemplarGen.chowType();
        var t = exemplarGen.getTObg();
        var v = exemplarGen.getVObg();

        System.out.printf("Значение типа T: %s; тип данных : %s\n", t, t.getClass().getSimpleName());
        System.out.printf("Значение типа V: %s; тип данных : %s\n", v, v.getClass().getSimpleName());

        Gen<String, String> exemplarGen2 = new Gen<>("Оба", "String");
        exemplarGen2.chowType();
    }
}
