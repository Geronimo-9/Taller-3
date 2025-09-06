public class Main{
    public static void main(String[] args) {

 // Ejercicio 1, Clase coche y sus respectivas instancias de prueba.
        Coche toyota = new Coche();
        Coche ferrari = new Coche();
        Coche audi = new Coche();
        Coche buggati = new Coche();


    Coche.cantidadCoche();





    //Ejercicio 2, Clase Matematica y Clase Test para llamar static
        System.out.println(Test.suma(9,3));



    //Ejercicio 3, test sobre el uso incorrecto de static
       //Coche.nuevoCoche("Suzuki");

    //Se le coloca el static al atributo marca para acceder y modificarlo directamente.
        Coche.nuevoCoche("Ford");





    

    }
}