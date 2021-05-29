/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosexa;

/**
 *
 * @author USER
 */
public class videoComunicacion {
    private String nombre;
    private int cantUsuarios;
    private int tiempo;
    private String nivel;
    private int estrellas;
    public videoComunicacion(){    
    }
    public videoComunicacion(String nombre, int cantUsuarios,int tiempo, String nivel, int estrellas){
        this.nombre=nombre;
        this.cantUsuarios=cantUsuarios;
        this.tiempo=tiempo;
        this.nivel=nivel;
        this.estrellas=estrellas;
    }
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String Nombre) {
        this.nombre = Nombre;
    }

    public int getcantUsuarios() {
        return cantUsuarios;
    }

    public void setcantUsuarios(int cantUsuarios) {
        this.cantUsuarios = cantUsuarios;
    }

    public int gettiempo() {
        return tiempo;
    }

    public void settiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getnivel() {
        return nivel;
    }

    public void setnivel(String nivel) {
        this.nivel = nivel;
    }

    public int getestrellas() {
        return estrellas;
    }

    public void setestrellas(int estrellas) {
        this.estrellas = estrellas;
    }
    
    public void Calidad(){
    int calidad;
    calidad=cantUsuarios*tiempo*estrellas;
        System.out.println("La calidas del video es: "+calidad);
}
    @Override
    public String toString() {
        return "videoComunicacion{" + "Nombre=" + nombre + ", cantUsuarios=" + cantUsuarios + ", Tiempo=" + tiempo + ", Nivel=" + nivel + ", Estrellas=" + estrellas + '}';
    }
    }

