package com.mitdy.et.test;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.time.DateUtils;

public class DataWriter {

    private static final String TERMINATOR = "#";

    public static void main(String[] args) throws IOException {

        test2();
        // test1();
    }

    protected static void test1() throws FileNotFoundException, IOException {
        int COUNT = 10000000;

        Date startTime = new Date();
        System.out.println(startTime);
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("I:/bigdata_1.txt"));
        String createTimeText = "2016-12-17 00:50:00";

        for (int i = 1; i <= COUNT; i++) {
            StringBuffer buffer = new StringBuffer();
            buffer.append(i).append(TERMINATOR).append(createTimeText).append(TERMINATOR).append("system")
                    .append(TERMINATOR).append(createTimeText).append(TERMINATOR).append("system")
                    .append("\r\n");
            outputStream.write(buffer.toString().getBytes());
        }

        outputStream.flush();
        outputStream.close();

        Date endTime = new Date();
        System.out.println(endTime);
        System.out.println("Times: " + ((endTime.getTime() - startTime.getTime()) / 1000) + " s");

        System.out.println("Done!");
    }

    protected static void test2() throws FileNotFoundException, IOException {
        int COUNT = 100000000;

        Date startTime = new Date();
        System.out.println(startTime);
        
        String path = "I:/bigdata_2.txt";
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(path));

        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(1995, 0, 1);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Random random = new Random();
       
        String simpleText = "hello, mysql";
        
        for (int i = 1; i <= COUNT; i++) {
            StringBuffer buffer = new StringBuffer();
            int nextInt = random.nextInt(365 * 10);
            String dateText = format.format(DateUtils.addDays(calendar.getTime(), nextInt));

            buffer.append(i).append(TERMINATOR).append(simpleText).append(TERMINATOR).append(dateText)
                    .append("\r\n");
            outputStream.write(buffer.toString().getBytes());
        }

        outputStream.flush();
        outputStream.close();

        Date endTime = new Date();
        System.out.println(endTime);
        System.out.println("Times: " + ((endTime.getTime() - startTime.getTime()) / 1000) + " s");

        System.out.println("Done!");
        
    }

}
