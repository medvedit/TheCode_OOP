package org.medwed_sa.Seminar.Seminar_1_IntroductionToOOP.products;

public class Product {

    private int id;
    private final String name;
    private double prise;


    public Product(String name, double prise) {
        this.name = name;
        this.prise = prise;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Product " +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", prise = " + prise;
    }
}
