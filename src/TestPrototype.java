import Exceptions.DuplicateModelNameException;
import Exceptions.NoSuchModelNameException;
import Interface.Vehicle;
import Model.Car;
import Model.Moto;
import Source.Static;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException, DuplicateModelNameException, NoSuchModelNameException {

        Car bmw = new Car("BMW", 5);
        System.out.println(bmw.getClass().getName());
        Vehicle cloneBMW = (Car) bmw.clone();
        System.out.println("Модели оригинала: " + bmw.getBrand());
        Static.printAllNames(bmw);
        Static.printAllPrices(bmw);
        System.out.println("Модели клона: " + cloneBMW.getBrand());
        Static.printAllNames(cloneBMW);
        Static.printAllPrices(cloneBMW);
        System.out.println();
        System.out.println("Меняем название модели в клоне");
        cloneBMW.setNewModelName("model 1", "M5 e60");
        System.out.println("Модели оригинала: " + bmw.getBrand());
        Static.printAllNames(bmw);
        Static.printAllPrices(bmw);
        System.out.println("Модели клона: " + cloneBMW.getBrand());
        Static.printAllNames(cloneBMW);
        Static.printAllPrices(cloneBMW);
        System.out.println();

        Moto ducati = new Moto("Ducati", 5);
        System.out.println(ducati.getClass().getName());
        Vehicle cloneDucati = (Moto) ducati.clone();
        System.out.println("Модели оригинала: " + ducati.getBrand());
        Static.printAllNames(ducati);
        Static.printAllPrices(ducati);
        System.out.println("Модели клона: " + cloneDucati.getBrand());
        Static.printAllNames(cloneDucati);
        Static.printAllPrices(cloneDucati);
        System.out.println();
        System.out.println("Меняем название модели в клоне");
        cloneDucati.setNewModelName("model 1", "Streetfighter");
        System.out.println("Модели оригинала: " + ducati.getBrand());
        Static.printAllNames(ducati);
        Static.printAllPrices(ducati);
        System.out.println("Модели клона: " + cloneDucati.getBrand());
        Static.printAllNames(cloneDucati);
        Static.printAllPrices(cloneDucati);
    }
}
