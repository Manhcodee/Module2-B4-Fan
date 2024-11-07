public class Option {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int Fast = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Option() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public  String toString() {
        if(on) {
            return "Fan is on: speed = " + speed + ", color: = " + color + ", radius: = " + radius;
        }
        else {
            return "Fan is off: color: = " + color + ", radius: = " + radius;
        }
    }
}
