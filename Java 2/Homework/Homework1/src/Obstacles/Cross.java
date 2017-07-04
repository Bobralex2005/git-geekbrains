package Obstacles;

import Competitors.Competitor;

/**
 * Created Cross class
 */
public class Cross extends Obstacle{
    int distance;

    public Cross(int distance){
        this.distance = distance;
    }

    @Override
    public void justDoIt(Competitor competitor){
        competitor.run(distance);
    }
}
