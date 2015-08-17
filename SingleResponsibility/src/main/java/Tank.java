public class Tank implements TankDriverInterface, TankGunnerInterface {

    private int leftSpeed = 0;
    private int rightSpeed = 0;
    private int gunAngle = 0;
    private int gunRake = 0;
    private int remainingShells;

    public int getLeftSpeed() {
        return leftSpeed;
    }

    public int getRightSpeed() {
        return rightSpeed;
    }

    public int getGunAngle() {
        return gunAngle;
    }

    public int getGunRake() {
        return gunRake;
    }

    public int getRemainingShells() {
        return remainingShells;
    }

    public Tank(int initialShells) {
        remainingShells = initialShells;
    }

    public void stopLeft() {
        leftSpeed = 0;
    }

    public void stopRight() {
        rightSpeed = 0;
    }

    public void increaseLeftSpeed() {
        leftSpeed += 1;
    }

    public void decreaseLeftSpeed() {
        leftSpeed -= 1;
    }

    public void increaseRightSpeed() {
        rightSpeed += 1;
    }

    public void decreaseRightSpeed() {
        rightSpeed -= 1;
    }

    public void rotateGunLeft() {
        gunAngle -= 45;
        while (gunAngle < 0) gunAngle += 360;
    }

    public void rotateGunRight() {
        gunAngle += 45;
        while (gunAngle >= 360) gunAngle -= 360;
    }

    public void raiseGun() {
        if (gunRake < 45) gunRake += 5;
    }

    public void lowerGun() {
        if (gunRake > 0) gunRake -= 5;
    }

    public void fire() throws OutOfShellsException {
        if (remainingShells <= 0) throw new OutOfShellsException();
        remainingShells -= 1;
    }

    public void raiseAlarm() {
        throw new AlarmRaisedException();
    }

    public void reset() {
        leftSpeed = 0;
        rightSpeed = 0;
        gunAngle = 0;
        gunRake = 0;
    }
}
