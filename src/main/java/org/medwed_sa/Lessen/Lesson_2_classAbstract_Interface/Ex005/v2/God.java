package org.medwed_sa.Lessen.Lesson_2_classAbstract_Interface.Ex005.v2;


import org.medwed_sa.Lessen.Lesson_2_classAbstract_Interface.Ex005.v2.Healers.Healer;
import org.medwed_sa.Lessen.Lesson_2_classAbstract_Interface.Ex005.v2.Warriors.Warrior;

public class God extends Hero implements Healer, Warrior {

    @Override
    public void attack(Hero target) {
        
    }

    @Override
    public void healing(Hero target) {
        
    }
}

