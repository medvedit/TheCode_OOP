package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_constructor.example009_generic_constructors;

public class Main {
    public static void main(String[] args) {
        GenCons genConsDouble = new GenCons(399.7392391283D);
        GenCons genConsInt = new GenCons(34);
        GenCons genConsFloat = new GenCons(5.003F);
        GenCons genConsLong = new GenCons(9223372036854775807L);

        genConsDouble.printConsoleValue();
        genConsInt.printConsoleValue();
        genConsFloat.printConsoleValue();
        genConsLong.printConsoleValue();
    }
}
