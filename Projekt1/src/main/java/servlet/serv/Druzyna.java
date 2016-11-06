package servlet.serv;

import java.util.ArrayList;
import java.util.List;

public class Druzyna {

    private String nazwaDruzyny;
    private String mZalozyciel;
    private Integer LiczbaGraczy;
    private String Img;
    private List<Gracz> listaGraczy = new ArrayList<Gracz>();

    public Druzyna(){ super(); }

    public Druzyna(String nazwaDruzyny, String Zalozyciel, int liczbaGraczy, String img){
        super();
        this.nazwaDruzyny = nazwaDruzyny;
        this.mZalozyciel = Zalozyciel;
        this.LiczbaGraczy = liczbaGraczy;
        this.Img = img;
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
    public Integer getLiczbaGraczy() {return LiczbaGraczy;}
    public String getNazwaDruzyny() {
        return nazwaDruzyny;
    }
    public List<Gracz> getListaGraczy() {
        return listaGraczy;
    }
    public String getImg() { return Img; }
    public void setListaGraczy(List<Gracz> listaGraczy) {
        this.listaGraczy = listaGraczy;
    }
    public void setmZalozyciel(String zalozyciel) {
        mZalozyciel = zalozyciel;
    }
    public void setLiczbaGraczy(Integer liczbaGraczy) {LiczbaGraczy = liczbaGraczy;}
    public void setImg(String img) {
        Img = img;
    }
    public void setNazwaDruzyny(String nazwaDruzyny) {
        this.nazwaDruzyny = nazwaDruzyny;
    }
}
