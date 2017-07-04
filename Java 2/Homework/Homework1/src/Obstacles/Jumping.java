package Obstacles;

import Competitors.Competitor;
/**
 * Create jump class
 */
public class Jumping extends Obstacle{
    int height;

    public Jumping(int height){
        this.height = height;
    }

    @Override
    public void justDoIt(Competitor competitor){
        competitor.jump(height);
    }
}
