package MVC;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Hashtable;

public class Deserializator {

    private static Hashtable<Integer, Object> newHashTable;

    public static void deserialization(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            newHashTable = (Hashtable) ois.readObject();

            ois.close();
            fis.close();

        }
        catch (IOException | ClassNotFoundException e){
            System.out.println("ФАЙЛ ПУСТ");
        }
    }

    public static Hashtable getHashtable(String filename){
        deserialization(filename);
        return newHashTable;
    }

}
