package task6;

public interface Convertable {
    double convert(Celsius c);
}

class Celsius {
    private double tempC;

    public Celsius(double tempC) {
        this.tempC = tempC;
    }

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }
}

class Fahrenheit implements Convertable {
    private double tempF;

    public Fahrenheit(double tempF) {
        this.tempF = tempF;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    @Override
    public double convert(Celsius c) {
        return c.getTempC() * 1.8 + 32.;
    }
}

class Kelvins implements Convertable {

    private double tempK;

    public Kelvins(double tempK) {
        this.tempK = tempK;
    }

    public double getTempF() {
        return tempK;
    }

    public void setTempF(double tempK) {
        this.tempK = tempK;
    }

    @Override
    public double convert(Celsius c) {
        return c.getTempC() + 273.15;
    }
}