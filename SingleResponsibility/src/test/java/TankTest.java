import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.hamcrest.number.OrderingComparison.lessThan;

public class TankTest {
    @Test
    public void shouldIncreaseLeftSpeed(){
        Tank tank = new Tank(5);

        tank.increaseLeftSpeed();

        assertThat(tank.getLeftSpeed(), is(greaterThan(0)));
    }

    @Test
    public void shouldDecreaseLeftSpeed(){
        Tank tank = new Tank(5);

        tank.decreaseLeftSpeed();

        assertThat(tank.getLeftSpeed(), is(lessThan(0)));
    }

    @Test
    public void shouldIncreaseRightSpeed(){
        Tank tank = new Tank(5);

        tank.increaseRightSpeed();

        assertThat(tank.getRightSpeed(), is(greaterThan(0)));
    }

    @Test
    public void shouldDecreaseRightSpeed(){
        Tank tank = new Tank(5);

        tank.decreaseRightSpeed();

        assertThat(tank.getRightSpeed(), is(lessThan(0)));
    }

    @Test
    public void shouldRotateGunLeft(){
        Tank tank = new Tank(5);

        tank.rotateGunLeft();

        assertThat(tank.getGunAngle(), is(equalTo(315)));
    }

    @Test
    public void shouldRotateGunRight(){
        Tank tank = new Tank(5);

        tank.rotateGunRight();

        assertThat(tank.getGunAngle(), is(equalTo(45)));
    }


    @Test
    public void shouldRaiseAndLowerGun(){
        Tank tank = new Tank(5);
        tank.raiseGun();

        tank.lowerGun();

        assertThat(tank.getGunRake(), is(equalTo(0)));
    }

    @Test
    public void shouldFireGun() throws OutOfShellsException {
        Tank tank = new Tank(5);

        tank.fire();

        assertThat(tank.getRemainingShells(), is(equalTo(4)));
    }

    @Test(expected = OutOfShellsException.class)
    public void shouldThrowExceptionFiringEmptyGun() throws OutOfShellsException {
        Tank tank = new Tank(0);

        tank.fire();
    }

    @Test(expected = AlarmRaisedException.class)
    public void shouldRaiseAlarm() {
        Tank tank = new Tank(5);

        tank.raiseAlarm();
    }

    @Test
    public void shouldStopAndResetGun() {
        Tank tank = new Tank(5);
        tank.increaseLeftSpeed();
        tank.decreaseRightSpeed();
        tank.raiseGun();
        tank.rotateGunLeft();

        tank.reset();

        assertThat(tank.getLeftSpeed(), is(equalTo(0)));
        assertThat(tank.getRightSpeed(), is(equalTo(0)));
        assertThat(tank.getGunRake(), is(equalTo(0)));
        assertThat(tank.getGunAngle(), is(equalTo(0)));
    }
}
