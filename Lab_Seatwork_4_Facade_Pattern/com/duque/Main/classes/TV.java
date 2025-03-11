package classes;

import com.duque.Interfaces.HomeService;

public class TV implements HomeService {

    @Override
    public String turnOn() {
        return "The TV is on";
    }

    @Override
    public String turnOff() {
        return "The TV is off";
    }
    
}
