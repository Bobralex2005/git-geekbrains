import Competitors.*;
import Obstacles.*;

/**
 * Created by Alexander Bugaev on 03.07.2017.
 */
public class Homework {
    public static void main(String[] args) {
        Team t1 = new Team("Blue",
                new Animal[]
                        {new Cat("Tom", 100, 10),
                        new Cat("Roccy", 120, 5),
                                new Cat("Rocc", 120, 5)});
        Team t2 = new Team("Red", new Animal[]
                {new Dog("Bull", 500, 120, 2),
                        new Dog("Terry", 400, 200, 3),
                new Dog("FatSo", 300, 140, 1)});
        TheObstacleBar obs = new TheObstacleBar(new Obstacle[]{new Cross(10), new Jumping(2), new Swimming(10)});

        t1.teamInfo();
        t2.teamInfo();

        obs.doIt(t1);
        obs.doIt(t2);

        t1.ifPassInfo();
        t2.ifPassInfo();
    }
}
