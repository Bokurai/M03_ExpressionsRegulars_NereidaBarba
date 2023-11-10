import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class MainStringMethods {
    public static void main(String[] args) throws FileNotFoundException{

        File archivo= new File("santako.txt");
        Scanner lineas = new Scanner(archivo);

        String linea1;
        String linea2;
        String linea3;
        String linea4;

        int contadorpapanoell1 = 0;
        int contadorpapanoell2 = 0;
        int contadorrenl2 = 0;
        int contadorfolletl3 = 0;


            linea1 = lineas.nextLine();
            linea2 = lineas.nextLine();
            linea3 = lineas.nextLine();
            linea4 = lineas.nextLine();

            if(linea1.contains("*<]:-DOo")) {
                contadorpapanoell1++;
            }

            for (int i = 0; i < 2 ; i++) {
                if(linea2.contains("*<]:-DOo")){
                contadorpapanoell2++;
            }
            }


            if(linea2.contains(">:o)")) {
                contadorrenl2++;
            }

            if(linea4.contains("<]:-D")) {
                contadorfolletl3++;
            }

        System.out.println("Pare Noel (" + contadorpapanoell1 + ")");
        System.out.println("Pare Noel (" + contadorpapanoell2 + ") Ren(" + contadorrenl2 + ")");
        System.out.println(" ");
        System.out.println("Follets (" + contadorfolletl3 + ")");
    }
}
