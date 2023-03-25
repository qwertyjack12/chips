package MVC;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Hashtable;

public class Deserializator {

    public static void deserialization(Hashtable hashtable, String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Hashtable new_hashtable = (Hashtable) ois.readObject();

            ois.close();
            fis.close();

            System.out.println(new_hashtable);
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
