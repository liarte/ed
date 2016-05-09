
package p5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String codigo;
    private String PrimerApellido;
    private int numCuenta;
    private String direccion;
    private int telf;
    private List<Persona> persona;
    private List<Mascota> mascota;
    
    public Cliente() {
        persona = new ArrayList<>();
        mascota = new ArrayList<>();
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public boolean setCodigo(String codigo) {
        if (codigo != null) {
            this.codigo = codigo;
            return true;
        }
        return false;
    }
    
    public String getPrimerApellido() {
        return PrimerApellido;
    }
    
    public boolean setPrimerApellido(String primerApellido) {
        if (primerApellido != null) {
            this.PrimerApellido = primerApellido;
            return true;
        }
        return false;
    }
    
    public int getNumCuenta() {
        return numCuenta;
    }
    
    public boolean setNumCuenta(int numCuenta) {
        // TO DO
        numCuenta = numCuenta;
        return true;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public boolean setDireccion(String direccion) {
        if (direccion != null) {
            this.direccion = direccion;
            return true;
        }
        return false;
    }
    
    public int getTelf() {
        return telf;
    }
    
    public boolean setTelefono(int telf) {
        // TO DO
        this.telf = telf;
        return true;
    }
    
    public Persona[] getPersona() {
        return (Persona[]) persona.toArray();
    }
    
    public boolean addPersona(Persona persona) {
        if (persona != null) {
            this.persona.add(persona);
            return true;
        }
        return false;
    }
    
    public Mascota[] getMascota() {
        return (Mascota[]) mascota.toArray();
    }
    
    public boolean addMascota(Mascota mascota) {
        if (mascota != null) {
            mascota.addCliente(this);
            this.mascota.add(mascota);
            return true;
        }
        return false;
    }
}

