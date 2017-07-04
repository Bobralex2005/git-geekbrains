/**
 * Created by HP on 03.07.2017.
 */
public class Animal {
    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    public void run(int distance){
        if (dist <= maxSwimDistance){
            System.out.println("Good");
        } else {
            System.out.println("Bad");
            onDistance = false;
        }
    }

    public void jump(int height){
        if (height <= maxJumpHeight){
            System.out.println("Good");
        } else {
            System.out.println("Bad");
            onDistance = false;
        }
    }

    public void swim(int distance){
        if (maxSwimDistance == 0){
            System.out.println("bad");
            onDistance = false;
        }
        if (maxSwimDistance == 0)
        }
    }
}
