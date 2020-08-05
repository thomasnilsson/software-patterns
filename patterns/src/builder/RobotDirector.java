package builder;

public class RobotDirector {

    private RobotBuilder builder;

    public RobotDirector(RobotBuilder builder) {
        this.builder = builder;
    }

    public Robot getRobot() {
        return this.builder.getRobot();
    }

}
