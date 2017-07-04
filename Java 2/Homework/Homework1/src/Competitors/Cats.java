package Competitors;

/**
 * Cat class
 */
public class Cats extends Animal{
    public Cats(String name, int maxRunDistance, int maxJumpHeight) {
        super("Cat", name, maxRunDistance, 0, maxJumpHeight);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Oops, seems like " + name +" can't swim");
        onDistance = false;
    }
}
