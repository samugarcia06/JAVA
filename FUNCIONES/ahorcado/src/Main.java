import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
       Menu();
       String[] sPalabras= {"ordenador","computador","programa","informatica","pantalla","teclado","raton","wifi","memoria", "datos","placa","tecnologia","empresa","descanso","repositorio","contenedor","contador","recursividad","tabla","fila", "funcion","bucle","condicional"};

    }

    public static char LeerChar() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public static void Menu() {
        System.out.println("Bienvenido al ahorcado");
        System.out.println("El juego consiste en adivinar una palabra , letra a letra");
        System.out.println("Pulsa para elegir nivel");

    }

    public static String PalabraAleatorio(String[] sPalabras) {
        Random random = new Random();
        int IndiceAleatorio = random.nextInt(sPalabras.length);
        String PalabraAleatoria = sPalabras[IndiceAleatorio];
        return PalabraAleatoria;
    }

    public static void Cuerpo(String[] sPalabras , String PalabraAleatoria){
        System.out.println("Introduce letra");
        char cletra = LeerChar();
        for(int i=0;i<PalabraAleatoria.length();i++){
            System.out.print("_");
        }
        if(cletra==PalabraAleatoria.charAt(0)) {

        }
    }
    public static char[] inicializarLetrasAdivinadas(int longitud) {
        char[] letrasAdivinadas = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            letrasAdivinadas[i] = '_';
        }
        return letrasAdivinadas;
    }

    //C o m p u t a d o r
    //_ _ _ _ _ _ _ _ _ _
    //si acierta una letra , escribirla en la posicion
    //C   m p   t     o r
    //_ _ _ _ _ _ _ _ _ _

}



