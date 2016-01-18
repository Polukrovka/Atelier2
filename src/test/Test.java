package test;

import atelier.Oeuvre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test {
    SimpleDateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
    try{
        Date d1 = dfm.parse("03/12/2014");
        Date d2 = dfm.parse("21/02/1923");
        Date d3 = dfm.parse("01/10/1876");
        Date d4 = dfm.parse("09/09/1999");
        Date d5 = dfm.parse("07/04/2002");
    } catch(ParseException e){

    }

    Oeuvre[] oeuvres = new Oeuvre[10];
    Oeuvre[0] = new Oeuvre()




}
