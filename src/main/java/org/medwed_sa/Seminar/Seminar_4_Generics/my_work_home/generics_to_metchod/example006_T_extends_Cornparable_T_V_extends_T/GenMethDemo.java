package org.medwed_sa.Seminar.Seminar_4_Generics.my_work_home.generics_to_metchod.example006_T_extends_Cornparable_T_V_extends_T;

public class GenMethDemo {

    /*
    Создание обобщенного метода:


    Обратите внимание на конструкцию <T extends Comparable<T>:
    Класс, реализующий Comparable, определяет объекты, которые можно упорядочивать.
    Таким образом, требование верхней границы как Comparable гарантирует, что метод isIn() может использоваться
    только с объектами, которые обладают способностью участвовать в сравнениях.

    Далее обратите внимание, что тип V ограничен сверху типом T. Соответственно тип V должен быть либо тем же самым,
     что и тип Т, либо подклассом T. Такое отношение гарантирует, что метод isIn() можно вызывать только с
     аргументами, которые совместимы друг с другом.
     */
    public <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
//    public <T, V> boolean isIn(T x, V[] y) {  // В моем случае можно писать и так, т.к.
                                                // проверка входящих дынных проводится в методе вызывающий isIn()
        for (V v : y) {
            if (x.equals(v)) {
                return true;
            }
        }
        return false;
    }

    public  <N extends Comparable<N>, T extends N> void extracted(N x, T[] num) {
        if (isIn(x, num))
            System.out.printf("%s присутствует в %s\n", x, num.getClass().getSimpleName());
        if (!isIn(x, num))
            System.out.printf("%s отсутствует в %s\n", x, num.getClass().getSimpleName());
    }
}
