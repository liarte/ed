
package p5;

import java.util.ArrayList;
import java.util.List;

public class CalendarioVacuna {
    private List<String> fechaVacuna;
    private List<String> enfermedadVacuna;
    private Mascota mascota;
    
    public CalendarioVacuna(Mascota mascota) {
        enfermedadVacuna = new ArrayList<>();
        fechaVacuna = new ArrayList<>();
        this.mascota = mascota;
    }
    
    public String getFechaVacuna(int fecha) {
        if (fecha >= 0 && fecha < fechaVacuna.size()) {
            return fechaVacuna.get(fecha);
        }
        return null;
    }
    
    public String[] getFechasVacuna() {
        return (String[])fechaVacuna.toArray();
    }

    
    public String getEnfermedadVacuna(int newFecha) {
        if (newFecha >= 0 && newFecha < enfermedadVacuna.size()) {
            return enfermedadVacuna.get(newFecha);
        }
        return null;
    }
    
    public String[] getEnfermedadesVacuna() {
        return (String[]) enfermedadVacuna.toArray();
    }
    
    public Mascota getMascota() {
        return mascota;
    }
    
    public boolean addMascota(Mascota mascota) {
        if (mascota != null) {
            this.mascota = mascota;
            return true;
        }
        return false;
    }
}

