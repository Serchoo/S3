import java.util.Scanner;

public class InscripcioEscola {
    public static void main(String[] args) {
        int numeroAlumno = 1;
        int puntos = 0;
        int hermano;
        int poblacion;
        int trabajoPadres;
        int discapacidad;
        int familiaNumerosa;
        int escolarizado;

        int inscribirAlumnos = 1;
        //Nos perimte la lectrura por teclado
        Scanner lectura = new Scanner (System.in);

        //Cada vez que inscriba uno nos va a pedir si queremos seguir inscribiendo si es asi volvemos a empezar hasta 
        //indicar que no queremos inscribir mas
        while(inscribirAlumnos != 0){
            System.err.println("\n---------- Alumno "+ numeroAlumno+"----------");

            //----------------------APARTADO 1-----------------------------------------------
            System.out.println("\nTienes un hermano en el centro (0: no / 1:si)?");
            hermano = lectura.nextInt();

            if(controlErrores(hermano)){
                //si tiene un hermano en el centro suma 40
                if(hermano == 1){
                    puntos += 40;
                }
            }else{
                System.err.println("SE HA INTRODUCIDO INCORRECTAMENTE NO SE SUMARAN PUNTOS");
            }

            //----------------------APARTADO 2-----------------------------------------------
            System.out.println("\nResides cerca de la escuela (0: no / 1:si)?");
            poblacion = lectura.nextInt();

            System.out.println("\nPadres trabajan cerca de la escuela (0: no / 1:si)?");
            trabajoPadres = lectura.nextInt();

            if(controlErrores(poblacion) && controlErrores(trabajoPadres)){
                //Si vive cerca y sus padres trabajan cerca, nos quedamos con vivir cerca
                if(poblacion == 1 && trabajoPadres == 1){
                    puntos += 30;
                }else //Si no priorizamos mirar que viva cerca, si es asi sumamos 30
                    if(poblacion == 1){
                    puntos += 30;
                }else//Si no se mira si sus padres trabajan cerca, si es asi sumamos 20
                    if(trabajoPadres == 1){
                    puntos += 20;
                }
            }else{
                System.err.println("SE HA INTRODUCIDO INCORRECTAMENTE NO SE SUMARAN PUNTOS");
            }

            //----------------------APARTADO 3-----------------------------------------------
            System.out.println("\nDiscapacidad o enfermedad crónica (0: no / 1:si)?");
            discapacidad = lectura.nextInt();

            if(controlErrores(discapacidad)){
                //Si tiene dicapacidad o enfermedad crónica, suma 10
                if(discapacidad == 1){
                    puntos += 10;
                }
            }else{
                System.err.println("SE HA INTRODUCIDO INCORRECTAMENTE NO SE SUMARAN PUNTOS");
            }


            //----------------------APARTADO 4-----------------------------------------------
            System.out.println("\nFamilia numerosa / Monoparental (0: no / 1:si)?");
            familiaNumerosa = lectura.nextInt();

            if(controlErrores(familiaNumerosa)){
                //Si es familia numerosa o monoparental, sumamos 15
                if(familiaNumerosa == 1){
                    puntos += 15;
                }
            }else{
                System.err.println("SE HA INTRODUCIDO INCORRECTAMENTE NO SE SUMARAN PUNTOS");
            }
            

            //----------------------APARTADO 5-----------------------------------------------
            System.out.println("\nTutor legal o hermano escolarizado (0: no / 1:si)?");
            escolarizado = lectura.nextInt();
            if(controlErrores(escolarizado)){
                //Si un familiar fue escolarizado, sumamos 5
                if(escolarizado == 1){
                    puntos += 5;
                }
            }else{
                System.err.println("SE HA INTRODUCIDO INCORRECTAMENTE NO SE SUMARAN PUNTOS");
            }

            //----------------------PUNTOS TOTALES-----------------------------------------------
            System.out.println("\n------------Los puntos del alumno "+numeroAlumno+ " es de "+puntos+"-----------------");

            System.out.println("\nQuieres seguir inscribiendo alumnos (0: no / 1:si)?");
            inscribirAlumnos = lectura.nextInt();

            if(!controlErrores(inscribirAlumnos)){
                System.err.println("SE HA INTRODUCIDO INCORRECTAMENTE: NO SE INSCRIBIRAN MAS ALUMNOS");
                inscribirAlumnos =  0;
            }
            //Pasa al siguiente alumno
            numeroAlumno++;
        }

    }

    //Metodo para comprobar si un numero no es ni uno ni 0
    public static boolean controlErrores(int numero){
        if(numero != 0 && numero != 1){
            return false;
        }
        return true;
    }
    
}
