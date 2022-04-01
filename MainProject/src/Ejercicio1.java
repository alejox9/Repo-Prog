//cargarlo 
//mostrarlo
//mostrar el número mayor
//mostrar el numero menor
//mostrar la suma de todos sus números
//mostrar promedio de todos sus números
import java.util.Scanner;

public class Ejercicio1 {
     public static void main(String[] args) {
         int [] edad=new int [10];
         int num [], cant=5, i;
         Scanner entrada=new Scanner (System.in);
         num=new int [cant];
          
         for (i=0; i<cant;i++){
             System.out.println("Ingrese un número posición" +(i+1));
             num[i]=entrada.nextInt();
         }
         edad[8]=24;
         for (i=0; i<cant;i++){
             System.out.println(num[i]);
         }
    }
}
