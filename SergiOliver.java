package S3;

public class SergiOliver {
    public static void main(String[] args){
        //Sergi Oliver

        
        //PISCINA 1
        double largo1 = 300.3;
        double ancho1 = 150.5;
        double profundidad1 = 20.5;

        //PISCINA 2
        double largo2 = 300.3;
        double ancho2 = 80.5;
        double profundidad2 = 35.5;

        //Apartado 1
        double area1 = ancho1 * largo1;

        System.out.println("El área de la primera piscina es: " + area1 + "m²"); 

        double area2 = ancho2 * largo2;

        System.out.println("El área de la segunda piscina es: " + area2 + "m²\n");

        //Apartado 2

        double volumen1 = area1 * profundidad1;

        System.out.println("El volumen de la primera piscina es: " + volumen1 + " Litros");

        double volumen2 = area2 * profundidad2;

        System.out.println("El volumen de la segunda piscina es: " + volumen2 + " Litros\n");
        

        //Apartado 3
        double largoTotal = largo1;
        double anchoTotal = ancho1 + ancho2;

        System.out.println("El ancho y el largo de ambas piscinas juntas es: " 
                            + largoTotal + "m de largo y " + anchoTotal + "m de ancho\n");

        // Apartado 4
        double areaTotal = anchoTotal * largo1;

        System.out.println("El área de ambas piscinas es de: " + areaTotal + " Litros\n");

        //Apartado 5

        double volumenTotal = areaTotal * profundidad1;
        
        System.out.println("El volumen de ambas piscinas es de: " + volumenTotal + " Litros\n");

        //Apartado 6
        double aux = profundidad1;
        profundidad1 = profundidad2;
        profundidad2 = aux;

        //Apartado B- Traces
        System.out.println("TR: La profundidad de la primera piscina es de: "+profundidad1+" m");
        System.out.println("TR: La profundidad de la segunda piscina es de: "+profundidad2+" m");

        volumen1 = area1 * profundidad1;

        System.out.println("El nuevo volumen de la primera piscina es: " + volumen1 + " Litros");

        volumen2 = area2 * profundidad2;
        
        System.out.println("El nuevo volumen de la segunda piscina es: " + volumen2 + " Litros\n");
    }
}
