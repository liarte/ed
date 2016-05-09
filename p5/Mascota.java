
package p5;

import java.util.ArrayList;
import java.util.List;

public class Mascota {
    protected String codigo;
    protected String especie;
    protected String raza;
    protected String alias;
    protected String color;
    protected String fechaNacim;
    protected float pesoMedio;
    protected float[] pesoActual;
    protected int indicePesoActual;
    protected List<Cliente> cliente;
    protected CalendarioVacuna calendarioVacuna;
    protected Historial historial;
    
    public Mascota() {
        indicePesoActual = 0;
        cliente = new ArrayList<>();
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
    
    public String getColor() {
        return color;
    }
    
    public boolean setColor(String color) {
        if (color != null) {
            this.color = color;
            return true;
        }
        return false;
    }
    
    public String getFechaNacimiento() {
        return fechaNacim;
    }
    
    public boolean setFechaNacimiento(String fecha) {
        if (fecha != null) {
            fechaNacim = fecha;
            return true;
        }
        return false;
    }
    
    public float getPesoMedio() {
        return pesoMedio;
    }
    
    public float getPesoActual() {
        //TO DO
        return 0;
    }
    
    public boolean setPesoActual(float peso) {
        // TO DO
        return false;
    }
    
    public CalendarioVacuna getCalendario() {
        return calendarioVacuna;
    }
    
    public boolean addCalendario(CalendarioVacuna calendarioVacuna) {
        if (calendarioVacuna != null) {
            this.calendarioVacuna = calendarioVacuna;
            return true;
        }
        return false;
    }
    
    public Historial getHistorial() {
        return historial;
    }
    
    public boolean addHistorial(Historial historial) {
        if (historial != null) {
            historial.addMascota(this);
            this.historial = historial;
            return true;
        }
        return false;
    }
    
    public Cliente getClienteAt(int clientes) {
        if (clientes >= 0 && clientes < cliente.size()) {
            return cliente.get(clientes);
        }
        return null;
    }
    
    public Cliente[] getClientes() {
        return (Cliente[]) cliente.toArray();
    }
    
    public boolean addCliente(Cliente cliente) {
        if (cliente != null) {
            cliente.addMascota(this);
            this.cliente.add(cliente);
            return true;
        }
        return false;
    }
}

