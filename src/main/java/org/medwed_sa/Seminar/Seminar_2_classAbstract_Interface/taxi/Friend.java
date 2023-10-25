package org.medwed_sa.Seminar.Seminar_2_classAbstract_Interface.taxi;

public class Friend implements Driver {
    @Override
    public void drive(String address) {
        System.out.println("Поехали, дружище!");
    }
}
