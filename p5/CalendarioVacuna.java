
package p5;


public class CalendarioVacuna {
    protected String fechaVacuna;
    protected String enfermedad;
    
    protected Mascota vacunacionesMascota;
    
    public void setFechaVac(String fechaVac){
        if(fechaVac != null)
            this.fechaVacuna = fechaVac;
    }
    
    public String getFechaVac(){
        return fechaVacuna;
    }
    
    public void setEnfermedad(String enfermedad){
        if(enfermedad != null)
            this.enfermedad = enfermedad;
    }
    
    public String getEnfermedad(){
        return enfermedad;
    }
}

