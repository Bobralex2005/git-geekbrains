import Competitors.*;
import Obstacles.*;

/**
 * Created by Alexander Bugaev on 03.07.2017.
 */
public class Homework {
    public static void main(String[] args) {
        Competitor[] competitors = {new Cats("Tom", 100, 10),
                new Dogs("Bob", 500, 100, 3)};
        Obstacle[] course = {new Cross(10), new Jumping(2), new Swimming(10)};
        for (Competitor c : competitors){
            for (Obstacle o : course){
                o.justDoIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors){
            c.info();
        }
    }
}
