import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iPlato1 , iPlato2 , iPlato3;
        int ipedido , ipedidoOriginal;
        System.out.println("Introduzca codigo de tres cifras para introducir los platos que quieras");
        ipedido = sc.nextInt();
        ipedidoOriginal = ipedido;
        //variables booleanas para comprobar la validez de los platos
        boolean blnValido1=false ,blnValido2=false,blnValido3=false;

        if(ipedido<1000 && ipedido>=0){
            //sacamos unidades , decenas y centenas
            iPlato3=ipedido%10;
            ipedido=ipedido/10;
            iPlato2=ipedido%10;
            ipedido=ipedido/10;
            iPlato1=ipedido%10;

            //comprobamos plato 1
            switch(iPlato1){
                case 1,2,4,5,6,7,8,9:
                    blnValido1=true;
                    break;
                case 0,3:
                   blnValido1=false;
                    break;
            }
            //comprobamos plato 2
            switch(iPlato2){
                case 2,5,6,7,8,9:
                    blnValido2=true;
                    break;
                case 1,3,4,0:
                    blnValido2=false;
                    break;
            }
            //comprobamos plato 3
            switch(iPlato3){
                case 2,4,6,8:
                    blnValido3=true;
                    break;
                case 0,1,3,5,7:
                    blnValido3=false;
                    break;
            }

            //comprobamos la validez del pedido
            if(blnValido1 && blnValido2 && blnValido3){
                System.out.println("El pedido "+ipedidoOriginal+" esta valido");
            }else{
                System.out.println("El pedido "+ipedidoOriginal+" no es valido ");
            }

        }else{
            System.out.println("Rango incorrecto");
        }


    }
}