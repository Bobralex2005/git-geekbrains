package Obstacles;

import Competitors.*;

/**
 * Добавить класс ПолосаПрепятствий, в котором будут находиться: массив препятствий, метод,
 * который будет просить команду пройти всю полосу;
 */
public class TheObstacleBar {
    Obstacle[] obstacle;
    //boolean ifPass;

    public TheObstacleBar(Obstacle[] obstacle) {
        this.obstacle = obstacle;
        //ifPass = true;
    }

    public void doIt(Team teams) {
        for (Animal a : teams.animals) {
            for (Obstacle o : obstacle) {
                o.justDoIt(a);
                if (!a.isOnDistance()) break;
            }
        }
    }
}
