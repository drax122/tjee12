package servlet.serv;

import java.util.ArrayList;
import java.util.List;

public class Druzyna {

    private String nazwaDruzyny = "lel";
    private String mZalozyciel = "s";
    private List<Gracz> listaGraczy = new ArrayList<Gracz>();

    public Druzyna(){ super(); }

    public Druzyna(String nazwaDruzyny, String Zalozyciel){
        super();
        this.nazwaDruzyny = nazwaDruzyny;
        this.mZalozyciel = Zalozyciel;
        this.listaGraczy = new ArrayList<Gracz>();
    }

    public void dodajGracza(String nick, int pensja, String dyw) {
        Gracz Nowy = new Gracz(nick, pensja, dyw);
        listaGraczy.add(Nowy);
    }


    // AUTO GENERATED
    public String getmZalozyciel() {
        return mZalozyciel;
    }
    public void setmZalozyciel(String zalozyciel) {
        mZalozyciel = zalozyciel;
    }
    public String getNazwaDruzyny() {
        return nazwaDruzyny;
    }
    public void setNazwaDruzyny(String nazwaDruzyny) {
        this.nazwaDruzyny = nazwaDruzyny;
    }
    public List<Gracz> getListaGraczy() {
        return listaGraczy;
    }
    public void setListaGraczy(List<Gracz> listaGraczy) {
        this.listaGraczy = listaGraczy;
    }


}
