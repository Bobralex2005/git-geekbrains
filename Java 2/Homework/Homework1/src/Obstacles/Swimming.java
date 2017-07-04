package Obstacles;

import Competitors.Competitor;
/**
 * Create swimming class
 */
public class Swimming extends Obstacle {
    int distance;

    public Swimming(int distance) {
        this.distance = distance;
    }

    @Override
    public void justDoIt(Competitor competitor){
        competitor.swim(distance);
    }
}
