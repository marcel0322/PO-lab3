package pl.edu.pg.eti.ksg.po.lab1.transformacje;


import static java.lang.Math.*;

public class Obrot implements Transformacja {

    private final double a;

    public Obrot(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() {
        return new Obrot(-a);
    }

    @Override
    public Punkt transformuj(Punkt p) {

        double newX, newY, angle = a * PI / 180.0;

        newX = p.getX() * cos(angle) - p.getY() * sin(angle);
        newY = p.getX() * sin(angle) + p.getY() * cos(angle);

        return new Punkt(newX, newY);
    }

    @Override
    public String toString() {
        return "Obrot o kat: " + a;
    }
}
