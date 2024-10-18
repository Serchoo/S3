package S3;

import java.util.Scanner;
//-------------------------- S3.1 ---------------------------------------------
public class OliverJ {
    public static void main(String[] args){
        //Sergi Oliver

        Scanner lectura = new Scanner (System.in);

        //PISCINA 1
        final double LARGO = 300.3;
        
        System.out.println("Introduce el ancho de la primera piscina: ");
        double ancho1 = lectura.nextInt();

        System.out.println("Introduce la profundidad de la primera piscina: ");
        double profundidad1 = lectura.nextInt();

        //PISCINA 2
        System.out.println("Introduce el ancho de la primera piscina: ");
        double ancho2 = lectura.nextInt();

        System.out.println("Introduce la profundidad de la primera piscina: ");
        double profundidad2 = lectura.nextInt();

        //Apartado 1
        int area1 = (int)(ancho1 * LARGO);

        System.out.println("El área de la primera piscina es: " + area1 + "m²"); 

        int area2 = (int)(ancho2 * LARGO);

        System.out.println("El área de la segunda piscina es: " + area2 + "m²\n");

        //Apartado 2

        int volumen1 = (int)(area1 * profundidad1);

        System.out.println("El volumen de la primera piscina es: " + volumen1 + " Litros");

        int volumen2 = (int)(area2 * profundidad2);

        System.out.println("El volumen de la segunda piscina es: " + volumen2 + " Litros\n");
        

        //Apartado 3
        double largoTotal = LARGO;
        double anchoTotal = ancho1 + ancho2;

        System.out.println("El ancho y el largo de ambas piscinas juntas es: " 
                            + largoTotal + "m de largo y " + anchoTotal + "m de ancho\n");

        // Apartado 4
        int areaTotal = (int)(anchoTotal * LARGO);

        System.out.println("El área de ambas piscinas es de: " + areaTotal + " Litros\n");

        //Apartado 5

        int volumenTotal = (int)(areaTotal * profundidad1);
        
        System.out.println("El volumen de ambas piscinas es de: " + volumenTotal + " Litros\n");

        //Apartado 6

        //Apartado C- Debugg (Sergi Oliver 18/10/2024)
        double aux = profundidad1;
        profundidad1 = profundidad2;
        profundidad2 = aux;

        //Apartado B- Traces (Sergi Oliver 18/10/2024)
        //System.out.println("TR: La profundidad de la primera piscina es de: "+profundidad1+" m");
        //System.out.println("TR: La profundidad de la segunda piscina es de: "+profundidad2+" m");

        volumen1 = (int)(area1 * profundidad1);

        System.out.println("El nuevo volumen de la primera piscina es: " + volumen1 + " Litros");

        volumen2 = (int)(area2 * profundidad2);
        
        System.out.println("El nuevo volumen de la segunda piscina es: " + volumen2 + " Litros\n");
    }
}
