
import java.util.*;

/**
 * 
 */
public class Cliente {

    /**
     * Default constructor
     */
    public Cliente() {
    }

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    
    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String telefono;

    /**
     * 
     */
    private Set<Coche> coche=new HashSet();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Set<Coche> getCoche() {
        return coche;
    }

    public void setCoche(Set<Coche> coche) {
        this.coche = coche;
    }

    public void asignarCoche(Coche coches){
        coche.add(coches);
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }

 
    
    

}