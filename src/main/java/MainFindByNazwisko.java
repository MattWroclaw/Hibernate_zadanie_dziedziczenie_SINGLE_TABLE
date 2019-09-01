import entity.Klient;

public class MainFindByNazwisko {
    public static void main(String[] args) {
        System.out.println(KlientDAO.findKlientByNazwisko("Nazw_klient1").size());
    }
}
