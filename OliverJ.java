package S3;

public class SergiOliver {
    public static void main(String[] args){
        //Sergi Oliver

        
        //PISCINA 1
        final double LARGO1 = 300.3;
        final double ANCHO1 = 150.5;
        double profundidad1 = 20.5;

        //PISCINA 2
        final double LARGO2 = 300.3;
        final double ANCHO2 = 80.5;
        double profundidad2 = 35.5;

        //Apartado 1
        double area1 = ANCHO1 * LARGO1;

        System.out.println("El área de la primera piscina es: " + area1 + "m²"); 

        double area2 = ANCHO2 * LARGO2;

        System.out.println("El área de la segunda piscina es: " + area2 + "m²\n");

        //Apartado 2

        double volumen1 = area1 * profundidad1;

        System.out.println("El volumen de la primera piscina es: " + volumen1 + " Litros");

        double volumen2 = area2 * profundidad2;

        System.out.println("El volumen de la segunda piscina es: " + volumen2 + " Litros\n");
        

        //Apartado 3
        double largoTotal = LARGO1;
        double anchoTotal = ANCHO1 + ANCHO2;

        System.out.println("El ancho y el largo de ambas piscinas juntas es: " 
                            + largoTotal + "m de largo y " + anchoTotal + "m de ancho\n");

        // Apartado 4
        double areaTotal = anchoTotal * LARGO1;

        System.out.println("El área de ambas piscinas es de: " + areaTotal + " Litros\n");

        //Apartado 5

        double volumenTotal = areaTotal * profundidad1;
        
        System.out.println("El volumen de ambas piscinas es de: " + volumenTotal + " Litros\n");

        //Apartado 6

        //Apartado C- Debugg (Sergi Oliver 18/10/2024)
        double aux = profundidad1;
        profundidad1 = profundidad2;
        profundidad2 = aux;

        //Apartado B- Traces (Sergi Oliver 18/10/2024)
        //System.out.println("TR: La profundidad de la primera piscina es de: "+profundidad1+" m");
        //System.out.println("TR: La profundidad de la segunda piscina es de: "+profundidad2+" m");

        volumen1 = area1 * profundidad1;

        System.out.println("El nuevo volumen de la primera piscina es: " + volumen1 + " Litros");

        volumen2 = area2 * profundidad2;
        
        System.out.println("El nuevo volumen de la segunda piscina es: " + volumen2 + " Litros\n");
    }
}
