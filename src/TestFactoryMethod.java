import Exceptions.DuplicateModelNameException;
import Exceptions.NoSuchModelNameException;
import Interface.Vehicle;
import Model.MotoFactory;
import Source.Static;

public class TestFactoryMethod {

    public static void main(String[] args) throws DuplicateModelNameException, NoSuchModelNameException {

        Vehicle bmw = Static.createInstance("BMW", 10);
        System.out.println("Класс созданного ТС: " + bmw.getClass().getName());
        Static.printAllNames(bmw);
        Static.printAllPrices(bmw);
        bmw.setNewModelName("model 3", "M5 F90 Competition");
        System.out.println();
        System.out.println("Модели после изменения.");
        Static.printAllNames(bmw);
        try{
            bmw.setNewModelName("model 4", "M5 F90 Competition");
        }
        catch (DuplicateModelNameException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        Static.setTransportFactory(new MotoFactory());
        Vehicle ducati = Static.createInstance("Ducati", 10);
        System.out.println("Класс созданного ТС: " + ducati.getClass().getName());
        Static.printAllNames(ducati);
        Static.printAllPrices(ducati);
        ducati.setNewModelName("model 1", "Streetfighter");
        System.out.println();
        System.out.println("Модели после изменения.");
        Static.printAllNames(ducati);
        try{
            ducati.setNewModelName("model 4", "Streetfighter");
        }
        catch (DuplicateModelNameException e){
            System.out.println(e.getMessage());
        }
    }
}
