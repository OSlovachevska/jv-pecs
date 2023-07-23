package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String color;
    private int year;

    public Excavator() {
    }

    public Excavator(String color, int year) {
        this.color = color;
        this.year = year;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
