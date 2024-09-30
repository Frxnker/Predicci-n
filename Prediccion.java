public class Prediccion {
    public static void main(String[] args) {

        // Damos valores a las variables
        int baja = 1;
        int media = 2;
        int alta = 3;
        
        // Usamos math.random y que nos busque un valor entre los 3 anteriores
        int rand1 = (int)(Math.random() * 3) + 1;
        int rand2 = (int)(Math.random() * 3) + 1;
        
        // Mostramos por pantalla los valores de las variables
        System.out.println("Baja = 1 | Media = 2 | Alta = 3");
        System.out.println();

        System.out.println("Predicción del tiempo para mañana: ");
        System.out.println("Presión: " + rand1 + " Humedad: " + rand2);
        System.out.println();

        // Hacemos las comparaciones con "If" y mostramos por pantalla los resultados
        if ((rand1 == baja) && (rand2 == alta)) {
            System.out.println("Muy alta probabilidad de lluvia.");
        } else if ((rand1 == baja) && (rand2 == media)) {
            System.out.println("Alta probabilidad de lluvia.");
        } else if ((rand1 == baja) && (rand2 == baja)) {
            System.out.println("Media probabilidad de lluvia.");
        } else if ((rand1 == media) && (rand2 == media)) {
            System.out.println("Media probabilidad de lluvia.");
        } else {
            System.out.println("Baja probabilidad de lluvia.");
        }

        System.out.println();

        if ((rand1 == baja) && (rand2 == alta)) {
            System.out.println("Baja probabilidad de sol.");
        } else if ((rand1 == baja) && (rand2 == media)) {
            System.out.println("Media probabilidad de sol.");
        } else if ((rand1 == baja) && (rand2 == alta)) {
            System.out.println("Media probabilidad de sol.");
        } else if ((rand1 == media) && (rand2 == media)) {
            System.out.println("Media probabilidad de sol.");
        } else {
            System.out.println("Alta probabilidad de sol.");
        }

        System.out.println();

        if ((rand1 == baja) && (rand2 == alta)) {
            System.out.println("Alta probabilidad de que haga frio.");
        } else if ((rand1 == baja) && (rand2 == media)) {
            System.out.println("Alta probabilidad de que haga frio.");
        } else if ((rand1 == media) && (rand2 == alta)) {
            System.out.println("Alta probabilidad de que haga frio.");
        } else if ((rand1 == media) && (rand2 == media)) {
            System.out.println("Media probabilidad de que haga frio.");
        } else {
            System.out.println("Baja probabilidad de que haga frio.");
        }
    }
}
