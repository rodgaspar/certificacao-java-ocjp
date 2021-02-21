import java.time.*;
import java.time.temporal.*;

public class ExDateTime1 {

    public static void main (String[] args){

        /* Classes
            LocalDate
            LocalTime
            LocalDateTime
            MonthDay
            YearMonth
        */

        LocalDate ld  = LocalDate.now();
        LocalTime lt  = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        MonthDay md  = MonthDay.now();
        YearMonth ym  = YearMonth.now();

        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);
        System.out.println(md);
        System.out.println(ym);
        System.out.println();

        //TimeZones
        LocalDateTime ldttz1 = LocalDateTime.now(ZoneId.of("America/Chicago"));
        LocalDateTime ldttz2 = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println(ldttz1);
        System.out.println(ldttz2);
        System.out.println();

        //Datas Exatas
        LocalTime almoco = LocalTime.of(12,00);
        LocalDate natal2019 = LocalDate.of(2019,12,25);
        LocalDateTime almocoNatal19 = LocalDateTime.of(2019,12,25,12,0);
        LocalDateTime almocoNatal2019 = LocalDateTime.of(natal2019,almoco);
        System.out.println(almoco);
        System.out.println(natal2019);
        System.out.println(almocoNatal19);
        System.out.println(almocoNatal2019);
        System.out.println();

        //Extrair partes do Objeto
        System.out.println(almocoNatal2019.getYear());
        System.out.println(almocoNatal2019.getMonth());
        System.out.println(almocoNatal2019.getDayOfMonth());
        System.out.println(almocoNatal2019.getHour());
        System.out.println();

        //Chronofield
        System.out.println(almocoNatal2019.get(ChronoField.DAY_OF_WEEK));
        System.out.println(almocoNatal19.get(ChronoField.DAY_OF_YEAR));




    }

}