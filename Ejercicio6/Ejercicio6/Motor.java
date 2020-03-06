
import java.util.*;

/**
 * 
 */
public class Motor {

    /**
     * Default constructor
     */
    public Motor() {
    }

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    /**
     * 
     */
    private int potencia;



    /**
     * 
     */
    private Coche coche;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + '}';
    }
    
    

}