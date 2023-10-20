package org.medwed_sa.Seminar.Seminar_1_IntroductionToOOP.products;

public class Bottle extends Product {
    private double volume;

    /**
     * Конструктор класса Bottle.
     * @param name имя приходящие из родительского класса.
     * @param prise цена товара приходящая из родительского класса.
     * @param volume объем для экземпляра класса Bottle.
     */
    public Bottle(String name, double prise, double volume) {
        super(name, prise);
        this.volume = volume;
    }

    /**
     * Геттер класса Bottle.
     * @return объем продукта.
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Переопределенный метод toString().
     * @return super.toString() от класса родителя + объем продукта задаваемый в классе Bottle.
     */
    @Override
    public String toString() {
        return super.toString() + ", volume: " + volume + "л.";
    }
}
