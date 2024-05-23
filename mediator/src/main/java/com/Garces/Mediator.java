package com.Garces;

public class Mediator {

    private Radio radio;
    private Phone phone;
    private Car car;

    public Mediator(Radio radio, Phone phone, Car car) {
        this.radio = radio;
        this.phone = phone;
        this.car = car;

        this.radio.setMediator(this);
        this.phone.setMediator(this);
        this.car.setMediator(this);
    }

    public void startCar() {
        System.out.println("Mediator: Starting car.");
        car.starts();
        radio.starts();
        phone.turnOffMusic();
    }

    public void turnOffCar() {
        System.out.println("Mediator: Turning off car.");
        car.turnOff();
        radio.turnOff();
    }

    public void phoneRinging() {
        System.out.println("Mediator: Phone is ringing.");
        phone.toString();
        radio.turnOff();
    }

    public void startRadio() {
        System.out.println("Mediator: Starting radio.");
        radio.starts();
    }
}
