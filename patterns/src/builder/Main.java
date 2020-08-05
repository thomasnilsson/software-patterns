package builder;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello builder!");

        RobotBuilder oldStyleBuilder = new OldRobotBuilder();
        RobotDirector oldDirector = new RobotDirector(oldStyleBuilder);

        Robot robot1 = oldDirector.getRobot();
        Robot robot2 = oldDirector.getRobot();

        System.out.println(robot1.hashCode());
        System.out.println(robot2.hashCode());

    }
}
