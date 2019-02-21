/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadernillorubio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mañanas
 */
public class EntradaSalida {
    static Scanner sc=new Scanner(System.in);
    public static int mostrarMenu(){
        System.out.println("ELIJA UNA OPCIÓN:");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Ver Ranking");
        System.out.println("5-SALIR");
        int opcion=sc.nextInt();//sc no es estático al ser un objeto
        //Podemos meter un salto de linea sc.nextLine() si se traga el otro
        return opcion;       
    }

    public static int preguntarCuantas() {
        System.out.println("¿Cuántas operaciones desea realizar?");
        int n=sc.nextInt();
        return n;
    }

    public static String preguntarNombre() {
        System.out.println("¿Cuál es su nombre?");
        String nombre_usuario=sc.nextLine();
        sc.nextLine();
        return nombre_usuario;
    }

    public static int mostrarOperacion(Operacion mi_operacion) 
    {
        int numero1=mi_operacion.getNumero1();
        int numero2=mi_operacion.getNumero2();
        char signo=mi_operacion.getSigno();
        System.out.println("Responde:");
        //Hay que meter "" entre los numeros y el signo porque si no no lee el signo
        //Tambien uedo meter String.valueOf(signo)
        System.out.println(numero1+""+signo+""+numero2+"=");
        int respuesta=sc.nextInt();
        return respuesta;
    }

    public static void darEnhorabuena() {
        System.out.println("Enhorabuena, has acertado");
    }

    public static void pedirRectificacon() {
        System.out.println("Incorrecto, prueba de nuevo");
    
    }

    static void mostrarRanking(Ranking rank) {
        System.out.println(rank.getNombre_usuario()+rank.getPuntacion());
    }

    static void mostrarPuntuaciones(ArrayList<Puntuacion> lista_puntuaciones) {
        for(int i=0;i<lista_puntuaciones.size();i++)
        {
            Puntuacion p=lista_puntuaciones.get(i);
            int puntos=(int)((p.getAciertos()*10/p.getTotales()));
            System.out.println(p.getNombre()+"....."+puntos);
        }
    }
        
    
}
