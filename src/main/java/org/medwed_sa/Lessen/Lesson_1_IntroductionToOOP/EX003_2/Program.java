package org.medwed_sa.Lessen.Lesson_1_IntroductionToOOP.EX003_2;


/**
 * Метод расчета расстояния между точками стал статическим и "переехал" в "родитель"
 * Тут создаем экземпляры классов, если необходимо, то меняем или читаем данные и запускаем необходимые методы.
 */
public class Program {

    public static void main(String[] args) {
//      ____________________
        Point2D a = new Point2D(0.34, 4.22);
        System.out.printf("a = %s\n", a.toString());
//      ____________________
        Point2D b = new Point2D();
        b.setX(0.9854);
        b.setY(10.033);
        System.out.printf("b = %s\n", b);

        var dis = Point2D.distance(a,b);
        System.out.println(dis);

    }

}
