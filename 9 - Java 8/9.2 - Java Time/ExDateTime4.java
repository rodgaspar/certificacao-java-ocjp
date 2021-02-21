import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

class ExDateTime4{

    public static void main(String[] args){

        // Operações com as classes Instant e Duration
        Instant i = Instant.now();
        Duration d = Duration.ofSeconds(10);
        Instant i2 = i.plus(d);

        System.out.println(i);
        System.out.println(i2);
        System.out.println();

        //Obter segundos entre dois Instants
        Instant i3 = Instant.EPOCH;
        Instant i4 = Instant.now();
        Duration d2 = Duration.between(i3, i4);
        Long segundos = Duration.between(i3, i4).getSeconds();

        System.out.println(d2);
        System.out.println(segundos);
        System.out.println();

        //Obter dias, meses e anos entre duas datas
        LocalDate ld1 = LocalDate.of(1984,3,23);
        LocalDate ld2 = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(ld1,ld2));
        System.out.println(ChronoUnit.MONTHS.between(ld1,ld2));
        System.out.println(ChronoUnit.DAYS.between(ld1,ld2));
        System.out.println();

        Period p = Period.between(ld1,ld2);

        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());

        //Formatação de Datas
        LocalDateTime ldt1 = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(f.format(ldt1));
        System.out.println(ldt1.format(f));

        //Converter String para LocalDate
        LocalDate ld3 = LocalDate.parse("23/03/1984",f);
        System.out.println(ld3);

    }
}