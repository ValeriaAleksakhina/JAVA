package seminars.second.hw;
import org.assertj.core.util.VisibleForTesting;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {
    @Test
    public void testCarIsVehicle() {
        Car car = new Car();
        assertThat(car).isInstanceOf(Vehicle.class);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    @Test
    public void testMotorcycleVehicle() {
       Motorcycle motorcycle = new Motorcycle("iz", "planeta", 1970);
       assertThat(motorcycle).isInstanceOf((Vehicle.class));
       assertThat(motorcycle.getNumWheels()).isEqualTo(2);

    }
    @Test
    public void testSpeedCar() {
        Car car = new Car();
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

   @Test
    public void testSpeedMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("iz", "planeta", 1970);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void testParkingCar() {
        Car car = new Car();
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    @Test
    public void testParkingMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("iz", "planeta", 1970);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }


}

