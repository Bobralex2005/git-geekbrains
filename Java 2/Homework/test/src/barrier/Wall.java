package barrier;

import animals.*;
/**
 * Write a description of class Wall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wall {
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    public boolean doIt(Animal animal) {
        if (animal instanceof Jumpable) //
            return ((Jumpable) animal).jump(height);
        else
            return false;
    }


    @Override
    public String toString() {
        return this.getClass().getName();
    }


}