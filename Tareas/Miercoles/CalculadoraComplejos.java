/**
 * Tarea 2: Calculadora complejos, por Prebe20
**/
import java.util.Scanner;

public class CalculadoraComplejos {
    
    double a,b,c,d;

    public static void main(String[] args) {
        CalculadoraComplejos S = new CalculadoraComplejos();
        Scanner sc=new Scanner(System.in);
        boolean bandera=true;
        
        do{
        System.out.println("\n\n*****Calculadora de números complejos*****");
        System.out.println("Introduce la parte real: ");
        S.a=sc.nextDouble();
        System.out.println("Introduce parte imaginaria: ");
        S.b=sc.nextDouble();
        System.out.println("Introduce la parte real del segundo número: ");
        S.c=sc.nextDouble();
        System.out.println("Introduce parte imaginaria del segundo número: ");
        S.d=sc.nextDouble();
        System.out.println("\nElige una opción");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Producto");
        System.out.println("4. División");
        System.out.println("5. Sacar magnitud");
        System.out.println("6. Angulo");
        System.out.println("7. Salir");
        int op=sc.nextInt();
        
        switch(op)
        {       
        case 1:
            S.Sumar();
            break;
                    
        case 2:
            S.Restar();
            break;

        case 3:
            S.Multiplicar();
            break;
                    
        case 4:
            if(S.c==0 && S.d==0){
            System.out.println("No se puede realizar la division");
            }               
            else
                S.Dividir();  
            break;
        case 5:
            S.Magnitud();
            break;
        case 6:
            if(S.a==0 && S.c==0){
            System.out.println("No se puede realizar la division");
            }               
            else
                S.Angulo();
            break;
        case 7:
            System.out.println("\nSaliste!");
            bandera=false;
            break;
        default:
             System.out.println("Error Ingresa un número del 1 al 4"); 
        }
        }while(bandera);
    } 
    
    public void Sumar(){
        if((b+d)>0)
            System.out.println("la suma es: "+(a+c)+"+"+(b+d)+"i");
        else{
            System.out.print("la suma es: "+(a+c));
            System.out.print(" "+(b+d)+"i");}
    }
    public void Restar(){
         if((b-d)>0)
            System.out.println("la suma es: "+(a-c)+"+"+(b-d)+"i");
         else{
            System.out.print("la resta es: "+(a-c));
            System.out.print(" "+(b-d)+"i");}
    }
    public void Multiplicar(){
         if(((a*d)+(b*c))>0)
            System.out.println("el producto es:"+((a*c)-(b*d))+"+"+((a*d)+(b*c))+"i");
         else{
            System.out.print("el producto es: "+((a*c)-(b*d)));
            System.out.print(" "+((a*d)+(b*c))+"i");}
    }
    public void Dividir(){
        double r,i;
        r=((a*c)+(b*d))/((c*c)+(d*d));
        i=((b*c)-(a*d))/((c*c)+(d*d));
        if(i>0)
        System.out.println("la división es: "+r+"+"+i+"i");
        else{
            System.out.print("la división es:"+r);
            System.out.println(" "+i+"i");}
    }
    public void Magnitud(){
        System.out.println("La primera magnitud es: "+Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
        System.out.println("La segunda magnitud es: "+Math.sqrt(Math.pow(c,2)+Math.pow(d,2)));
    }
    public void Angulo(){
        System.out.println("Primer angulo: "+Math.atan(b/a));
        System.out.println("Segundo angulo: "+Math.atan(d/c));
    }
}
