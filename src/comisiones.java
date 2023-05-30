import java.util.Scanner;
public class comisiones {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido, inserte a continuación su sueldo base: ");
        Scanner sb = new Scanner(System.in);
        Double s1 = sb.nextDouble();
        Double cm = ((s1 * 10)/100)*3;
        Double cmt = s1 + cm;
        System.out.println("El valor obtenido gracias a las comisiones fue de: " + cm + " y el valor total entre su sueldo base y las comisiones es de : " + cmt);
        sb.close();
    }
}
