import java.time.*;
import java.time.temporal.*;

class ExDateTime2{

    public static void main(String[] args){


        //Comparações "is"
        LocalDate ld1 = LocalDate.of(2020,12,25);
        LocalDate ld2 = LocalDate.of(2020,12,26);

        System.out.println(ld1.isBefore(ld2));
        System.out.println(ld1.isAfter(ld2));
        System.out.println(ld1.isEqual(ld2));
        System.out.println();

        //As classes da API time são imutaveis "with"
        LocalDate ld3 = LocalDate.now();
        LocalDate ld4 = ld3.withMonth(10)
                            .withYear(1984);
        System.out.println(ld3);
        System.out.println(ld4);
        System.out.println();

        //Operações "plus" e "minus"
        LocalDate ld5 = LocalDate.now();
        LocalDate ld6 = ld3.plusYears(10)
                            .plusMonths(2)
                            .minusDays(1);
        System.out.println(ld5);
        System.out.println(ld6);
        System.out.println();

        //ChronoUnit
        LocalDate ld7 = LocalDate.now();
        LocalDate ld8 = ld3.plus(10, ChronoUnit.YEARS)
                            .minus(1 , ChronoUnit.DAYS);
        System.out.println(ld7);
        System.out.println(ld8);
    }

}