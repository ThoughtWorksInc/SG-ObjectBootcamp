import org.junit.Test;

public class DriverTest {
    @Test
    public void shouldSpeedUp(){
        Driver driver = new Driver();
        driver.speedUp();

        //assert car speed has increased
    }

    @Test
    public void shouldSlowDown(){
        Driver driver = new Driver();
        driver.slowDown();

        //assert car speed has decreased
    }

    @Test
    public void shouldTurnOnRadio(){
        Driver driver = new Driver();
        driver.listenToRadio();

        //assert radio is on
    }

    @Test
    public void shouldTurnOffRadioToConcentrate(){
        Driver driver = new Driver();
        driver.listenToRadio();
        driver.concentrate();

        //assert radio is off
    }

    @Test
    public void shouldTurnRadioUpWhenFavouriteSongComesOn(){
        Driver driver = new Driver();
        driver.listenToRadio();
        driver.listeningToFavouriteSong();

        //assert volume has increased
    }

    @Test
    public void shouldTurnRadioDownToTalkToPassenger(){
        Driver driver = new Driver();
        driver.listenToRadio();
        driver.talkingToPassenger();

        //assert volume has decreased
    }
}
