package MidtermRevision.AdvancedOOP;

public class V1 {
    //create a engine class
    static class Engine {

        String type;
        public  Engine (String type) {
            this.type=type;
        }
        public void start() {
            System.out.println("Starting "+type+" engine...");
        }
    }
    static class  Car {
        String model;
        final Engine engine;

        public Car(String model, Engine engine) {
            this.model = model;
            this.engine = engine;
        }

        public void startCar() {
            System.out.println("Starting the " + engine.type + "engine of " + model + "...");
            engine.start();

        }
    }
    public static void main(String[] args) {
        Engine electricEngine = new Engine("Electric");
        Car tesla = new Car("Model S", electricEngine);
        tesla.startCar();
    }

}
