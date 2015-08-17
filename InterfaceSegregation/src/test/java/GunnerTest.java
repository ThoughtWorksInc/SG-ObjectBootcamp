import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;

public class GunnerTest {
    Tank tank;

    @Before
    public void setup() {
        tank = new Tank(5);
    }

    @Test
    public void shouldRaiseAndLowerGun() {
        Gunner gunner = new Gunner(tank);

        gunner.raiseGun();
        gunner.raiseGun();

        assertThat(tank.getGunRake(), is(equalTo(10)));

        gunner.lowerGun();

        assertThat(tank.getGunRake(), is(equalTo(5)));
    }

    @Test
    public void shouldRaiseGunToTopAndLowerGunToBottom() {
        Gunner gunner = new Gunner(tank);

        gunner.raiseGunToTop();

        assertThat(tank.getGunRake(), is(equalTo(45)));

        gunner.lowerGunToBottom();

        assertThat(tank.getGunRake(), is(equalTo(0)));
    }

    @Test
    public void shouldRotateGunToTheLeft() {
        Gunner gunner = new Gunner(tank);

        gunner.rotateGunLeft();

        assertThat(tank.getGunAngle(), is(equalTo(315)));
    }


    @Test
    public void shouldRotateGunToTheRight() {
        Gunner gunner = new Gunner(tank);

        gunner.rotateGunRight();

        assertThat(tank.getGunAngle(), is(equalTo(45)));
    }


    @Test
    public void shouldRotateGunToTheFront() {
        Gunner gunner = new Gunner(tank);

        gunner.rotateGunRight();
        gunner.rotateGunRight();
        gunner.rotateGunRight();

        assertThat(tank.getGunAngle(), is(not(equalTo(0))));

        gunner.rotateGunToFront();

        assertThat(tank.getGunAngle(), is(equalTo(0)));
    }

    @Test
    public void shouldFireGun() throws OutOfShellsException {
        Gunner gunner = new Gunner(tank);

        gunner.fire();

        assertThat(tank.getRemainingShells(), is(equalTo(4)));
    }

    @Test(expected = OutOfShellsException.class)
    public void shouldThrowOutOfShellsWhenOutOfShells() throws OutOfShellsException {
        Gunner gunner = new Gunner(tank);

        gunner.fire();
        gunner.fire();
        gunner.fire();
        gunner.fire();
        gunner.fire();
        gunner.fire();
    }


    @Test(expected=AlarmRaisedException.class)
    public void shouldRaiseAlarmExceptionWhenRaisingAlarm() {
        Gunner gunner = new Gunner(tank);
        gunner.raiseAlarm();
    }
}
