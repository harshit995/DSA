package com.company.Assignment8;

import java.time.ZonedDateTime;

public class  Q5 {

    public static void main(String[] args)
    {
        ZonedDateTime zone = ZonedDateTime.parse("2012-04-11T14:45:30.123456789+05:30[Asia/Kolkata]");
        System.out.println(zone);
    }
}
