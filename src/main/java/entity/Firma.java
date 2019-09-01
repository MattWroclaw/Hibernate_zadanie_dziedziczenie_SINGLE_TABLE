package entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//Disclaimer osnacza nazwę kolumny, która będzie zawirała dane
// jak się nazywają klasy dziedziczące (klient , pracownik)
@DiscriminatorColumn(name = "Typ_danych", discriminatorType = DiscriminatorType.STRING)
@Table(name = "Firma_zad1")
public class Firma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nazwaFirmy;
    @Column
    private String imie;
    @Column
    private String nazwisko;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
