package Joaircrafthelper;

public final class ConversionHelper {

    //private static final int meterToNm = 1852;

    private static int meterToNm;


    static
    {

        meterToNm = 1852;

    }

    public static int fromFeetToFL(int feet)
    {

        return feet/100;

    }


    public static double fromNmToMeters(double nm)
    {

        return meterToNm * nm;

    }



}
