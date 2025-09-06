public class Matematicas {


   private double valor1;
   private double valor2;




    static double suma(double valor1, double valor2){
        return valor1 + valor2;
    }

    static double resta(double valor1, double valor2){
        return valor1 - valor2;
    }

    static double multiplica(double valor1, double valor2){
        return valor1 * valor2;
    }

    static double divide(double valor1, double valor2){
        try {
            if(valor2 == 0){
                throw new ArithmeticException("Error");
            }

        } catch (ArithmeticException x){
            System.out.println("¡¡ERROR 301, DIVISION POR CERO NO EXISTE!!");

        } finally {
            return valor1/valor2;
        }

    }

    }




































