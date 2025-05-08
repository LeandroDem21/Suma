import java.util.Scanner;
public class Suma{
public static void main(String[]args){
Scanner almacenar = new Scanner(System.in);
System.out.println("Escribe el 1er numero");
int numero = almacenar.nextInt();
System.out.println("Escribe el 2do numero");
int numero2 = almacenar.nextInt();
System.out.println("Escribe 3er numero");
int numero3 = almacenar.nextInt();
int suma=numero + numero2 + numero3;
System.out.println("La suma de los numeros es:" + suma);
}

}