package com.designpatternimplementation.creationalpatterns.factorymethodpattern.factory;

import com.designpatternimplementation.creationalpatterns.factorymethodpattern.product.IVehicle;
import com.designpatternimplementation.creationalpatterns.factorymethodpattern.product.TwoWheelerVehicle;

//subclass that creates a specific object
public class TwoWheelerFactory implements IVehicleFactory{
    @Override
    public IVehicle createVehicle() {
        return new TwoWheelerVehicle(); //instantiate a concrete product
    }
}
