package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_metchod.ecxample007_method_overriding;

public class Main {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen2<Integer> iOb2 = new Gen2<>(99);
        Gen2<String> strOb = new Gen2<>("привет");

        System.out.println(iOb.getVol());
        System.out.println(iOb2.getVol());
        System.out.println(strOb.getVol());

        /*
           Как подтверждает вывод, для объектов типа Gen2 вызывается переопределенная версия getVol(),
            но для объектов типа Gen вызывается версия getVol() из суперкласса.
         */
    }
}
