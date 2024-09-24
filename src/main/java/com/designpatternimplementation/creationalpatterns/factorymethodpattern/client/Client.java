package com.designpatternimplementation.creationalpatterns.factorymethodpattern.client;

import com.designpatternimplementation.creationalpatterns.factorymethodpattern.factory.IVehicleFactory;
import com.designpatternimplementation.creationalpatterns.factorymethodpattern.product.IVehicle;

public class Client {
    IVehicle vehicle;

    public Client(IVehicleFactory vehicleFactory) {
        vehicle = vehicleFactory.createVehicle(); //Client is unaware of which and how the object is created.
    }

    public IVehicle getVehicle() {
        return vehicle;
    }
}
