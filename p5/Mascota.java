
package p5;

public class Mascota {
    protected String codigo;
    protected String especie;
    protected String raza;
    protected String alias;
    protected String color;
    protected String fechaNacim;
    protected double pesoMedio;
    protected double pesoActual;
    protected int indicePesoActual;
    protected Cliente[] cliente;
    protected CalendarioVacuna calendarioVacuna;
    protected Historial historial;
    
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
    
    public String getAlias() {
        return alias;
    }
    
    public boolean setAlias(String alias) {
        if (alias != null) {
            this.alias = alias;
            return true;
        }
        return false;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public boolean setEspecie(String especie) {
        if (especie != null) {
            this.especie = especie;
            return true;
        }
        return false;
    }
    
    public String getRaza() {
        return raza;
    }
    
    public boolean setRaza(String raza) {
        if (raza != null) {
            this.raza = raza;
            return true;
        }
        return false;
    }
    
        public void setColor(String color) {
        if (color != null)
            this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setFechaNacimiento(String fechaNac) {
        if (fechaNac != null) {
            this.fechaNacim = fechaNac;
        }
    }
    
    public String getFechaNacimiento() {
        return fechaNacim;
    }
    
    public double getPesoMedio() {
        return pesoMedio;
    }
    
    public void setPesoActual(double pesoActual) {
        if (pesoActual > 0) {
            this.pesoActual = pesoActual;
        }
    }
    
    public double getPesoActual() {
        return pesoActual;
    }
}