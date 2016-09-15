import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DriverTest {
    @Test
    public void shouldDecreaseFuelWhenGoingForDrive() {
        Car car = new Car(5);
        Driver driver = new Driver(car);

        driver.drive();

        assertThat(car.checkFuelLevel(), is(4));
    }

    @Test
    public void shouldDecreaseFuelBy5WhenGoingForLongDrive() {
        Car car = new Car(7);
        Driver driver = new Driver(car);

        driver.goForLongDrive();

        assertThat(car.checkFuelLevel(), is(2));
    }

    @Test(expected=OutOfFuelException.class)
    public void shouldThrowOutOfFuelIfDrivingOnEmpty() {
        Car car = new Car(0);
        Driver driver = new Driver(car);

        driver.drive();
    }

    @Test(expected=NotEnoughFuelException.class)
    public void shouldThrowNotEnoughFuelIfGoingForLongDrivingWithoutEnough() {
        Car car = new Car(3);
        Driver driver = new Driver(car);

        driver.goForLongDrive();
    }
}
