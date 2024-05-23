package com.Garces;

public class Config {
    private Radio radio;
    private Phone phone;
    private Car car;
    private Mediator mediator;

    public void initialize() {
        radio = new Radio();
        phone = new Phone();
        car = new Car();

        mediator = new Mediator(radio, phone, car);
    }
    public void demonstrateSystem() {
        mostrarEstadoInicial();

        phone.turnOnMusic();
        System.out.println("\nMúsica encendida en el teléfono.");
        mostrarEstadoActual();

        car.starts();
        System.out.println("\nCoche encendido.");
        mostrarEstadoActual();

        car.turnOff();
        System.out.println("\nCoche apagado.");
        mostrarEstadoActual();

        radio.starts();
        System.out.println("\nRadio encendida manualmente.");
        mostrarEstadoActual();

        phone.phoneCall();
        System.out.println("\nLlamada telefónica entrante.");
        mostrarEstadoActual();
    }

    private void mostrarEstadoInicial() {
        boolean isRadioOn = radio.on();
        boolean isMusicOn = phone.musicOn();

        System.out.println("Estado inicial:");
        System.out.println("Radio encendida: " + isRadioOn);
        System.out.println("Música en teléfono: " + isMusicOn);
    }

    private void mostrarEstadoActual() {
        boolean isRadioOn = radio.on();
        boolean isMusicOn = phone.musicOn();

        System.out.println("\nEstado actual:");
        System.out.println("Radio encendida: " + isRadioOn);
        System.out.println("Música en teléfono: " + isMusicOn);
    }

}
