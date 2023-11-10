package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_constructor.example009_generic_constructors;

public class GenCons {

    /*
       Обобщенные конструкторы:
       Конструкторы могут быть обобщенными, даже когда их класс таковым не является.
     */
    private final Double value;

    <T extends Number> GenCons(T arg) {
        this.value = arg.doubleValue(); // Любое входящие значение, но обязательно extends Number, приводится к Double.
    }

    public Double getValue() {
        return value;
    }

    public void printConsoleValue() {
        System.out.printf("Значение %s = %s\n", value.getClass().getSimpleName(), value);
    }

    /*
       Поскольку в GenCons() указан параметр обобщенного типа, который обязан быть подклассом Number, конструктор
       GenCons() можно вызывать с любым числовым типом, включая Integer, Float и Double. Следовательно, хотя
       GenCons - не обобщенный классом, его конструктор является обобщенным.
     */

}
