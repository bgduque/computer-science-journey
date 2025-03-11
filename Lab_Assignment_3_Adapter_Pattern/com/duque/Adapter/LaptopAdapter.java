package com.duque.Adapter;

import com.duque.Adaptee.Laptop;
import com.duque.Interface.PowerOutlet;

public class LaptopAdapter implements PowerOutlet {
    public Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String plugIn() {
        return laptop.charge();
    }
}
