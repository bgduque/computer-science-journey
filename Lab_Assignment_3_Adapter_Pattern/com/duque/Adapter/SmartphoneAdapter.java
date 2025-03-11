package com.duque.Adapter;

import com.duque.Adaptee.SmartphoneCharger;
import com.duque.Interface.PowerOutlet;

public class SmartphoneAdapter implements PowerOutlet {

    public SmartphoneCharger smartphone;

    public SmartphoneAdapter(SmartphoneCharger smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String plugIn() {
        return smartphone.chargePhone();
    }
    
}
