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

        //Ejemplo del metodo String.format
        String nombre = "Maria";
        int edad = 30;
        double valor = 5.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d y hoy gaste %.2f dolares",nombre,edad,valor));

        //Ejemplo del metodo formatted usado dentro de un bloque de texto
        String nombre2 = "Gerardo";
        int aulas = 4;

        String mensaje = """
                        Hola, %s!
            Bienvenido al curso de Java.
        Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tus primeros pasos
                en este lenguaje
        
                """.formatted(nombre2,aulas);
        System.out.println(mensaje);
    }
}