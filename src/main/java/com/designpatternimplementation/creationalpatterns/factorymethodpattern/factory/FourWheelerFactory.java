package com.designpatternimplementation.creationalpatterns.factorymethodpattern.factory;

import com.designpatternimplementation.creationalpatterns.factorymethodpattern.product.FourWheelerVehicle;
import com.designpatternimplementation.creationalpatterns.factorymethodpattern.product.IVehicle;

//subclass that creates a specific object
public class FourWheelerFactory implements IVehicleFactory {
    @Override
    public IVehicle createVehicle() {
        return new FourWheelerVehicle(); //instantiate a concrete product
    }
}
