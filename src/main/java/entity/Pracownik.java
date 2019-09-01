package entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Pracownik_zad1")
public class Pracownik extends Firma {
    @Column
    private String stanowisko;
    @Column
    private String wynagordzenie;

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public String getWynagordzenie() {
        return wynagordzenie;
    }

    public void setWynagordzenie(String wynagordzenie) {
        this.wynagordzenie = wynagordzenie;
    }
}
