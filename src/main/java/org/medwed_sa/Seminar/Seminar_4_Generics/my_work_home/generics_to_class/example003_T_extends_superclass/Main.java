package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example003_T_extends_superclass;

public class Main {
    public static void main(String[] args) {
        Integer[] iArr = {1, 2, 3, 4, 5};
        Gen<Integer> iGen = new Gen<>(iArr);
        double iSum = iGen.getAverage();
        System.out.println(iSum);

        Double[] dArr = {1.1, 2.2, 3.3, 4.4, 5.5};
        Gen<Double> dGen = new Gen<>(dArr);
        double dSum = dGen.getAverage();
        System.out.println(dSum);

        String[] strArr = {"a", "b", "c"};
//        Gen<String> strGen = new Gen<>(strArr); // Ошибка. String не extends Number !!!
    }
}
