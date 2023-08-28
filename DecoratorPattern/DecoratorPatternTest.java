package DecoratorPattern;


import DecoratorPattern.Car;
import DecoratorPattern.BasicCar;
import DecoratorPattern.LuxuryCar;
import DecoratorPattern.SportsCar;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportsCar =  new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
