package servlet.service;
import  servlet.serv.Druzyna;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by draxeer on 2016-11-04.
 */
public class Storage {
    private List<Druzyna> db = new ArrayList<Druzyna>();

    public void add(Druzyna druzyna){
        Druzyna nowaDruzyna;
        nowaDruzyna = new Druzyna(druzyna.getNazwaDruzyny(),druzyna.getmZalozyciel());
        db.add(nowaDruzyna);
    }

    public List<Druzyna> pokazWszystkieDruzyny() {return db;}


}
