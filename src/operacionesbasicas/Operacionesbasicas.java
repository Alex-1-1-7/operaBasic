
package operacionesbasicas;

import java.util.Scanner;
public class Operacionesbasicas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        double num, num1 ;
        System.out.println("Escriba un numero: ");
        num = teclado.nextDouble();
        
        System.out.println("Escriba un segundo numero para operar: ");
        num1 = teclado.nextDouble(); 
        
        System.out.println("elija una operacion para realizar entre los numero anteriores");
        
        System.out.println("suma = 1");
        System.out.println("resta = 2");
        System.out.println("multiplicacion = 3");
        System.out.println("division = 4");
        
        int opc;
        opc = teclado.nextInt(); 
        double resul=0;
        
        switch (opc){
            
            case 1:
                resul = num + num1;
                break; 
            
            case 2:
                resul = num - num1;
                break;
            
            case 3:
                resul = num * num1;
                break;
            
            case 4:
                resul = num / num1;
                break;
    
    
    } 
        System.out.println("el sesultado de la operacion es: "+resul);
        
        
    }
    
}
