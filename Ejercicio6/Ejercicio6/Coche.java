
import java.util.*;

/**
 * 
 */
public class Coche {

    /**
     * Default constructor
     */
    public Coche() {
        this.marca="bmw";
    }

    public Coche(String marca, float kilometraje) {
        this.marca = marca;
        this.kilometraje = kilometraje;
    }

    
    /**
     * 
     */
    private String marca;

    /**
     * 
     */
    private float kilometraje;

    /**
     * 
     */
    private Cliente propietario;



    /**
     * 
     */
    private Motor motor;

    /**
     * 
     */
    public void arranca() {
        // TODO implement here
    }

    /**
     * 
     */
    public void parar() {
        // TODO implement here
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void asignarCliente(Cliente cliente){
        this.propietario=cliente;
    }
    
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", kilometraje=" + kilometraje + '}';
    }

    

}