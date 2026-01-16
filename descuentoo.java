import java.util.Scanner;
public class descuentoo{
    public static void main (String[] args){
    Scanner scanner =new Scanner(System.in);
     
      final  double descuento = 0.10;

    double azucar,pan,leche,cereal,refresco,resultado;
    System.out.println("Escribe el  costo de la azucar");

    azucar = scanner.nextDouble();

    System.out.println("Escribe el  costo del pan");
    pan = scanner.nextDouble();

    System.out.println("Escribe el  costo de la leche");
    leche = scanner.nextDouble();

   System.out.println("Escribe el  costo de la cereal");
    cereal = scanner.nextDouble();

       System.out.println("Escribe el  costo del refresco");
    refresco = scanner.nextDouble();

    resultado = (azucar+pan+leche+cereal+refresco)*descuento;
    
    System.out.println("el resultado es "+resultado);

    

    
}
}