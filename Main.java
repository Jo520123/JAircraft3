package Joaircrafthelper;
import static Joaircrafthelper.ConversionHelper.fromNmToMeters;
import static java.lang.System.out;
import static Joaircrafthelper.ConversionHelper.fromFeetToFL;

public class Main {
    public static void main(String[] args)
    {

        int altFeet = 28000;
        double dNm = 10;


        //int altFl = ConversionHelper.fromFeetToFL(300);
        int altFl = fromFeetToFL(300);
        //System.out.println(altFeet + " Feet to Fl " + altFl);
        out.println(altFeet + " Feet to Fl " +altFl);


        double dM = fromNmToMeters(10);
        out.println(dNm + "Nm to " + dM + "m");


        Calculators.D Cd = new Calculators.D(1,1,3,3);
        out.println("Distance " + Cd.calculate());


    }


}
