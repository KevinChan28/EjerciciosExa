/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosexa;

/**
 *
 * @author KEVIN CHAN
 */
public class trabajosTI {
    
    private String nombre;
    private String descripcion;
    private String habilidades;
    private int experiencia;
    private String nivel;
    public trabajosTI() {
    }
     
     public trabajosTI(String Nombre, String Descripcion, String Habilidades, int Experiencia, String Nivel) {
        this.nombre = Nombre;
        this.descripcion = Descripcion;
        this.habilidades = Habilidades;
        this.experiencia = Experiencia;
        this.nivel = Nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String Habilidades) {
        this.habilidades = Habilidades;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.experiencia = Experiencia;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String Nivel) {
        this.nivel = Nivel;
    }
    
    public void sueldo() {
        int salario= 1500*(1+ (experiencia/10)); 
        System.out.println("El salario de la persona es " + salario);
    }
    
    
    
    
    @Override
    public String toString() {
        return "trabajosTI{" + "Nombre=" + nombre + ", Descripcion=" + descripcion + ", Habilidades=" + habilidades + ", Experiencia=" + experiencia + ", Nivel=" + nivel + '}';
    }
    }


