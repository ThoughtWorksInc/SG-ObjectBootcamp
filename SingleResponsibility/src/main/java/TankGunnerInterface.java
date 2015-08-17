public interface TankGunnerInterface extends TankCommonInterface {
    int getGunAngle();

    int getGunRake();

    void rotateGunLeft();

    void rotateGunRight();

    void raiseGun();

    void lowerGun();

    void fire() throws OutOfShellsException;
}
