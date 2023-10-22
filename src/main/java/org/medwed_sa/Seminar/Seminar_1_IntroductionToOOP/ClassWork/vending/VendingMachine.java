package org.medwed_sa.Seminar.Seminar_1_IntroductionToOOP.ClassWork.vending;

import org.medwed_sa.Seminar.Seminar_1_IntroductionToOOP.ClassWork.products.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    /**
     * Финальное поле с серийным номером машины.
     */
    private final int idMachine;
    private int productId = 1;
    private final List<Product> productList;

    /**
     * Конструктор создания VendingMachine.
     * Каждая новая машина имеет в себе пустой список хранящихся в ней продуктов.
     * @param id передаваемый серийный номер машины при создании новой, экземпляра класса.
     */
    public VendingMachine(int id) {
        this.idMachine = id;
        productList = new ArrayList<>();
    }

    /**
     *
     * @return серийный номер машины.
     */
    public int getId() {
        return idMachine;
    }

    /**
     * Метод выдачи продуктов с удалением выданного.
     * @param productName имя удаляемого продукта.
     * @return Если в существующих продуктах найдено совпадение по имени продукта, то найденный продукт будет удален,
     *         в противном случае будет сообщение об отсутствии такого продукта.
     */
    public Product getProductByName(String productName) {
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                productList.remove(product);
                System.out.printf("%s -> Выдан.\n", product);
                return product;
            }
        }
        System.out.printf("Product name = " + "'" + productName + "'" + " -> Закончился.\n");
        return null;
    }

    /**
     * Метод добавления продукта в автомат с присвоением id для каждого добавленного продукта.
     * @param product Сущность созданного ранее продукта.
     */
    public void addProduct(Product product) {
        product.setId(productId++);
        productList.add(product);
    }

    /**
     * Метод формирования списка всех продуктов в автомате.
     * @return Список всех продуктов в автомате.
     */
    public String getProductListInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов в автомате:\n");
        for (Product product : productList) {
            stringBuilder.append(product);
            stringBuilder.append("\n");

        }
        return stringBuilder.toString();
    }

}
