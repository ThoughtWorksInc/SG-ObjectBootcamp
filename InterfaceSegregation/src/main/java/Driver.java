public class Driver {
    private Tank tank;

    public Driver(Tank tank) {

        this.tank = tank;
    }

    public void moveForward() {
        allStop();
        tank.increaseLeftSpeed();
        tank.increaseRightSpeed();
    }

    public void moveBackward() {
        allStop();
        tank.decreaseLeftSpeed();
        tank.decreaseRightSpeed();
    }

    public void allStop() {
        tank.stopLeft();
        tank.stopRight();
    }

    public void turnLeft() {
        allStop();
        tank.increaseRightSpeed();
        tank.decreaseLeftSpeed();
    }

    public void turnRight() {
        allStop();
        tank.increaseLeftSpeed();
        tank.decreaseRightSpeed();
    }

    public void raiseAlarm() {
        tank.raiseAlarm();
    }
}
