
package testimplementamusica;

import java.util.List;

/**
 *
 * @author Yaki's
 */

public class PlayList extends Coleccion {
    
    private List<Coleccion> colecciones;
    private int cantidad;
    
    @Override
    public int getDuracion() {
        return this.duracion;
    }
    
        @Override
    public int getCantidad() {
        return this.cantidad;
    }
    
    
    
}
