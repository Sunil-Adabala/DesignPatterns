package com.designpatternimplementation.creationalpatterns.factorymethodpattern.product;

public class FourWheelerVehicle implements IVehicle{
    @Override
    public void printVehicle() {
        System.out.println("printing four wheeler vehicle"); //Actual vehicle creation decoupled
    }
}
