package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class ZlozenieTransformacji implements Transformacja {

    private final Transformacja[] tab;

    public ZlozenieTransformacji(Transformacja[] tab) {
        this.tab = new Transformacja[tab.length];

        for(int i = 0; i < tab.length; i++) {
            this.tab[i] = tab[i];
        }
    }

    @Override
    public Punkt transformuj(Punkt p) {
        for(int i = 0; i < tab.length; i++) {
            p=tab[i].transformuj(p);
        }
        return p;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() throws
            BrakTransformacjiOdwrotnejException {

        Transformacja[] reversed_tab = new Transformacja[tab.length];
        for(int i = tab.length - 1; i >= 0; i--) {
            reversed_tab[tab.length - 1 - i] = tab[i].getTransformacjaOdwrotna();
        }
        return new ZlozenieTransformacji(reversed_tab);
    }

    @Override
    public String toString() {

        String output = "Zlozenie transformacji: ";
        for(int i = 0; i < tab.length; i++) output = output + tab[i] + " ";

        return output;
    }

}
