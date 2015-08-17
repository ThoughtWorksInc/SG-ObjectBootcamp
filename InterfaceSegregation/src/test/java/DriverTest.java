import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class DriverTest {
    Tank tank;

    @Before
    public void setup() {
        tank = new Tank(5);
    }

    @Test
    public void shouldIncreaseBothLeftAndRightWhenMovingForward() {
        Driver driver = new Driver(tank);

        driver.moveForward();

        assertThat(tank.getLeftSpeed(), is(greaterThan(0)));
        assertThat(tank.getRightSpeed(), is(greaterThan(0)));
        assertThat(tank.getRightSpeed(), is(equalTo(tank.getLeftSpeed())));
    }

    @Test
    public void shouldDecreaseBothLeftAndRightWhenMovingBackward() {
        Driver driver = new Driver(tank);

        driver.moveBackward();

        assertThat(tank.getLeftSpeed(), is(lessThan(0)));
        assertThat(tank.getRightSpeed(), is(lessThan(0)));
        assertThat(tank.getRightSpeed(), is(equalTo(tank.getLeftSpeed())));
    }

    @Test
    public void shouldMakeLeftSpeedGreaterThanRightSpeedWhenTurningRight() {
        Driver driver = new Driver(tank);

        driver.turnRight();

        assertThat(tank.getRightSpeed(), is(lessThan(tank.getLeftSpeed())));
    }

    @Test
    public void shouldMakeRightSpeedGreaterThanLeftSpeedWhenTurningLeft() {
        Driver driver = new Driver(tank);

        driver.turnLeft();

        assertThat(tank.getRightSpeed(), is(greaterThan(tank.getLeftSpeed())));
    }

    @Test
    public void shouldStopWhenCallingStop() {
        Driver driver = new Driver(tank);
        driver.moveForward();

        driver.allStop();

        assertThat(tank.getLeftSpeed(), is(equalTo(0)));
        assertThat(tank.getRightSpeed(), is(equalTo(0)));

    }

    @Test(expected=AlarmRaisedException.class)
    public void shouldRaiseAlarmExceptionWhenRaisingAlarm() {
        Driver driver = new Driver(tank);
        driver.raiseAlarm();
    }
}
