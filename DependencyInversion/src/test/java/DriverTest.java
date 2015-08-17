import org.junit.Test;

public class DriverTest {
    @Test
    public void shouldSpeedUp(){
        Driver driver = new Driver();
        driver.speedUp();

        //assert???
    }

    @Test
    public void shouldSlowDown(){
        Driver driver = new Driver();
        driver.slowDown();

        //assert???
    }

    @Test
    public void shouldTurnOnRadio(){
        Driver driver = new Driver();
        driver.listenToRadio();

        //assert???
    }

    @Test
    public void shouldTurnOffRadioToConcentrate(){
        Driver driver = new Driver();
        driver.listenToRadio();
        driver.concentrate();

        //assert???
    }

    @Test
    public void shouldTurnRadioUpWhenFavouriteSongComesOn(){
        Driver driver = new Driver();
        driver.listenToRadio();
        driver.listeningToFavouriteSong();

        //assert???
    }

    @Test
    public void shouldTurnRadioDownToTalkToPassenger(){
        Driver driver = new Driver();
        driver.listenToRadio();
        driver.talkingToPassenger();

        //assert???
    }
}
