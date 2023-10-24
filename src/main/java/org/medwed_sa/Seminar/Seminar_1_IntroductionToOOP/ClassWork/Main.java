package org.medwed_sa.Seminar.Seminar_1_IntroductionToOOP.ClassWork;

import org.medwed_sa.Seminar.Seminar_1_IntroductionToOOP.ClassWork.products.Bottle;
import org.medwed_sa.Seminar.Seminar_1_IntroductionToOOP.ClassWork.vending.VendingMachine;
import org.medwed_sa.Seminar.Seminar_1_IntroductionToOOP.ClassWork.products.Product;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product( "Twix", 80);
        Product product2 = new Bottle("Coca-cola", 100, 1.5);
        Product product3 = new Product( "Lays", 90);
        Product product4 = new Product( "Nats", 73);

        VendingMachine vendingMachine = new VendingMachine(123);
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        System.out.println(vendingMachine.getProductListInfo());

        vendingMachine.getProductByName("Twix");
        System.out.println(vendingMachine.getProductListInfo());

        vendingMachine.getProductByName("Twix");
        System.out.println(vendingMachine.getProductListInfo());

        System.out.printf("id machine = %d\n", vendingMachine.getId());

        vendingMachine.addProduct(product4);
        System.out.println(vendingMachine.getProductListInfo());


    }
}
