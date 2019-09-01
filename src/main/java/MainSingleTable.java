import entity.Klient;
import entity.Pracownik;
import org.hibernate.Session;

public class MainSingleTable {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Klient klient1 = new Klient();
        klient1.setTelefonKont("tel Klient1");
        klient1.setImie("Stefan_klient1");
        klient1.setNazwaFirmy("Pewex");
        klient1.setNazwisko("Nazw_klient1");

        Pracownik pracownik1 = new Pracownik();
        pracownik1.setStanowisko("Dyrektor");
        pracownik1.setWynagordzenie("Megaduże");
        pracownik1.setImie("Walery_pracownik");
        pracownik1.setNazwaFirmy("Baltona");
        pracownik1.setNazwisko("Nazw_pracownik");

        session.persist(klient1);
        session.persist(pracownik1);
        session.flush();
        session.close();
    }
}
