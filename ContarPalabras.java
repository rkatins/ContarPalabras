package InicioApp;
import java.util.Scanner;

public class CContarPalabras {
    int contarPalabras = 1;
    int contarCaracter = 0;
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main (String[] args){
        System.out.println("Introduce un Nombre");
        String sCaracter = teclado.nextLine();
        
        int iLongitud = sCaracter.length();
        
        for (int i = 0; i < iLongitud; i++) {
            int iCharConvertido = (int) sCaracter.charAt(i);
            
            if (iCharConvertido == 32 || iCharConvertido == 10) {contarPalabras++;}            
            if (iCharConvertido != 32 || iCharConvertido != 10) {contarCaracter++;}
        }
        System.out.println("El numero de palabras es: " + contarPalabras);
        System.out.println("El numero de caracteres es: " + contarCaracter);
    }
} //CContarPalabras
