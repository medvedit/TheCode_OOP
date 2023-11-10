package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_class.example001_T;

public class Gen<T> {
    private T value;

    public Gen(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    public void chowType(){
        System.out.println("Типом Т является: " + value.getClass().getName());
    }

    @Override
    public String toString() {
        return String.format("Значение class Gen %s value = %s" ,getValue().getClass().getSimpleName(), getValue());
    }

}
