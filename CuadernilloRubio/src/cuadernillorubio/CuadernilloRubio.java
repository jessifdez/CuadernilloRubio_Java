/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadernillorubio;

import java.util.ArrayList;

/**
 *
 * @author Mañanas
 */
public class CuadernilloRubio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=EntradaSalida.mostrarMenu();
        String nombre_usuario="";
        if(opcion!=4){
        nombre_usuario=EntradaSalida.preguntarNombre();
        }
        //Menu: 1-Sumas 2-Restas 3-Multiplicaciones 4-Salir
        while(opcion!=5)
        {//Aquí podría preguntar cuantas operaciones quiero
            int numero_operaciones=0;
            int respuestas_correctas=0;//Para que te cuente las respuestas correctas
            if(opcion!=4)
            {
                numero_operaciones=EntradaSalida.preguntarCuantas();//Este metodo pregunta cuantas operaciones quiere hacer
            }
            int operaciones_hechas=0;
            switch (opcion)
            {
                        case 1:
                            while(operaciones_hechas<numero_operaciones)
                            {
                            Operacion o=Operacion.obtenerSuma();//Este metodo devuelve un objeto Operacion, que tiene como propiedades los 2 sumandos, el resultado y el signo + y e
                            int respuesta_usuario=EntradaSalida.mostrarOperacion(o);
                            if(respuestaCorrecta(o, respuesta_usuario))
                                {
                                    respuestas_correctas++;
                                    EntradaSalida.darEnhorabuena();
                                }
                            operaciones_hechas++;
                            }  
                            break;
                        case 2:
                            //Lo mismo pero con resta
                            while(operaciones_hechas<numero_operaciones)
                            {
                            Operacion o=Operacion.obtenerResta();//Este metodo devuelve un objeto Operacion, que tiene como propiedades los 2 sumandos, el resultado y el signo + y e
                            int respuesta_usuario=EntradaSalida.mostrarOperacion(o);
                            if(respuestaCorrecta(o, respuesta_usuario))
                                {
                                    respuestas_correctas++;
                                    EntradaSalida.darEnhorabuena();
                                }
                            operaciones_hechas++;
                            }  
                            break;
                        case 3:
                            //Lo mismo pero con multiplicacion
                            while(operaciones_hechas<numero_operaciones)
                            {
                            Operacion o=Operacion.obtenerMultiplicacion();//Este metodo devuelve un objeto Operacion, que tiene como propiedades los 2 sumandos, el resultado y el signo + y e
                            int respuesta_usuario=EntradaSalida.mostrarOperacion(o);
                            //Como respuesta correcta no tiene nada delante significa que pertenece a esta clase y se crea fuera del metodo main
                            if(respuestaCorrecta(o, respuesta_usuario))
                                {
                                    respuestas_correctas++;
                                    EntradaSalida.darEnhorabuena();
                                }
                            
                            operaciones_hechas++;
                            }  
                            break;
                        case 4://Mostrar el ranking
                            ArrayList<Puntuacion> lista_puntuaciones=AccesoFichero.obtenerPuntuaciones();
                            EntradaSalida.mostrarPuntuaciones( lista_puntuaciones);
                            break;              
            }
            //Fin del switch. Ya tengo nombre aciertos, totales y nombre.
            //Grabar nombre, respuestas_correctas,operaciones_totales:
            if(opcion!=4)
            {
            Puntuacion p=new Puntuacion(nombre_usuario,respuestas_correctas,operaciones_hechas);
            //Puntuacion con propiedades nombre, aciertos,puntuacion
            AccesoFichero.grabarPuntuacion(p);
            }
            //Vuelve a mostrar el menu
            opcion=EntradaSalida.mostrarMenu();
        }
    }
    //Cuando define el metodo defino el tipo de variable int, String...
    private static boolean respuestaCorrecta(Operacion mi_oper, int respuesta_usuario) 
    {
        int respuesta_ok=mi_oper.getResultado();
        if (respuesta_ok==respuesta_usuario)
        {
            return true;
        }
        return false;
        //Te dice que if es redundante por lo que hacemos;
        //return(respuesta_ok==respuesta_usuario);
    }
      
}
