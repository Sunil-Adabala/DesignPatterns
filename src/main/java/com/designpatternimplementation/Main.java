package com.designpatternimplementation;

import com.designpatternimplementation.creationalpatterns.factorymethodpattern.client.Client;
import com.designpatternimplementation.creationalpatterns.factorymethodpattern.factory.FourWheelerFactory;
import com.designpatternimplementation.creationalpatterns.factorymethodpattern.factory.TwoWheelerFactory;
import com.designpatternimplementation.creationalpatterns.factorymethodpattern.product.IVehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Factory Method Pattern
        Client client = new Client(new TwoWheelerFactory());
        IVehicle vehicle = client.getVehicle();
        vehicle.printVehicle();

        client = new Client(new FourWheelerFactory());
        vehicle = client.getVehicle();
        vehicle.printVehicle();

    }
}