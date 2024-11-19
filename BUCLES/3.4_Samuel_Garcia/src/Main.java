import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la altura del arbol(cm): ");

        int arbolAltura = 1, arbolMasAlto = 0, indiceArbolMasAlto = 0, indiceArbol = 0;

            while (arbolAltura != -1) {
                arbolAltura = scanner.nextInt();

                if (arbolAltura >= arbolMasAlto) {
                    indiceArbolMasAlto = indiceArbol;
                    arbolMasAlto = arbolAltura;
                    indiceArbol++;
                } else if (arbolAltura < arbolMasAlto) {
                    indiceArbolMasAlto = indiceArbolMasAlto;
                    indiceArbol++;
                }
            }
            System.out.println("el arbol mas alto tiene:" + arbolMasAlto + " cm " + " y su etiqueta es :" + indiceArbolMasAlto);

        }
    }
