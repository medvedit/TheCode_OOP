package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_restrictions.no_generics_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] num = {1, 3, 5, 6, 99};
        Gen<Integer> iObg = new Gen<>(50, num);

        Gen<?>[] iArr = new Gen<?>[10];
        System.out.println(Arrays.stream(iArr).toList());

//        Невозможно создать массив обобщенных ссыпок для конкретного типа.
//        Gen<Integer>[] xArr = new Gen<Integer>[10]; // Так нельзя!!!
    }
}
