import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void itCreatesACarWithMPG(){
        Car car = new Car(10);
        int expected = 10;
        int actual = car.mpg;
        assertEquals(expected,actual);
    }
    @Test
    public void itFillsTheCarWithGas(){
        Car car = new Car(10);
        car.fill(10);
        int expected = 10;
        int actual = car.gallons;
        assertEquals(expected, actual);
    }
    @Test
    public void itDecreasesGasWhenYouDrive(){
        Car car = new Car(10);
        car.fill(20);
        car.drive(10);
        int expected = 19;
        int actual = car.gallons;
        assertEquals(expected, actual);
    }
    @Test
    public void itUpdatesTheOdometer(){
        Car car = new Car(10);
        car.fill(20);
        car.drive(10);
        int expected = 10;
        int actual = car.odometer;
        assertEquals(expected, actual);
    }
    @Test
    public void itUpdatesTheTrip(){
        Car car = new Car(10);
        car.fill(20);
        car.drive(10);
        int expected = 1;
        int actual = car.trips.size();
        assertEquals(expected, actual);

    }
}
