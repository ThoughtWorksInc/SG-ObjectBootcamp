public class Gunner {
    private Tank tank;

    public Gunner(Tank tank) {

        this.tank = tank;
    }

    public void raiseGun() {
        tank.raiseGun();
    }

    public void lowerGun() {
        tank.lowerGun();
    }

    public void raiseGunToTop() {
        while(true) {
            int initialRake = tank.getGunRake();
            raiseGun();
            if (initialRake == tank.getGunRake()) break;
        }
    }

    public void lowerGunToBottom() {
        while(true) {
            int initialRake = tank.getGunRake();
            lowerGun();
            if (initialRake == tank.getGunRake()) break;
        }
    }

    public void rotateGunLeft() {
        tank.rotateGunLeft();
    }

    public void rotateGunRight() {
        tank.rotateGunRight();
    }

    public void rotateGunToFront() {
        while (tank.getGunAngle() != 0) rotateGunRight();
    }

    public void fire() throws OutOfShellsException {
        tank.fire();
    }

    public void raiseAlarm() {
        tank.raiseAlarm();
    }
}
