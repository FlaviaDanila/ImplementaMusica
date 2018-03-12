
package testimplementamusica;

/**
 *
 * @author Yaki's
 */

public class Cancion extends Coleccion {
    
    private int id;
    private int duracion;
    private String artista;
    private String tituloAlbum;
    private int año;
    private String genero;
    
        @Override
    public int getDuracion() {
        return this.duracion;
    }
        @Override
    public int getCantidad() {
        return this.cantidad;
    
}
