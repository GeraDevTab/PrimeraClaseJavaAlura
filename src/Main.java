public class Main {
    public static void main(String[] args) {
        System.out.println("Conclui la aula 01 y ahora estoy sumergiendome en Java!");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDelaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor película del fin del milenio
                Fue lanzada en: 
                
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) media/2;
        System.out.println("Clasificacion: "+clasificacion);

        //*****Ejemplo del metodo String.format
        String nombre = "Maria";
        int edad = 30;
        double valor = 5.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d y hoy gaste %.2f dolares",nombre,edad,valor));

        //*****Ejemplo del metodo formatted usado dentro de un bloque de texto
        String nombre2 = "Gerardo";
        int aulas = 4;

        String mensaje = """
                        Hola, %s!
            Bienvenido al curso de Java.
        Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tus primeros pasos
                en este lenguaje
        
                """.formatted(nombre2,aulas);
        System.out.println(mensaje);

        //*****castin implicito: se realiza automaticamente por el compulador cuando el tipo de dato de origen es compatible con el tipo de datos de destino.
        //por ejemplo, es posible asignar un valor de tipo int a una variable de tipo double, ya que el tipo double es mas grande y puede almacenar todos los valores que el t
        //tipo int puede contener:

        int x = 10;
        double y = x;
        System.out.println("Valor de y: " +y);

        /*
        *****casting explicito: se realiza cuando el tipo de datos de origen es incompatible
        con el tipo de dato de destino. En este caso, debemos utilizar el operador de casting para realizar la conversion
         */
        double m = 10.5;
        int n = (int) m; //casting explicito
        System.out.println("el valor de casting de n a m: "+n);

    }
}