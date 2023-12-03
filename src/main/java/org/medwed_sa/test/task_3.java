package org.medwed_sa.test;

/**
 * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
 * Метод должен пройтись по каждому элементу и проверить что он не равен null.
 * А теперь реализуйте следующую логику:
 * Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
 * Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 *
 * open source github
 *
 * https://docs.google.com/document/d/197XaW263uG8l88tDhW9cIz05tKfKouNBusKOV0K-uS8/edit
 *
 * https://github.com/sabinaIsm/test/blob/d2ebf811b85139783b1a0dcbe3714dbb28deee82/ST_example.log
 *
 */

public class task_3 {

    public static void checkArray(Integer[] array) {
        if (array == null)
            System.out.println("Массив пустой!");
        else{
            boolean flag = true;
            for (int i = 0; i < array.length; i++){
                Integer n = array[i];
                if (n == null) {
                    flag = false;
                    System.out.println("null значение находится на индексе " + i);
                }
            }
            if (flag){
                System.out.println("null значений не найдено");
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1, null, -2, 3, 4, 5};
        checkArray(array);
        Integer[] array1 = null;
        checkArray(array1);
        Integer[] array2 = {1, -2, 3, 4, 5};
        checkArray(array2);
        Integer[] array3 = {1, null, -2, null, null, 5};
        checkArray(array3);
    }

}
