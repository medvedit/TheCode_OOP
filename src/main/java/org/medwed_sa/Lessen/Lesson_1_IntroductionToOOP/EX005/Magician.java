package org.medwed_sa.Lessen.Lesson_1_IntroductionToOOP.EX005;

import java.util.Random;

public class Magician {

    private static int number;
    private static Random r;

    private String name;
    private int hp;
    private int maxHp;

    private int mana;
    private int maxMana;

    static {
        Magician.number = 0;
        Magician.r = new Random();
    }

    /**
     * Конструктор принимающий три параметра.
     * @param name имя
     * @param hp здоровье
     * @param mana мана
     */
    public Magician(String name, int hp, int mana) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.mana = mana;
        this.maxMana = mana;
    }

    /**
     * Конструктор без входящих параметров.
     */
    public Magician() {
        this(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200),
                Magician.r.nextInt(50, 150));
    }

    /**
     * Метод атаки.
     * @return Урон
     */
    public int Attack() {
        int damage = Magician.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    /**
     * Метод атаки.
     * @return Урон
     */
    public String getInfo() {
        return String.format("Name: %s  Hp: %d Enegry:  %d Type: %s",
                this.name, this.hp, this.mana, this.getClass().getSimpleName());
    }

    /**
     * Метод лечения героя.
     * @param Hp Количество единиц повышения уровня hp у героя.
     */
    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    /**
     * Метод нанесения урона.
     * @param damage Количество единиц нанесения урона герою.
     */
    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

}
