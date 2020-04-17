package pl.edu.pg.eti.ksg.po.lab1;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.*;

public class Javalab1 {

    public static void main(String[] args)
    {
        System.out.println("Zadanie 1:");
        System.out.println();

        Punkt punkt = new Punkt(3.1,2.0);
        System.out.println("Pobieranie wspolrzednych:");
        System.out.println("(" + punkt.getX() + "," + punkt.getY() + ")");

        System.out.println("Drukowanie calego obiektu:");
        System.out.println(punkt);


        Punkt punkt1 = new Punkt(3.1, 2.0);

        System.out.println("Porownanie referencji: punkt == punkt");
        System.out.println(punkt == punkt);

        System.out.println("Porownanie referencji: punkt == punkt1");
        System.out.println(punkt == punkt1);

        System.out.println("Metoda equals: punkt.equals(punkt)");
        System.out.println(punkt.equals(punkt));

        System.out.println("Metoda equals: punkt.equals(punkt1)");
        System.out.println(punkt.equals(punkt1));

        System.out.println("Metoda hashCode: punkt.hashCode()");
        System.out.println(punkt.hashCode());

        System.out.println("Metoda hashCode: punkt1.hashCode()");
        System.out.println(punkt1.hashCode());


        System.out.println("Zadanie 2:");
        System.out.println();

        try {
            Punkt p1 = Punkt.E_X;
            System.out.println(p1);
            Transformacja tr = new Translacja(5, 6);
            System.out.println(tr);
            Punkt p2 = tr.transformuj(p1);
            System.out.println(p2);
            Transformacja trr = tr.getTransformacjaOdwrotna();
            System.out.println(trr);
            Punkt p3 = trr.transformuj(p2);
            System.out.println(p3);
        }
        catch (BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();

        try
        {
            Punkt p1 = new Punkt(2, 2);
            System.out.println(p1);
            Transformacja tr2 = new Skalowanie(5, 4);
            System.out.println(tr2);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();

        try
        {
            Punkt p1 = new Punkt(2, 2);
            Transformacja tr2 = new Skalowanie(5, 0);
            System.out.println(tr2);
            System.out.println(p1);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();


        System.out.println("Zadanie 3:");
        System.out.println();

        try {
            Punkt pkt1 = Punkt.E_X;
            System.out.println(pkt1);
            Transformacja trans = new Obrot(30);
            System.out.println(trans);
            Punkt pkt2 = trans.transformuj(pkt1);
            System.out.println(pkt2);
            Transformacja transs = trans.getTransformacjaOdwrotna();
            System.out.println(transs);
            Punkt pkt3 = transs.transformuj(pkt2);
            System.out.println(pkt3);
        }
        catch (BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();

        try
        {
            Punkt point1 = new Punkt(2, 2);
            System.out.println(point1);
            Transformacja trans2 = new Obrot(0.0);
            System.out.println(trans2);
            Punkt point2 = trans2.transformuj(point1);
            System.out.println(point2);
            Transformacja transs2 = trans2.getTransformacjaOdwrotna();
            System.out.println(transs2);
            Punkt point3 = transs2.transformuj(point2);
            System.out.println(point3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();


        System.out.println("Zadanie 4:");
        System.out.println();

        try
        {
            Transformacja[] transform_tab = new Transformacja[2];
            transform_tab[0] = new Skalowanie(2, 3);
            transform_tab[1] = new Translacja(3, 4);

            ZlozenieTransformacji multi_trans = new ZlozenieTransformacji(transform_tab);
            System.out.println(multi_trans);
            Punkt a1 = new Punkt(1,2);
            System.out.println(a1);
            Punkt a2 = multi_trans.transformuj(a1);
            System.out.println(a2);
            Transformacja reversed_multi_trans = multi_trans.getTransformacjaOdwrotna();
            System.out.println(reversed_multi_trans);
            Punkt a3 = reversed_multi_trans.transformuj(a2);
            System.out.println(a3);
        }
        catch (BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();


    }

}