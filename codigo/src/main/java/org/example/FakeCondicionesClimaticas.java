package org.example;

public class FakeCondicionesClimaticas {
    private double tempCelsius;
    private double lluviaMm;
    private double vientoKmh;

    public FakeCondicionesClimaticas(double tempCelsius, double lluviaMm, double vientoKmh) {
        this.tempCelsius = tempCelsius;
        this.lluviaMm = lluviaMm;
        this.vientoKmh = vientoKmh;
    }

    public Temperatura getTemperatura() {
        return new Temperatura(tempCelsius);
    }

    public Lluvia getLluvia() {
        return new Lluvia(lluviaMm);
    }

    public Viento getViento() {
        return new Viento(vientoKmh);
    }
}
