import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Clase01
{
    public void metodo01()
    {
        try {
            File archivo = new File("datos.txt");
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}