package MVC;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
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

//            System.out.println(newHashTable);
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println("ФАЙЛ ПУСТ");
//            e.printStackTrace();
        }
    }

    public static Hashtable getHashtable(String filename){
        deserialization(filename);
        return newHashTable;
    }

}
