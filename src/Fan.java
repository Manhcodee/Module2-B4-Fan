public class Fan {
    public static void main(String[] args) {
        Option fan1 = new Option();
        fan1.setSpeed(Option.Fast);
        fan1.setColor("blue");
        fan1.setRadius(10);
        fan1.setOn(true);

        Option fan2 = new Option();
        fan2.setSpeed(Option.MEDIUM);
        fan2.setColor("red");
        fan2.setRadius(9);
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
