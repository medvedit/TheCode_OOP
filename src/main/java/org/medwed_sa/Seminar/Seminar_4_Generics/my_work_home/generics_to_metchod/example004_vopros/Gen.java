package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_metchod.example004_vopros;

import java.util.Arrays;

public class Gen<T extends Number> {
    private T[] tObg;

    public Gen(T[] tObg) {
        this.tObg = tObg;
    }


    public double getAverage() {
        double average = 0.0;
        for (int i = 0; i < tObg.length; i++) {
            average += tObg[i].doubleValue();
        }
        return average / tObg.length;
    }

    /*
       Чтобы создать обобщенный метод isSameAvg() , потребуется задействовать еще одну особенность обобщений Java:
       аргумент с подстановочным знаком. Аргумент с подстановочным знаком указывается посредством символа ?
       и представляет неизвестный тип. Вот как с его помощью можно записать метод isSameAvg():
     */
    /* Здесь Gen<?> соответствует любому объекту Gen, позволяя сравнивать средние значения любых двух
       объектов Gen, что и демонстрируется в следующей методе:
     */
    public boolean isSameAvg(Gen<?> obg) {
        if (getAverage() == obg.getAverage()) {
            return true;
        }
        return false;
    }

    /*
        Метод принимает два экземпляра класса и среднее арифметическое этих экземпляров.
        Метод saveAvg() обобщенный, с подстановочным знаком и ограничен "сверху" классом Number и его наследниками.
        Gen<? extends Number> - любой объект класса Gen, являющийся Number или его наследником.

        И последнее замечание: важно понимать, что подстановочный знак не влияет на то, какой тип объектов Gen можно
        создавать - это регулируется конструкцией extends в объявлении Gen. Подстановочный знак просто соответствует
        любому допустимому объекту Gen.
     */
    protected static String saveAvg(Gen<? extends Number> x, Gen<? extends Number> y) {
        if (x.isSameAvg(y)) {
//            return x + " " + "и" + " " + y + " " + " -> Среднее арифметическое одинаковое";
            return String.format("%s и %s -> Среднее арифметическое одинаковое",x, y);
        } else {
//            return x + " " + "и" + " " + y + " " + " -> Среднее арифметическое разное";
            return String.format("%s и %s -> Среднее арифметическое разное",x, y);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " +
                tObg.getClass().getSimpleName() + " " +
                Arrays.toString(tObg);
    }
}
