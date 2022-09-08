
class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String starEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String starEngine() {
        return "Mistsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mistsubishi-> accelerate()";
    }

    @Override
    public String brake() {
        return "Mistsubishi -> brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String starEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

 class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String starEngine() {
        return getClass().getSimpleName() +" -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> brake()";
    }
}


public class PolymorphismTest {

    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.starEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.starEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.starEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

       Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.starEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }

}
