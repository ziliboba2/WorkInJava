package com.homework.homework16;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Iterator;

public class Map {
    public static void main(String[] args) {

        HashMap<String, LocalDate> users = new HashMap<>();
        users.put("Vanya",LocalDate.of(2000, Month.JULY, 2) );
        users.put("Oleg",LocalDate.of(2001, Month.JULY, 4) );
        users.put("Lena",LocalDate.of(2002, Month.SEPTEMBER, 9) );
        users.put("Vova",LocalDate.of(2003, Month.DECEMBER, 22) );
        users.put("Nikita",LocalDate.of(2004, Month.AUGUST, 21) );
        users.put("Alina",LocalDate.of(2005, Month.OCTOBER, 27) );
        users.put("Kolya",LocalDate.of(2006, Month.JUNE, 7) );
        users.put("Nazar",LocalDate.of(2007, Month.MAY, 2) );
        users.put("Diana",LocalDate.of(2008, Month.MARCH, 9) );
        users.put("Vlad",LocalDate.of(2009, Month.JULY, 11) );

        Iterator<HashMap.Entry<String, LocalDate>> itr = users.entrySet().iterator();
        while (itr.hasNext()) {
             if (itr.next().getValue().getMonthValue() == 6 || itr.next().getValue().getMonthValue() == 7 || itr.next().getValue().getMonthValue() == 8) {
                itr.remove();
             }

        }

    }


}
