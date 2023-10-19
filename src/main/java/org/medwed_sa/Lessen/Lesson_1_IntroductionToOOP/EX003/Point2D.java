package org.medwed_sa.Lessen.Lesson_1_IntroductionToOOP.EX003;


/**
 * Сейчас в классе есть не только поля, но и конструктор. Причем конструктора тут три, или еще можно сказать,
 * что это перегрузка конструктора. Перегрузка - несколько видов конструктора, с разным количеством данных
 * принимаемых конструктором. Это не запрещено. Каждый из констрикторов будет задействован для подходящего
 * пользовательского кода в файле Program. Смотреть там...
 * @Override - toString()
 * Появился переопределенный метод toString() для красивого, понятного человеку печати каждой их
 * созданных сущностей класса Point2D.
 */
public class Point2D {
    double x, y;

    public Point2D(double valueX, double valueY) {
        this.x = valueX;
        this.y = valueY;
    }

    public Point2D() {
        this.x = x;
        this.y = y;
    }

    public Point2D(double value) {
        this.x = value;
        this.y = value;
    }

    @Override
    public String toString() {
        return "{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}
