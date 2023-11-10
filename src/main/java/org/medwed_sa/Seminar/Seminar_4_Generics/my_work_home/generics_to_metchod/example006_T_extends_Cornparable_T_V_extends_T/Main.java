package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_metchod.example006_T_extends_Cornparable_T_V_extends_T;


public class Main {
    public static void main(String[] args) {

        GenMethDemo genMethDemo = new GenMethDemo();

        Integer[] num = {1, 2, 3, 4, 5};
        String[] str = {"one", "two", "three", "four11"};
        Character[] chr = {'e', 'f', '@', '&'};

        genMethDemo.extracted(2, num);
        genMethDemo.extracted("two", str);
        genMethDemo.extracted(22, num);
        genMethDemo.extracted('f', chr);
//        extracted("Строка", num); // Не скомпилируется! Типы должны быть совместимыми.
    }
}
