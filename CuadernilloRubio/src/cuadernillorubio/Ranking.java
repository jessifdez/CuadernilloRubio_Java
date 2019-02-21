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
class Ranking {
    private String nombre_usuario;
    private int puntacion;

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public int getPuntacion() {
        return puntacion;
    }

    public Ranking(String nombre_usuario, int puntacion) {
        this.nombre_usuario = nombre_usuario;
        this.puntacion = puntacion;
    }

    
    
}
