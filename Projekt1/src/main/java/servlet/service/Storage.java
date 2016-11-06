package servlet.service;
import  servlet.serv.Druzyna;
import servlet.serv.Gracz;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Druzyna> db = new ArrayList<Druzyna>();

    public void add_druzyna(Druzyna druzyna, String s){
        Druzyna nowaDruzyna;
        nowaDruzyna = new Druzyna(druzyna.getNazwaDruzyny(),druzyna.getmZalozyciel(),druzyna.getLiczbaGraczy(),s);
        db.add(nowaDruzyna);
    }
    public void dodajGracza(int id, Gracz gracz){
        db.get(id).getListaGraczy().add(gracz);
    }
    public void usunDruzyne(int id){
        db.remove(id);
    }

    public void usunGracza(int idDruzyna, int idGracz){
        db.get(idDruzyna).getListaGraczy().remove(idGracz);
    }

    private Druzyna Utworz(Druzyna d, String s){

        return new Druzyna(d.getNazwaDruzyny(),d.getmZalozyciel(),d.getLiczbaGraczy(),s);
    }
    public void updateDruzyna(int id, Druzyna d,String s){
        Druzyna updated = Utworz(d,s);
        updated.setListaGraczy(db.get(id).getListaGraczy());
        db.set(id,updated);
    }
    public void updateGracz(int idDruzyna,int idGracz, String nickname, int pensja, String dywizja){
        Gracz updated = new Gracz(nickname,pensja,dywizja);
        db.get(idDruzyna).getListaGraczy().set(idGracz, updated);
    }

    public List<Druzyna> pokazWszystkieDruzyny() {return db;}
    public List<Druzyna> All() {return db;}


}
