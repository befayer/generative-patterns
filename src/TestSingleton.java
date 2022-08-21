import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSingleton {

    public static void main(String[] args) {
        try {
            ConfigManager manager = ConfigManager.getInstance();
            int firstValue = manager.getVirstProperty();
            System.out.println("Первое значение: " + firstValue);
            int secondValue = manager.getSecondProperty();
            System.out.println("Второе значение: " + secondValue);
            int thirdValue = manager.getThirdProperty();
            System.out.println("Третье значение: " + thirdValue);
        } catch (IOException ex) {
            Logger.getLogger(TestSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

