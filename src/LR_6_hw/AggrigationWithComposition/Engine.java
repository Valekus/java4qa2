package LR_6_hw.AggrigationWithComposition;

public class Engine {
    public void work()
    {
        System.out.println("Engine is started");
    }
    static final class Car
    {
        // For a car to move,
        // it need to have a engine.
       // private final Engine engine; // Composition
        private Engine engine;     // Aggregation

        Car(Engine engine)
        {
            this.engine = engine;
        }

        // car start moving by starting engine
        public void move()
        {

            if (engine == null) {
                return;
            }
            engine.work();
            System.out.println("Car is moving ");
        }
    }
}
