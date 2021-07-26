package vaccinationCenter;

import static constants.GlobalConstants.DADO_BAJA;

public class VaccinationCenter {
    int id;
    double p_vaccines;
    double p_cobertura;
    int vacuna_parcial;
    int vacuna_completa;
    boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getP_vaccines() {
        return p_vaccines;
    }

    public void setP_vaccines(double p_vaccines) {
        this.p_vaccines = p_vaccines;
    }

    public double getP_cobertura() {
        return p_cobertura;
    }

    public void setP_cobertura(double p_cobertura) {
        this.p_cobertura = p_cobertura;
    }

    public int getVacuna_parcial() {
        return vacuna_parcial;
    }

    public void setVacuna_parcial(int vacuna_parcial) {
        this.vacuna_parcial = vacuna_parcial;
    }

    public int getVacuna_completa() {
        return vacuna_completa;
    }

    public void setVacuna_completa(int vacuna_completa) {
        this.vacuna_completa = vacuna_completa;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    VaccinationCenter(int id,double p_vaccines, double p_cobertura,int vacuna_parcial,int vacuna_completa){
        setId(id);
        setP_vaccines(p_vaccines);
        setP_cobertura(p_cobertura);
        setVacuna_parcial(vacuna_parcial);
        setVacuna_completa(vacuna_completa);
        setStatus(DADO_BAJA);
    }

}
