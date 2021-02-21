import java.time.*;
import java.time.temporal.*;
import java.util.*;

class ExDateTime3{

    public static void main(String[] Args){

        //Conversão de objetos da classes do java.time "to"
        LocalDateTime ldt = LocalDateTime.now();
        LocalTime lt = ldt.toLocalTime();
        LocalDate ld = ldt.toLocalDate();

        System.out.println(ldt);
        System.out.println(lt);
        System.out.println(ld);
        System.out.println();

        //Concaternar objetos para formar um LocalDateTime "at"
        LocalDateTime ldt2 = lt.atDate(ld);
        LocalDateTime ldt3 = ld.atTime(lt);

        System.out.println(ldt2);
        System.out.println(ldt3);
        System.out.println();

        //Conversão de Date e Calendar para LocalDateTime "instant"
        Date d = new Date();
        Instant i = d.toInstant();
        LocalDateTime ldt4 = LocalDateTime.ofInstant(i,ZoneId.systemDefault());
        System.out.println(ldt4);
        System.out.println();

        Calendar c = Calendar.getInstance();
        i = c.toInstant();
        LocalDateTime ldt5 = LocalDateTime.ofInstant(i,ZoneId.systemDefault());
        System.out.println(ldt5);

        LocalDateTime ldt6 = LocalDateTime.now();
        i = ldt6.toInstant(ZoneOffset.UTC);
        Date d2 = Date.from(i);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(d2);

        System.out.println(ldt6);
        System.out.println(d2);
        System.out.println(c2);

    }
}