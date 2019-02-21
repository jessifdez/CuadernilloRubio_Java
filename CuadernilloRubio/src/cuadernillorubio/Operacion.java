/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadernillorubio;

/**
 *
 * @author Mañanas
 */
public class Operacion {

    
    private static int numero1,numero2,resultado;
    private static char signo;

    Operacion(String dato, String dato0, String dato1) {
        
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public char getSigno() {
        return signo;
    }

    public Operacion(int numero1, int numero2, int resultado, char signo) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
        this.signo = signo;
    }
    
    public static int obtenerAleatorio()
    {//Invocación al método Math.random
      double d=Math.random();
      //Para que de un numero entre 1-10, sino solo devuelve nº entre 0 y 1
      d=(d*9+1);
      int numero_aleatorio=(int)d;
      return numero_aleatorio;
     }
    
    public static Operacion obtenerSuma() {//Devuelve objeto tipo Operacion
        char signo='+';
        int numero1=Operacion.obtenerAleatorio();
        int numero2=Operacion.obtenerAleatorio();
        int resultado=numero1+numero2;
        Operacion o=new Operacion(numero1, numero2, resultado, signo);
        return o;
    }
    public static Operacion obtenerResta() {
        int numero1=Operacion.obtenerAleatorio();
        int numero2=Operacion.obtenerAleatorio();
        //Para que numero1 sea siempre mayor que numero2 le pido que:
        /*while(numero2>numero1){
            numero2=obtenerAleatorio();
        }*/
        //Otra forma es cambiar el orden de los numeros
        if(numero1<numero2){
            int a=numero1;
            numero1=numero2;
            numero2=a;           
        }
        char signo='-';
        int resultado=numero1+numero2;
        Operacion o=new Operacion(numero1, numero2, resultado, signo);
        return o;
    }
    public static Operacion obtenerMultiplicacion() {
        char signo='*';
        int numero1=Operacion.obtenerAleatorio();
        int numero2=Operacion.obtenerAleatorio();
        int resultado=numero1*numero2;
        Operacion o=new Operacion(numero1, numero2, resultado, signo);
        return o;
    }
}
