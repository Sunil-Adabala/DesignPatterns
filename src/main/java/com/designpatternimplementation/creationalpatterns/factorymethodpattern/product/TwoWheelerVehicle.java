package com.designpatternimplementation.creationalpatterns.factorymethodpattern.product;

public class TwoWheelerVehicle implements IVehicle{
    @Override
    public void printVehicle() {
        System.out.println("printing two wheeler vehicle");
    }
}
