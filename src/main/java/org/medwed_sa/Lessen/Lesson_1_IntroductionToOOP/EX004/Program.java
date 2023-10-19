package org.medwed_sa.Lessen.Lesson_1_IntroductionToOOP.EX004;

public class Program {

    public static void main(String[] args) {
////        ____________________________________________________________________________________
////         # Первый уровень робота с параметрами в классе Robot_1
//
//        System.out.println("Robot_1 Start!!!\n");
//        Robot1 robot1 = new Robot1("name_1", 1);
//        System.out.printf("%s %d\n", robot1.name, robot1.level);
//
//        robot1.level = 100500;
//        System.out.printf("%s %d\n", robot1.name, robot1.level);
//
//        robot1.startBIOS();
//        robot1.startOS();
//        robot1.sayHi();
//
//        robot1.work();
//
//        robot1.sayBye();
//        robot1.stopOS();
//        robot1.stopBIOS();
//        System.out.println("\nRobot_1 Stop!!!\n");
//
////       ____________________________________________________________________________________
////         # Второй уровень робота с параметрами в классе Robot_2
//
//        System.out.println("Robot_2 Start!!!\n");
//        Robot2 robot2 = new Robot2("name_2", 1);
//        System.out.printf("%s %d\n", robot2.getName(), robot2.getLevel());
//
//        robot2.work();
//        robot2.work();
//        robot2.work();
//        robot2.powerOff();
//        System.out.println("\nRobot_2 Stop!!!\n");


//        ____________________________________________________________________________________
//         # Третий уровень робота с параметрами в классе Robot_3

        System.out.println("Robot_3 Start!!!\n");
        Robot3 robot3 = new Robot3("name_3");
        System.out.println("-------------");
        System.out.println(robot3);
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();

        robot3.power();
        System.out.println("\nRobot_3 Stop!!!\n");

    }
}
