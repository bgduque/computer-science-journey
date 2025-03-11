package classes;

import com.duque.Interfaces.HomeService;

public class Light implements HomeService{
    @Override
    public String turnOn() {
        return "The light is on";
    }

    @Override
    public String turnOff() {
        return "The light is off";
    }
}
