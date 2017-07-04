package Competitors;

/**
 * All methods must be declared by classes which are implement current interface
 */
public interface Competitor {
    void run(int distance);
    void jump(int height);
    void swim(int distance);
    void info();
    boolean isOnDistance();
}
