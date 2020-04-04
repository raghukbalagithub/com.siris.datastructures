package com.siris.datastructures.generic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HumanDateTimeToEpoch {
    public static void main(String[] args) throws ParseException {
        //GET CURRENT DATE
        Date currDateTime = new Date(System.currentTimeMillis());
        //System.out.println(currDateTime);

        //CONVERT INTO CALENDAR OBJECT
        Calendar cal = Calendar.getInstance();
        cal.setTime(currDateTime);

        //SET HOUR, MINUTES AND SECONDS TO START OF DAY
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND, 0);

        SimpleDateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");

        //GENERATE END DATE IN EPOCH FORMAT
        Date end_dt = cal.getTime();
        long epoch_endDate = (df.parse(end_dt.toString())).getTime();

        //GENERATE START DATE IN EPOCH FORMAT
        cal.add(Calendar.DATE, -10);
        Date start_dt = cal.getTime();
        long epoch_startDate = (df.parse(start_dt.toString())).getTime();

        System.out.println(epoch_startDate);
        System.out.println(epoch_endDate);
    }
}
