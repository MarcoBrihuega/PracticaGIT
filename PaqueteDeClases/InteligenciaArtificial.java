package PracticaGIT.PaqueteDeClases;

public class InteligenciaArtificial {

    /**
     * ESTA CLASE SIRVE PARA PODER CREAR UN OBJETO DE TIPO IA , EL CUAL DENTRO DE SI MISMO TIENE 2 FUNCIONES
     * @author MARCO BRIHUEGA GARCIA
     * @since 1.0
     * @version 2.0
     */
    String nombreIA;
    int idIA;

    /**
     * ES EL CONSTRUCTOR DE LA CLASE IA
     * @param nombreIA ES EL NOMBRE QUE SE ASIGNARA PARA LA IA
     * @param idIA  ES EL IDENTIFICADOR NUMERICO DE LA IA
     */
    public InteligenciaArtificial(String nombreIA, int idIA) {
        this.nombreIA = nombreIA;
        this.idIA = idIA;
    }

    public String getNombreIA() {
        return nombreIA;
    }

    public void setNombreIA(String nombreIA) {
        this.nombreIA = nombreIA;
    }

    public int getIdIA() {
        return idIA;
    }

    public void setIdIA(int idIA) {
        this.idIA = idIA;
    }

    @Override
    public String toString() {
        return "InteligenciArtificial{" +
                "nombreIA='" + nombreIA + '\'' +
                ", idIA=" + idIA +
                '}';
    }

    /**
     * MUESTRA LA INFO DEL OBJETO CLASE IA QUE SE LE PASA COMO PARAMETRO
     * @param ia EL PARAMETRO ES EL OBJETO DE CLASE IA QUE SE PASA POR PARAMETRO
     */
    public void mostrarInfoIA(InteligenciaArtificial ia){

        System.out.println(ia.toString());
        System.out.println("***********");
    }
    /** LA IA TE DA LOS BUENOS DIAS DICIENDOTE SU NOMBRE   */
    public void pedirleBuenosDias(){

        System.out.println("BUENOS DIAS SOY " + getNombreIA());
    }

    /**
     * ESTE METODO MUESTRA LA INFO DE LA IA COMO SU NOMBRE E ID
     * @param ia ES EL OBJETO DE CLASE IA QUE SE LE PASA
     * @deprecated replaced by {@link #mostrarInfoIA(InteligenciaArtificial)}   º
     */
    public void verInformacionIA(InteligenciaArtificial ia){
        System.out.println(ia.getNombreIA());
        System.out.println(ia.getIdIA());

    }

    /**
     * ESTE METODO SE USA PARA SABER LAS IDS
     * @param ia es el objeto de clase ia el cual le paso por el constructor
     * @return devuelve en forma de in el id de la ia que se eniva por parametro
     */
    public int pedirId(InteligenciaArtificial ia ){
        return idIA;
    }
}
