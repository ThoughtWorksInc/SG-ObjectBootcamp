/**
 * Created by thaodang on 18/8/15.
 */
public class GunnerControl implements TankGunnerInterface {
    private int gunAngle = 0;
    private int gunRake = 0;
    private int remainingShells;

    public GunnerControl(int initialShells) {
        remainingShells = initialShells;
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

    @Override
    public void raiseAlarm() {

    }
}
