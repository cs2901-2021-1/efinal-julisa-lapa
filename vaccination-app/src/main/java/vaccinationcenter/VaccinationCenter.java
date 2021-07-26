package vaccinationcenter;

import static constants.GlobalConstants.DADO_BAJA;

public class VaccinationCenter {
    int id;
    double pvaccines;
    double pcobertura;
    int vacunaparcial;
    int vacunacompleta;
    boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPvaccines() {
        return pvaccines;
    }

    public void setPvaccines(double pvaccines) {
        this.pvaccines = pvaccines;
    }

    public double getPcobertura() {
        return pcobertura;
    }

    public void setPcobertura(double pcobertura) {
        this.pcobertura = pcobertura;
    }

    public int getVacunaparcial() {
        return vacunaparcial;
    }

    public void setVacunaparcial(int vacunaparcial) {
        this.vacunaparcial = vacunaparcial;
    }

    public int getVacunacompleta() {
        return vacunacompleta;
    }

    public void setVacunacompleta(int vacunacompleta) {
        this.vacunacompleta = vacunacompleta;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    VaccinationCenter(int id,double pvaccines, double pcobertura,int vacunaparcial,int vacunacompleta){
        setId(id);
        setPvaccines(pvaccines);
        setPcobertura(pcobertura);
        setVacunaparcial(vacunaparcial);
        setVacunacompleta(vacunacompleta);
        setStatus(DADO_BAJA);
    }

}
