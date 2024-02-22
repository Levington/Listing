package Listing6;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class listing6_2 {
    public static void main (String[] args) {
try {
    PrintStream errOut =
            new PrintStream(new FileOutputStream("Debug.log"));
    System.setOut(errOut);
} catch (Exception e){}
System.out.println("Сообщение о нормальной работе программы");
System.err.println("Сooбщенеие об ошибках");
}
    }



