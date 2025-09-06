public class Coche {

private static String marca = "Toyota";
private String modelo;
private static double contadorCoche = 0;






public Coche(){
    contadorCoche++;
}





public static void cantidadCoche(){
    System.out.println("Coches encontrados: "+ contadorCoche);
}

public static void nuevoCoche(String x){

    System.out.println(marca = x);

}






}















