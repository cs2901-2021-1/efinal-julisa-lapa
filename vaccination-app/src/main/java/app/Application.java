package app;

import vaccinationCenter.VaccinationCenter;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    List<VaccinationCenter> vaccinationCenterList;

    static final Logger logger = Logger.getLogger(Main.class.getName());


    public void notifyUser(String evento){

    }

    public void visualize(){
        for (int i = 0; i < vaccinationCenterList.size(); i++){
            var temp = vaccinationCenterList.get(i);
            logger.log(Level.FINE,"Avance de la Vacunación (%):",temp.getP_vaccines());
        }
    }
}
