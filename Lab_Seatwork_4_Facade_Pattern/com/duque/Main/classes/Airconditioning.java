package classes;

import com.duque.Interfaces.HomeService;

public class Airconditioning implements HomeService {

    @Override
    public String turnOn() {
        return "The air conditioning is on";
    }

    @Override
    public String turnOff() {
        return "The air conditioning is off";
    }
    
}
