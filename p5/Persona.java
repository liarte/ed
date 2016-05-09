
package p5;

public class Persona {
    private String dni;
    private String nombre;
    private String PrimerApellido;
    private String SegundoApellido;
    
    
    public Persona (String dni, String nombre, String PrimerApellido, 
                String SegundoApellido){
        this.dni = dni == null ? "" : dni;
        this.nombre = nombre == null ? "" : nombre;
        this.PrimerApellido = PrimerApellido == null ? "" : PrimerApellido;
        this.SegundoApellido = SegundoApellido == null ? "" : SegundoApellido;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }
}
