import java.util.Random;

public class juegoCartas {
    public static void main(String[] args) {
        String [][] cartas = crearMatrizCartas();
        inicializarCartasJuego(cartas);

        }

    public static String[][] crearMatrizCartas(){
        String [][] matrizVacia = new String[12][2];
        return matrizVacia;
    }

    public static void agregarCartas(String nombreCarta, String puntaje,String [][] matrizVacia){
        for (int i = 0; i < matrizVacia.length; i++){
            if (matrizVacia[i][0] == null){
                matrizVacia[i][0] = nombreCarta;
                matrizVacia[i][1] = puntaje;
                break;
            }
        }
    }

    public static void inicializarCartasJuego(String [][] matrizVacia){
        agregarCartas("As","11", matrizVacia);
        agregarCartas("Dos","2", matrizVacia);
        agregarCartas("Tres","3", matrizVacia);
        agregarCartas("Cuatro","4", matrizVacia);
        agregarCartas("Cinco","5", matrizVacia);
        agregarCartas("Seis","6", matrizVacia);
        agregarCartas("Siete","7", matrizVacia);
        agregarCartas("Ocho","8", matrizVacia);
        agregarCartas("Nueve","9", matrizVacia);
        agregarCartas("Jota","10", matrizVacia);
        agregarCartas("Queena","10", matrizVacia);
        agregarCartas("Kayser","10", matrizVacia);
    }

    public static String[][] obtenerCartas(String [][] cartas) {
        String [][] cartasJugador = new String[3][2];
        Random numerosAzar = new Random();
        int primeraCarta = numerosAzar.nextInt(cartas.length);
        int segundaCarta = numerosAzar.nextInt(cartas.length);
        int terceraCarta = numerosAzar.nextInt(cartas.length);
        cartasJugador[0][0] = cartas[primeraCarta][0];
        cartasJugador[0][1] = cartas[primeraCarta][1];
        cartasJugador[1][0] = cartas[segundaCarta][0];
        cartasJugador[1][1] = cartas[segundaCarta][1];
        cartasJugador[2][0] = cartas[terceraCarta][0];
        cartasJugador[2][1] = cartas[terceraCarta][1];
        return cartasJugador;



    }
}
