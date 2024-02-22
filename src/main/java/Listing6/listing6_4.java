package Listing6;

import javax.imageio.IIOException;
import java.io.IOException;

public class listing6_4 {
    public static void main (String[] args) {
        try {
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
