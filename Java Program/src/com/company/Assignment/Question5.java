package com.company.Assignment;

public class Question5 {

    public static void main(String[] args) {
        double lat1 = 40.52055555555565;
        double lat2 = 32.61861111111119;
        double lon1 = -2.6297222222222224;
        double lon2 = -2.8997222222222228;
        System.out.println(distance(lat1, lat2, lon1, lon2) + " K.M");
    }

    public static double distance(double lat1,
                                  double lat2, double lon1,
                                  double lon2)
    {
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);


        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));
        double r = 6371;

        // calculate the result
        return(c * r);
    }



}