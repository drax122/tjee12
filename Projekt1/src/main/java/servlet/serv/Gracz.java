package servlet.serv;

/**
 * Created by draxeer on 2016-11-04.
 */
public class Gracz {
    private String Nickname = "s";
    private int Pensja = 100;
    private String Dywizja = "s";

    public Gracz(){ super(); }
    public Gracz(String nick, int pensja, String dyw){
        super();
        this.Nickname = nick;
        this.Pensja = pensja;
        this.Dywizja = dyw;
    }

    public String getNickname(){return Nickname;}
    public int getPensja() { return Pensja;}
    public String getDywizja(){return Dywizja;}

    public void setNickname(String nick){this.Nickname=nick;}
    public void setPensja(int pen){this.Pensja=pen;}
    public void setDywizja(String dyw){this.Dywizja=dyw;}


}
