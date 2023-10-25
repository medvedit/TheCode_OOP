package org.medwed_sa.Seminar.Seminar_2_classAbstract_Interface.taxi;

public class Uber extends Taxi {
    @Override
    public void drive(String address) {
        System.out.println("Uber такси приветствует вас!");
    }
}
