package LR_6_hw.AggrigationWithComposition;
import java.io.*;
public class GFG {
    public static void main(String[] args) {
        // making an engine by creating
        // an instance of Engine class.
        Engine engine = new Engine();

        // Making a car with engine.
        // so we are passing a engine
        // instance as an argument while
        // creating instace of Car.
        Engine.Car car = new Engine.Car(engine);
        car.move();
    }
}
