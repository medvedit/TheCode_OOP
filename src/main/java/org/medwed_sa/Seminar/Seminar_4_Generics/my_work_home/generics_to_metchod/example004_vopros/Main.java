package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_metchod.example004_vopros;


import static org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_metchod.example004_vopros.Gen.saveAvg;

public class Main {
    public static void main(String[] args) {
        Integer[] iArr = {1, 2, 3, 4, 5};
        Gen<Integer> iGen = new Gen<>(iArr);
        double iVol = iGen.getAverage();
        System.out.printf("%s -> среднее значение ровно %s\n", iGen ,iVol);


        Double[] dArr = {1.1, 2.2, 3.3, 4.4, 5.5};
        Gen<Double> dGen = new Gen<>(dArr);
        double dVol = dGen.getAverage();
        System.out.printf("%s -> среднее значение ровно %s\n", dGen ,dVol);


        Float[] fArr = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Gen<Float> fGen = new Gen<>(fArr);
        double fVol = fGen.getAverage();
        System.out.printf("%s -> среднее значение ровно %s\n", fGen ,iVol);

        System.out.println();

        System.out.println(saveAvg(iGen, dGen));
        System.out.println(saveAvg(dGen, fGen));
        System.out.println(saveAvg(fGen, iGen));

    }


}
