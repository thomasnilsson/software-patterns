package builder;

public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Blowtorch arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Rollerblades");
    }

    @Override
    public Robot getRobot() {
        this.robot = new Robot();
        buildRobotArms();
        buildRobotHead();
        buildRobotTorso();
        buildRobotLegs();
        return robot;
    }
}
