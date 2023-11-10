package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_interface.example008_generic_interfaces;

import org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_interface.example008_generic_interfaces.my_class.MyClass;

public class Main {
    public static void main(String[] args) {
         Integer[] iArr = {126, 395, 737, 465, 117, 112, 797, 93};
         String[] strArr = {"кроватка", "ясень", "щека", "луковица", "носорог"};

        MyClass<Integer> myClass = new MyClass<>(iArr);
        MyClass<String> myClass1 = new MyClass<>(strArr);

        System.out.printf("Max значение %s -> %s\n", iArr.getClass().getSimpleName() ,myClass.max());
        System.out.printf("Min значение %s -> %s\n", iArr.getClass().getSimpleName() ,myClass.min());
        System.out.printf("Max значение %s -> %s\n", strArr.getClass().getSimpleName() ,myClass1.max());
        System.out.printf("Min значение %s -> %s\n", strArr.getClass().getSimpleName() ,myClass1.min());

    }
}
