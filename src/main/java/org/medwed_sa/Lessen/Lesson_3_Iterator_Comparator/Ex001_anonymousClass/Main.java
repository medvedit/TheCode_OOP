package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex001_anonymousClass;

public class Main {

    public static void main(String[] args) {

//        Foo foo = new Foo(); // При стандартном создании экземпляра класса будет ошибка компилятора, т.к. класс
//                             // abstract Foo и на прямую экземпляр класса не создать. IDEA подскажет, что если это
//                             // вам необходимо, то можно воспользоваться "услугами" анонимного класса.
//                             // И будет это выглядеть, ка на примере ниже...

        Foo foo1 = new Foo() {
            @Override
            public void m1() {
                System.out.println("m1");

            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
        };

        foo1.m1();
        foo1.m2();
    }
}
