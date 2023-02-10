import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        String jmeno = "Milan", prijmeni = "Borovicka", mesto = "Praha", spz = "4AC 4698";
        LocalDate datumNarozeni = LocalDate.of(2002, 5, 12);
        double pocetSmluv = 20, prodanaMrkev = 50, spotrebaVozidlaNa100km = 11.5, prumer;
        prumer = prodanaMrkev / pocetSmluv;
        String IPv4 = "192.168.48.38";

        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je : " + prumer + " tuny");
    }
}