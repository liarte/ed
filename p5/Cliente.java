
package p5;

public class Cliente {
    private String codigo;
    private String PrimerApellido;
    private int numCuenta;
    private String direccion;
    private int telf;
    protected Persona[] datos;
    protected Mascota[] mascota;
    
    public Cliente() {
        // TO DO
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
}
    
    