package org.medwed_sa.Lessen.Lesson_3_Iterator_Comparator.Ex005_comparable;

import java.util.Comparator;

public class AgeComparator implements Comparator<Worker>{
//    @Override
//    public int compare(Worker o1, Worker o2) {
//        return 0;
//    }

    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.age, o2.age);
    }
    
}