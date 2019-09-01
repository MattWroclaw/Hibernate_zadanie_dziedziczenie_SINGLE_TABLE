import entity.Klient;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class KlientDAO {

    public void dodajKlienta(Klient klient){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(klient);
        session.close();
    }

    public Klient znajdzKlientaId(Long id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Klient szukanyKlient = session.find(Klient.class, id);
        session.close();
        return szukanyKlient;
    }
// tutaj Klient klient musi mieć ustawiony id, na ten który ma updatowac (inaczej doda kolejnego)
    public Klient updateKlienta(Klient klient){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
          klient = (Klient) session.merge(klient);
          session.flush();
          session.close();
          return klient;
    }

    public void deleteKlient(Klient klientDoSkasowania){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(klientDoSkasowania);
        session.flush();
        session.close();
    }

    public static List<Klient> findKlientByNazwisko (String nazwisko){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Klient> listaKlientow = new ArrayList<>();
        listaKlientow = session.createQuery("SELECT k FROM Klient k WHERE k.nazwisko =:nazwisko", Klient.class)
                .setParameter("nazwisko", nazwisko).getResultList();
        return listaKlientow;

    }


}
