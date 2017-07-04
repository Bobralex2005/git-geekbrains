package Competitors;

/**
 * Created by HP on 04.07.2017.
 */
public class Animal implements Competitor {
    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int distance){
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " successfully passed Cross");
        } else {
            System.out.println(type + " " + name + " failed to pass Cross");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height){
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " successfully jump over following wall");
        } else {
            System.out.println(type + " " + name + " failed to jump over following wall");
            onDistance = false;
        }
    }

    @Override
    public void swim(int distance){
        if (distance <= maxSwimDistance) {
            System.out.println(type + " " + name + " successfully swim following distance");
        } else {
            System.out.println(type + " " + name + " failed to swim following distance");
            onDistance = false;
        }
    }

    @Override
    public void info(){
        System.out.println(type + " " + name + " - " + onDistance);
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }
}
