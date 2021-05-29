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
public class EjerciciosExa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     trabajosTI resultado = new trabajosTI();
      resultado.setNombre("Developper");
        resultado.setDescripcion("Desarrollo de aplicaciones");
        resultado.setHabilidades("Programacion");
        resultado.setExperiencia(3);
        resultado.setNivel("Sr");
        
        System.out.println(resultado);
        resultado.sueldo();
        
        
        videoComunicacion plataforma = new videoComunicacion();
        plataforma.setnombre("Meet");
        plataforma.setcantUsuarios(50);
        plataforma.settiempo(4000);
        plataforma.setnivel("Libre");
        plataforma.setestrellas(3);
        
        System.out.println(plataforma);
        plataforma.Calidad();
    }
    
}
