package org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex005;

import java.util.Random;

class Ex003_GenericMethod {
    public static void main(String[] args) {
        System.out.println(GenericMethod.randomSelection("str1", "str2"));
        System.out.println(GenericMethod.randomSelection(100, 200));
        System.out.println(GenericMethod.randomSelection(true, false));

    }
}

class GenericMethod {
    static Random random = new Random();

    public static <T> T randomSelection(T arg1, T arg2) {
        int t = random.nextInt(2);
        return t == 0 ? arg1 : arg2;
//         var res = arg1+arg2;
    }
}
