package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example001_T;

public class Main {
    public static void main(String[] args) {
        Gen<Integer> iGen = new Gen<>(66);
        iGen.chowType();
        var x = iGen.getValue();
        System.out.printf("Значением является %s; типом %S\n\n", x, x.getClass().getSimpleName());

        Gen<String> strGen = new Gen<>("Hello");
        strGen.chowType();
        var y = strGen.getValue();
        System.out.printf("Значением является %s; типом %S\n\n", y, y.getClass().getSimpleName());

//        iGen = new Gen<>(77); // Замена значения через новый экземпляр
        iGen.setValue(88); // Замена через сеттер
        System.out.println(iGen); // Вывод в консоль через переопределенный toString
        System.out.println(strGen); // Вывод в консоль через переопределенный toString

//        iGen = new Gen<>(33.7); // Ошибка
//        iGen = strGen; // Ошибка
    }
}
