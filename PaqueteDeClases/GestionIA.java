package PracticaGIT.PaqueteDeClases;

/**
 *ESTA CLASE SE UTILIZA PARA PODER GESTIONAR EL OBJETO IA CAMBIANDOLE EL ID A LA IA Y CAMBIANDOLE EL NOMBRE A LA IA
 * @author MARCO BRIHUEGA
 * @since 1.1
 * @version 1.2
 *
 */
public class GestionIA {

    private static int contadorIdCambiados;
    private static int contadorNombresIaCambiados;

    public static void cambiarIdIa(InteligenciaArtificial ia,int id){

        ia.setIdIA(id);
        System.out.println("ID CAMBIADO CORRECTAMENTE");
        contadorIdCambiados++;
    }

    /**
     * CON ESTE METODO PUEDO CAMBIAR EL NOMBRE DE LA PASANDOLE EL NUEVO NOMBRE POR PARAMETRO
     * @param ia ES EL OBJETO CLASE IA AL CUAL LE VOY A CAMBIAR EL NOMBRE
     * @param nuevoNombre ES EL NOMBRE EL CUAL VA ADQUIRIR NUEVO LA IA
     */
    public static void cambiarNombreIa(InteligenciaArtificial ia,String nuevoNombre){

        ia.setNombreIA(nuevoNombre);
        System.out.println("EL NOMBRE FUE CAMBIADEO CORRECTAMENTE");
        contadorNombresIaCambiados++;
    }



}
