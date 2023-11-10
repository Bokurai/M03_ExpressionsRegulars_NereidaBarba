import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.*;
public class MainExpressionsRegulars {
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("santako.txt");
        Scanner lineas = new Scanner(archivo);
        Pattern follets = Pattern.compile("<]:-D");
        Pattern rens = Pattern.compile(">:o\\)");
        Pattern noel = Pattern.compile("\\*<]:-DOo");

        while(lineas.hasNext()){
            int contanoel = 0;
            int contarens = 0;
            int contafollet = 0;

            String linea = lineas.nextLine();

            Matcher noelMatch = noel.matcher(linea);
            Matcher folletMatch = follets.matcher(linea);
            Matcher rensMatch = rens.matcher(linea);

            while (rensMatch.find()){
                contarens++;
            }

            while (noelMatch.find()){
                contanoel++;
                contafollet--;
            }
            while (folletMatch.find()){
                contafollet++;
            }

            String res = "";

            //formatem la resposta per adquirir la sortida desitjada
            if(contarens > 0){
                res += "Ren ("+contarens+") ";
            }
            if(contanoel> 0){
                res += "Pare Noel ("+contanoel+") ";
            }
            if(contafollet > 0){
                res += "Follet ("+contafollet+") ";
            }

            //imprimir el resultat
            if(!res.isEmpty()){
                System.out.println(res);
            }else {
                System.out.println(" ");
            }

        }


    }
}
