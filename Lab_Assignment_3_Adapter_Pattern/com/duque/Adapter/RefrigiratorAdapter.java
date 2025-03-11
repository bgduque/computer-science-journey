package com.duque.Adapter;

import com.duque.Adaptee.Refrigirator;
import com.duque.Interface.PowerOutlet;

public class RefrigiratorAdapter implements PowerOutlet {

    public Refrigirator refrigirator;

    public RefrigiratorAdapter(Refrigirator refrigirator) {
        this.refrigirator = refrigirator;
    }

    @Override
    public String plugIn() {
        return refrigirator.startCooling();
    }
    
}
