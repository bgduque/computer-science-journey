import classes.TV;

import classes.Airconditioning;
import classes.Light;

public class HomeInterface {

    private TV tv = new TV();
    private Light light = new Light();
    private Airconditioning ac = new Airconditioning();

    public HomeInterface() {
        this.tv = new TV();
        this.light = new Light();
        this.ac = new Airconditioning();
    }

    public void turnOnAll() {
        tv.turnOn();
        light.turnOn();
        ac.turnOn();
    }

    public void turnOffAll() {
        tv.turnOff();
        light.turnOff();
        ac.turnOff();
    }

}