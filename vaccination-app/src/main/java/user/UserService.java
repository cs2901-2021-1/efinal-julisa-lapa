package user;

import app.Main;

import java.util.logging.Level;
import java.util.logging.Logger;
import vaccinationCenter.VaccinationCenter;

import static constants.GlobalConstants.DADO_ALTA;
import static constants.GlobalConstants.DADO_BAJA;
import static java.lang.Math.max;

public class UserService implements UserRepository{
    VaccinationCenter vaccinationCenter;
    UserRepository userRepository;
    User user;

    static final Logger logger = Logger.getLogger(Main.class.getName());

    @Override
    public boolean exists(String nombre){
        return nombre.equals(user.getNombre());
    }

    public void login(String nombre, String pass){
        if (! userRepository.exists(nombre)) logger.log(Level.SEVERE,"Usuario no exsite!!");
        int i = 0;
        int s = max(nombre.length(), pass.length());
        while (nombre.charAt(i) == pass.charAt(-i)){
            i++;
        }
        if(i == s) logger.info("Loggeo completado exitosamente");
        else logger.info("No se pudo inciar sesión! (Revise nombre / contraseña)");
    }

    public void darAlta(){
        vaccinationCenter.setStatus(DADO_ALTA);
    }

    public void darBaja(){
        vaccinationCenter.setStatus(DADO_BAJA);
    }

    public void logout(){
       logger.log(Level.SEVERE,"Bye, bye");
    }
}
