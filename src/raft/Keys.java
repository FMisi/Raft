package raft;

import gameObjects.Player;
import static gameObjects.Player.playerx;
import static gameObjects.Player.playery;
import java.util.Random;
import java.awt.event.*;

/**
 * A Keys osztaly a felhasznaloi input-ot valositja meg<br>
 * a KeyListener interfesz implementalasaval.<br>
 * Valamennyi hozza tartozo feltetel bekovetkezesekor az adott esemenyt<br>
 * bekovetkezteti
 * @author Felegyi Mihaly Patrik
 */
public class Keys implements KeyListener{
    
    private int capaint = 0;
    
    private boolean[] keyDown = {false, false, false, false, false, false, false, false, false};
    
    private static boolean halobool1 = false;
    private static boolean halobool2 = false;
    private static boolean halobool3 = false;
    private static boolean halobool4 = false;
    private static boolean halobool5 = false;
    private static boolean halobool6 = false;
    private static boolean halobool7 = false;
    private static boolean halobool8 = false;
    private static boolean halobool9 = false;
    private static boolean halobool10 = false;
    private static boolean halobool11 = false;
    private static boolean halobool12 = false;
    
    private static boolean viztisztitobool1 = false;
    private static boolean viztisztitobool2 = false;
    private static boolean viztisztitobool3 = false;
    private static boolean viztisztitobool4 = false;
    
    private static boolean tuzhelybool1 = false;
    private static boolean tuzhelybool2 = false;
    private static boolean tuzhelybool3 = false;
    private static boolean tuzhelybool4 = false;
    
    //<editor-fold defaultstate="collapsed" desc="halo koordinatak">
    public static int halox;
    public static int haloy;
    public static int halox2;
    public static int haloy2;
    public static int halox3;
    public static int haloy3;
    public static int halox4;
    public static int haloy4;
    public static int halox5;
    public static int haloy5;
    public static int halox6;
    public static int haloy6;
    public static int halox7;
    public static int haloy7;
    public static int halox8;
    public static int haloy8;
    public static int halox9;
    public static int haloy9;
    public static int halox10;
    public static int haloy10;
    public static int halox11;
    public static int haloy11;
    public static int halox12;
    public static int haloy12;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="viztisztito koordinatak">
    public static int viztisztitox;
    public static int viztisztitoy;
    public static int viztisztitox2;
    public static int viztisztitoy2;
    public static int viztisztitox3;
    public static int viztisztitoy3;
    public static int viztisztitox4;
    public static int viztisztitoy4;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="tuzhely koordinatak">
    public static int tuzhelyx;
    public static int tuzhelyy;
    public static int tuzhelyx2;
    public static int tuzhelyy2;
    public static int tuzhelyx3;
    public static int tuzhelyy3;
    public static int tuzhelyx4;
    public static int tuzhelyy4;
    //</editor-fold>
    
    private int haloszamlalo = 0;
    
    private int viztisztitoszamlalo = 0;
    
    private int tuzhelyszamlalo = 0;
    public static boolean[] ravanteve = {false, false, false, false};
    
    /**
     * A keyPressed eljaras a lenyomott billentyuk KeyCode-jat vizsgalja,<br>
     * es az alapjan hivja meg az adott KeyPressed eljarast<br>
     * (KeyPressedW, KeyPressedA, stb.).<br>
     * A keyDown tomb adott indexu erteket true-ra allitja.<br>
     * A keyDown tombre a beragado billentyuk kezelese miatt van szukseg
     * @param arg1 a lenyomott billentyu (de NEM annak KeyCode-ja)
     */
    @Override
    public void keyPressed(KeyEvent arg1) {
        if(arg1.getKeyCode() == KeyEvent.VK_W){
            if(!keyDown[0]){
                keyPressedW();
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_A){
            if(!keyDown[1]){
                keyPressedA();
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_S){
            if(!keyDown[2]){
                keyPressedS();
            }
        }
        if(arg1.getKeyCode() == KeyEvent.VK_D){
            if(!keyDown[3]){
                keyPressedD();
            }
        }
        
        //<editor-fold defaultstate="collapsed" desc="elemek craft-olasa">
        if(arg1.getKeyCode() == KeyEvent.VK_T){
            keyPressedT();
        }
        if(arg1.getKeyCode() == KeyEvent.VK_L){
            keyPressedL();
        }
        if(arg1.getKeyCode() == KeyEvent.VK_Z){
            keyPressedZ();
        }
        if(arg1.getKeyCode() == KeyEvent.VK_V){
            keyPressedV();
        }
        if(arg1.getKeyCode() == KeyEvent.VK_H){
            keyPressedH();
        }
        //</editor-fold>
        
        if(arg1.getKeyCode() == KeyEvent.VK_SPACE){
            if(!keyDown[4]){
                keyPressedSpace();
            }
        }
        
        if(arg1.getKeyCode() == KeyEvent.VK_5 || arg1.getKeyCode() == KeyEvent.VK_NUMPAD5){
             if(!keyDown[5]){
                keyPressed5();
             }
        }
        
        if(arg1.getKeyCode() == KeyEvent.VK_4 || arg1.getKeyCode() == KeyEvent.VK_NUMPAD4){
            if(!keyDown[6]){
                keyPressed4();
            }
        }
        
       if(arg1.getKeyCode() == KeyEvent.VK_3 || arg1.getKeyCode() == KeyEvent.VK_NUMPAD3){
            if(!keyDown[7]){
                keyPressed3();
            }
        }
       
        if(arg1.getKeyCode() == KeyEvent.VK_O){
            if(!keyDown[8]){
                keyPressedO();
            }
       }
       
    }
    
    // keyPressed void-ok KEZDETE
    private void keyPressedW(){
        // Viztisztito counterek kezelese KEZDETE
        if(viztisztitobool1==true){
            Player.viztisztito_counter++;
        }
        if(viztisztitobool2==true){
            Player.viztisztito_counter2++;
        }
        if(viztisztitobool3==true){
            Player.viztisztito_counter3++;
        }
        if(viztisztitobool4==true){
            Player.viztisztito_counter4++;
        }
        // Viztisztito counterek kezelese VEGE

        // Tuzhely counterek kezelese KEZDETE
        if(tuzhelybool1==true && ravanteve[0]==true){
            Player.tuzhely_counter++;
        }
        if(tuzhelybool2==true && ravanteve[1]==true){
            Player.tuzhely_counter2++;
        }
        if(tuzhelybool3==true && ravanteve[2]==true){
            Player.tuzhely_counter3++;
        }
        if(tuzhelybool4==true && ravanteve[3]==true){
            Player.tuzhely_counter4++;
        }
        // Tuzhely counterek kezelese VEGE

        Player.le += 19;
        Handler.playerOne.tile.second--;
        Handler.cselekvesek++;
        Handler.ehseg--;
        Handler.szomjusag--; 
        // capa korkorosen mozog KEZDETE
        capamozog();
        // capa korkorosen mozog VEGE
        keyDown[0] = true;
    }
    
    private void keyPressedA(){
        // Viztisztito counterek kezelese KEZDETE
        if(viztisztitobool1==true){
            Player.viztisztito_counter++;
        }
        if(viztisztitobool2==true){
            Player.viztisztito_counter2++;
        }
        if(viztisztitobool3==true){
            Player.viztisztito_counter3++;
        }
        if(viztisztitobool4==true){
            Player.viztisztito_counter4++;
        }
        // Viztisztito counterek kezelese VEGE

        // Tuzhely counterek kezelese KEZDETE
        if(tuzhelybool1==true && ravanteve[0]==true){
            Player.tuzhely_counter++;
        }
        if(tuzhelybool2==true && ravanteve[1]==true){
            Player.tuzhely_counter2++;
        }
        if(tuzhelybool3==true && ravanteve[2]==true){
            Player.tuzhely_counter3++;
        }
        if(tuzhelybool4==true && ravanteve[3]==true){
            Player.tuzhely_counter4++;
        }
        // Tuzhely counterek kezelese VEGE

        Player.le += 19;
        Handler.playerOne.tile.first--;
        Handler.cselekvesek++;
        Handler.ehseg--;
        Handler.szomjusag--;
        // capa korkorosen mozog KEZDETE
        capamozog();
        // capa korkorosen mozog VEGE
        keyDown[1] = true;
    }
    
    private void keyPressedS(){
        // Viztisztito counterek kezelese KEZDETE
        if(viztisztitobool1==true){
            Player.viztisztito_counter++;
        }
        if(viztisztitobool2==true){
            Player.viztisztito_counter2++;
        }
        if(viztisztitobool3==true){
            Player.viztisztito_counter3++;
        }
        if(viztisztitobool4==true){
            Player.viztisztito_counter4++;
        }
        // Viztisztito counterek kezelese VEGE

        // Tuzhely counterek kezelese KEZDETE
        if(tuzhelybool1==true && ravanteve[0]==true){
            Player.tuzhely_counter++;
        }
        if(tuzhelybool2==true && ravanteve[1]==true){
            Player.tuzhely_counter2++;
        }
        if(tuzhelybool3==true && ravanteve[2]==true){
            Player.tuzhely_counter3++;
        }
        if(tuzhelybool4==true && ravanteve[3]==true){
            Player.tuzhely_counter4++;
        }
        // Tuzhely counterek kezelese VEGE

        Player.le += 19;
        Handler.playerOne.tile.second++;
        Handler.cselekvesek++;
        Handler.ehseg--;
        Handler.szomjusag--;
        // capa korkorosen mozog KEZDETE
        capamozog();
        // capa korkorosen mozog VEGE
        keyDown[2] = true;
    }
    
    private void keyPressedD(){
        // Viztisztito counterek kezelese KEZDETE
        if(viztisztitobool1==true){
            Player.viztisztito_counter++;
        }
        if(viztisztitobool2==true){
            Player.viztisztito_counter2++;
        }
        if(viztisztitobool3==true){
            Player.viztisztito_counter3++;
        }
        if(viztisztitobool4==true){
            Player.viztisztito_counter4++;
        }
        // Viztisztito counterek kezelese VEGE

        // Tuzhely counterek kezelese KEZDETE
        if(tuzhelybool1==true && ravanteve[0]==true){
            Player.tuzhely_counter++;
        }
        if(tuzhelybool2==true && ravanteve[1]==true){
            Player.tuzhely_counter2++;
        }
        if(tuzhelybool3==true && ravanteve[2]==true){
            Player.tuzhely_counter3++;
        }
        if(tuzhelybool4==true && ravanteve[3]==true){
            Player.tuzhely_counter4++;
        }
        // Tuzhely counterek kezelese VEGE

        Player.le += 19;
        Handler.playerOne.tile.first++;
        Handler.cselekvesek++;
        Handler.ehseg--;
        Handler.szomjusag--;
        // capa korkorosen mozog KEZDETE
        capamozog();
        // capa korkorosen mozog VEGE
        keyDown[3] = true;
    }
    
    private void keyPressedT(){
        if(Handler.deszka>=2 && Handler.level>=2){
            Handler.cselekvesek++;
            Handler.ehseg--;
            Handler.szomjusag--;
            Player.le += 19;
            Handler.teruletbovites++;
            Handler.deszka-=2;
            Handler.level-=2;
            // capa korkorosen mozog KEZDETE
            capamozog();
            // capa korkorosen mozog VEGE
        }
    }
    
    private void keyPressedL(){
        if(Handler.deszka>=4 && Handler.level>=4 && Handler.hulladek>=4){
            Handler.cselekvesek++;
            Handler.ehseg--;
            Handler.szomjusag--;
            Player.le += 19;
            Handler.landzsa++;
            Handler.deszka-=4;
            Handler.level-=4;
            Handler.hulladek-=4;
            // capa korkorosen mozog KEZDETE
            capamozog();
            // capa korkorosen mozog VEGE
        }
    }
    
    private void keyPressedZ(){
        if(Handler.deszka>=2 && Handler.level>=4 && Handler.hulladek>=3){
            Handler.cselekvesek++;
            Handler.ehseg--;
            Handler.szomjusag--;
            Player.le += 19;
            Handler.tuzhely++;
            Handler.deszka-=2;
            Handler.level-=4;
            Handler.hulladek-=3;
            // capa korkorosen mozog KEZDETE
            capamozog();
            // capa korkorosen mozog VEGE
        }
    }
    
    private void keyPressedV(){
        if(Handler.level>=2 && Handler.hulladek>=4){
            Handler.cselekvesek++;
            Handler.ehseg--;
            Handler.szomjusag--;
            Player.le += 19;
            Handler.viztisztito++;
            Handler.level-=2;
            Handler.hulladek-=4;
            // capa korkorosen mozog KEZDETE
            capamozog();
            // capa korkorosen mozog VEGE
        }
    }
    
    private void keyPressedH(){
        if(Handler.deszka>=2 && Handler.level>=6){
            Handler.cselekvesek++;
            Handler.ehseg--;
            Handler.szomjusag--;
            Player.le += 19;
            Handler.halo++;
            Handler.deszka-=2;
            Handler.level-=6;
            // capa korkorosen mozog KEZDETE
            capamozog();
            // capa korkorosen mozog VEGE
        }
    }
    
    private void keyPressedSpace(){
        Handler.cselekvesek++;
        Handler.ehseg--;
        Handler.szomjusag--;
        // Viztisztito counterek kezelese KEZDETE
        if(viztisztitobool1==true){
            Player.viztisztito_counter++;
        }
        if(viztisztitobool2==true){
            Player.viztisztito_counter2++;
        }
        if(viztisztitobool3==true){
            Player.viztisztito_counter3++;
        }
        if(viztisztitobool4==true){
            Player.viztisztito_counter4++;
        }
        // Viztisztito counterek kezelese VEGE

        // Tuzhely counterek kezelese KEZDETE
        if(tuzhelybool1==true && ravanteve[0]==true){
            Player.tuzhely_counter++;
        }
        if(tuzhelybool2==true && ravanteve[1]==true){
            Player.tuzhely_counter2++;
        }
        if(tuzhelybool3==true && ravanteve[2]==true){
            Player.tuzhely_counter3++;
        }
        if(tuzhelybool4==true && ravanteve[3]==true){
            Player.tuzhely_counter4++;
        }
        // Tuzhely counterek kezelese VEGE

        if(playerx==Keys.tuzhelyx && playery==Keys.tuzhelyy && ravanteve[0]==false && Handler.hal > 0){
            ravanteve[0]=true;
            Handler.hal--;
        }
        else if(playerx==Keys.tuzhelyx2 && playery==Keys.tuzhelyy2 && ravanteve[1]==false && Handler.hal > 0){
            ravanteve[1]=true;
            Handler.hal--;
        }
        else if(playerx==Keys.tuzhelyx3 && playery==Keys.tuzhelyy3 && ravanteve[2]==false && Handler.hal > 0){
            ravanteve[2]=true;
            Handler.hal--;
        }
        else if(playerx==Keys.tuzhelyx4 && playery==Keys.tuzhelyy4 && ravanteve[3]==false && Handler.hal > 0){
            ravanteve[3]=true;
            Handler.hal--;
        }

        Player.le += 19;

        // item pickup kezeles KEZDETE
        itempickup();
        // item pickup kezeles VEGE

        // capa korkorosen mozog KEZDETE
        capamozog();
        // capa korkorosen mozog VEGE
        keyDown[4] = true;
    }
    
    private void keyPressed5(){
        // Viztisztito counterek kezelese KEZDETE
        if(viztisztitobool1==true){
            Player.viztisztito_counter++;
        }
        if(viztisztitobool2==true){
            Player.viztisztito_counter2++;
        }
        if(viztisztitobool3==true){
            Player.viztisztito_counter3++;
        }
        if(viztisztitobool4==true){
            Player.viztisztito_counter4++;
        }
        // Viztisztito counterek kezelese VEGE

        // Tuzhely counterek kezelese KEZDETE
        if(tuzhelybool1==true && ravanteve[0]==true){
            Player.tuzhely_counter++;
        }
        if(tuzhelybool2==true && ravanteve[1]==true){
            Player.tuzhely_counter2++;
        }
        if(tuzhelybool3==true && ravanteve[2]==true){
            Player.tuzhely_counter3++;
        }
        if(tuzhelybool4==true && ravanteve[3]==true){
            Player.tuzhely_counter4++;
        }
        // Tuzhely counterek kezelese VEGE

        // Lerakhatja a jatekos a halot?
        if((Handler.halo > 0)
        && ((Player.playerx==360 && Player.playery==266)
        || (Player.playerx==380 && Player.playery==266)
        || (Player.playerx==400 && Player.playery==266)
        || (Player.playerx==420 && Player.playery==266)
        || (Player.playerx==420 && Player.playery==285)
        || (Player.playerx==420 && Player.playery==304)
        || (Player.playerx==420 && Player.playery==323)
        || (Player.playerx==400 && Player.playery==323)
        || (Player.playerx==380 && Player.playery==323)
        || (Player.playerx==360 && Player.playery==323)
        || (Player.playerx==360 && Player.playery==304)
        || (Player.playerx==360 && Player.playery==285))
        ){
            // capa korkorosen mozog KEZDETE
            capamozog();
            // capa korkorosen mozog VEGE
            Player.le+=19;
            Handler.cselekvesek++;
            Handler.ehseg--;
            Handler.szomjusag--;
            haloszamlalo();
        }
        keyDown[5] = true;
    }
    
    private void keyPressed4(){
        // Viztisztito counterek kezelese KEZDETE
        if(viztisztitobool1==true){
            Player.viztisztito_counter++;
        }
        if(viztisztitobool2==true){
            Player.viztisztito_counter2++;
        }
        if(viztisztitobool3==true){
            Player.viztisztito_counter3++;
        }
        if(viztisztitobool4==true){
            Player.viztisztito_counter4++;
        }
        // Viztisztito counterek kezelese VEGE

        // Tuzhely counterek kezelese KEZDETE
        if(tuzhelybool1==true && ravanteve[0]==true){
            Player.tuzhely_counter++;
        }
        if(tuzhelybool2==true && ravanteve[1]==true){
            Player.tuzhely_counter2++;
        }
        if(tuzhelybool3==true && ravanteve[2]==true){
            Player.tuzhely_counter3++;
        }
        if(tuzhelybool4==true && ravanteve[3]==true){
            Player.tuzhely_counter4++;
        }
        // Tuzhely counterek kezelese VEGE

        // Lerakhatja a jatekos a viztisztitot?
        if((Handler.viztisztito > 0)
           && ((Player.playerx==380 && Player.playery==285)
           || (Player.playerx==400 && Player.playery==285)
           || (Player.playerx==400 && Player.playery==304)
           || (Player.playerx==380 && Player.playery==304))){
            // capa korkorosen mozog KEZDETE
            capamozog();
            // capa korkorosen mozog VEGE
            Player.le+=19;
            Handler.cselekvesek++;
            Handler.ehseg--;
            Handler.szomjusag--;
            switch (viztisztitoszamlalo) {
                case 0:
                    viztisztitox=Player.playerx;
                    viztisztitoy=Player.playery;
                    viztisztitoszamlalo++;
                    viztisztitobool1=true;
                    Handler.viztisztito--;
                    break;
                case 1:
                    viztisztitox2=Player.playerx;
                    viztisztitoy2=Player.playery;
                    viztisztitoszamlalo++;
                    viztisztitobool2=true;
                    Handler.viztisztito--;
                    break;
                case 2:
                    viztisztitox3=Player.playerx;
                    viztisztitoy3=Player.playery;
                    viztisztitoszamlalo++;
                    viztisztitobool3=true;
                    Handler.viztisztito--;
                    break;
                case 3:
                    viztisztitox4=Player.playerx;
                    viztisztitoy4=Player.playery;
                    viztisztitoszamlalo++;
                    viztisztitobool4=true;
                    Handler.viztisztito--;
                    break;
                default:
                    break;
            }
        }
        keyDown[6] = true;
    }
    
    private void keyPressed3(){
        // Viztisztito counterek kezelese KEZDETE
        if(viztisztitobool1==true){
            Player.viztisztito_counter++;
        }
        if(viztisztitobool2==true){
            Player.viztisztito_counter2++;
        }
        if(viztisztitobool3==true){
            Player.viztisztito_counter3++;
        }
        if(viztisztitobool4==true){
            Player.viztisztito_counter4++;
        }
        // Viztisztito counterek kezelese VEGE

        // Tuzhely counterek kezelese KEZDETE
        if(tuzhelybool1==true && ravanteve[0]==true){
            Player.tuzhely_counter++;
        }
        if(tuzhelybool2==true && ravanteve[1]==true){
            Player.tuzhely_counter2++;
        }
        if(tuzhelybool3==true && ravanteve[2]==true){
            Player.tuzhely_counter3++;
        }
        if(tuzhelybool4==true && ravanteve[3]==true){
            Player.tuzhely_counter4++;
        }
        // Tuzhely counterek kezelese VEGE

        // Lerakhatja a jatekos a tuzhelyet?
        if((Handler.tuzhely > 0)
           && ((Player.playerx==380 && Player.playery==285)
           || (Player.playerx==400 && Player.playery==285)
           || (Player.playerx==400 && Player.playery==304)
           || (Player.playerx==380 && Player.playery==304))){
            // capa korkorosen mozog KEZDETE
            capamozog();
            // capa korkorosen mozog VEGE
            Player.le+=19;
            Handler.cselekvesek++;
            Handler.ehseg--;
            Handler.szomjusag--;
            switch (tuzhelyszamlalo) {
                case 0:
                    tuzhelyx=Player.playerx;
                    tuzhelyy=Player.playery;
                    tuzhelyszamlalo++;
                    tuzhelybool1=true;
                    Handler.tuzhely--;
                    break;
                case 1:
                    tuzhelyx2=Player.playerx;
                    tuzhelyy2=Player.playery;
                    tuzhelyszamlalo++;
                    tuzhelybool2=true;
                    Handler.tuzhely--;
                    break;
                case 2:
                    tuzhelyx3=Player.playerx;
                    tuzhelyy3=Player.playery;
                    tuzhelyszamlalo++;
                    tuzhelybool3=true;
                    Handler.tuzhely--;
                    break;
                case 3:
                    tuzhelyx4=Player.playerx;
                    tuzhelyy4=Player.playery;
                    tuzhelyszamlalo++;
                    tuzhelybool4=true;
                    Handler.tuzhely--;
                    break;
                default:
                    break;
            }
        }
        keyDown[7] = true;
    }
    
    private void keyPressedO(){
        if(!((Player.playerx==380 && Player.playery==285)
           || (Player.playerx==400 && Player.playery==285)
           || (Player.playerx==400 && Player.playery==304)
           || (Player.playerx==380 && Player.playery==304))){
            // capa korkorosen mozog KEZDETE
            capamozog();
            // capa korkorosen mozog VEGE
            Random random = new Random();
            int horgaszrandom = random.nextInt(100)+1;
            System.out.println(horgaszrandom);
            Handler.cselekvesek++;
            Handler.ehseg--;
            Handler.szomjusag--;
            Player.le+=19;
            if(horgaszrandom<=25){
                Handler.hal++;
            }
        }
        keyDown[8] = true;
    }
    // keyPressed void-ok VEGE
    
    // kulon haloszamlalo void KEZDETE
    private void haloszamlalo(){
        switch (haloszamlalo) {
            case 0:
                halox=Player.playerx;
                haloy=Player.playery;
                haloszamlalo++;
                halobool1=true;
                Handler.halo--;
                break;
            case 1:
                halox2=Player.playerx;
                haloy2=Player.playery;
                haloszamlalo++;
                halobool2=true;
                Handler.halo--;
                break;
            case 2:
                halox3=Player.playerx;
                haloy3=Player.playery;
                haloszamlalo++;
                halobool3=true;
                Handler.halo--;
                break;
            case 3:
                halox4=Player.playerx;
                haloy4=Player.playery;
                haloszamlalo++;
                halobool4=true;
                Handler.halo--;
                break;
            case 4:
                halox5=Player.playerx;
                haloy5=Player.playery;
                haloszamlalo++;
                halobool5=true;
                Handler.halo--;
                break;
            case 5:
                halox6=Player.playerx;
                haloy6=Player.playery;
                haloszamlalo++;
                halobool6=true;
                Handler.halo--;
                break;
            case 6:
                halox7=Player.playerx;
                haloy7=Player.playery;
                haloszamlalo++;
                halobool7=true;
                Handler.halo--;
                break;
            case 7:
                halox8=Player.playerx;
                haloy8=Player.playery;
                haloszamlalo++;
                halobool8=true;
                Handler.halo--;
                break;
            case 8:
                halox9=Player.playerx;
                haloy9=Player.playery;
                haloszamlalo++;
                halobool9=true;
                Handler.halo--;
                break;
            case 9:
                halox10=Player.playerx;
                haloy10=Player.playery;
                haloszamlalo++;
                halobool10=true;
                Handler.halo--;
                break;
            case 10:
                halox11=Player.playerx;
                haloy11=Player.playery;
                haloszamlalo++;
                halobool11=true;
                Handler.halo--;
                break;
            case 11:
                halox12=Player.playerx;
                haloy12=Player.playery;
                haloszamlalo++;
                halobool12=true;
                Handler.halo--;
                break;
            default:
                break;
        }
    }
     // kulon haloszamlalo void VEGE

    /**
     * A keyReleased eljaras a felengedett billentyuk KeyCode-jat vizsgalja,<br>
     * es az alapjan allitja a keyDown tomb adott indexu erteket vissza false-ra.<br>
     * A keyDown tombre a beragado billentyuk kezelese miatt van szukseg
     * (KeyPressedW, KeyPressedA, stb.)
     * @param arg1 a lenyomott billentyu (de NEM annak KeyCode-ja)
     */
    @Override
    public void keyReleased(KeyEvent arg1) {
        if(arg1.getKeyCode() == KeyEvent.VK_W){
            keyDown[0] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_A){
            keyDown[1] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_S){
            keyDown[2] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_D){
            keyDown[3] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_SPACE){
            keyDown[4] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_5 || arg1.getKeyCode() == KeyEvent.VK_NUMPAD5){
            keyDown[5] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_4 || arg1.getKeyCode() == KeyEvent.VK_NUMPAD4){
            keyDown[6] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_3 || arg1.getKeyCode() == KeyEvent.VK_NUMPAD3){
            keyDown[7] = false;
        }
        if(arg1.getKeyCode() == KeyEvent.VK_O){
            keyDown[8] = false;
        }
    }
    
    /**
     * A keyTyped eljaras akkor hivodik meg, ha leutunk egy billentyut.
     * A KeyListener osztaly absztrakt metodusa, ezert kotelezo implementalni
     * @param arg1 a leutott billentyu
     */
    @Override
    public void keyTyped(KeyEvent arg1) {}
    
    /**
     * Nyersanyagok felvetelenek kezelesere hasznalatos az
     * itempickup, es az altala meghivott eljarasok
     */
    private void itempickup(){
        
        itempickupDeszkak();
        itempickupLevelek();
        itempickupHulladekok();
        itempickupHordok();
    }
    
    private void itempickupDeszkak(){

        if((Player.playerx==Player.nemrandxd
                || Player.playerx==Player.nemrandxd-20
                || Player.playerx==Player.nemrandxd+20) && (Player.le==Player.playery+38
                || (Player.le==Player.playery+19)
                || (Player.le==Player.playery))){
            if(Player.initd==0){
            Handler.deszka++;
            }
            Player.initd++;
        }
        if((Player.playerx==Player.nemrandxd2
                || Player.playerx==Player.nemrandxd2-20
                || Player.playerx==Player.nemrandxd2+20) && (Player.le2==Player.playery+19
                || (Player.le2==Player.playery)
                || (Player.le2==Player.playery-19))){
            if(Player.initd2==0){
            Handler.deszka++;
            }
            Player.initd2++;
        }
        if((Player.playerx==Player.nemrandxd3
                || Player.playerx==Player.nemrandxd3-20
                || Player.playerx==Player.nemrandxd3+20) && (Player.le3==Player.playery+19
                || (Player.le3==Player.playery)
                || (Player.le3==Player.playery-19))){
            if(Player.initd3==0){
            Handler.deszka++;
            }
            Player.initd3++;
        }
    }
    
    private void itempickupLevelek(){

        if((Player.playerx==Player.nemrandxl
                || Player.playerx==Player.nemrandxl-20
                || Player.playerx==Player.nemrandxl+20) && (Player.le==Player.playery+38
                || (Player.le==Player.playery+19)
                || (Player.le==Player.playery))){
            if(Player.initl==0){
            Handler.level++;
            }
            Player.initl++;
        }
        if((Player.playerx==Player.nemrandxl2
                || Player.playerx==Player.nemrandxl2-20
                || Player.playerx==Player.nemrandxl2+20) && (Player.le2==Player.playery+19
                || (Player.le2==Player.playery)
                || (Player.le2==Player.playery-19))){
            if(Player.initl2==0){
            Handler.level++;
            }
            Player.initl2++;
        }
        if((Player.playerx==Player.nemrandxl3
                || Player.playerx==Player.nemrandxl3-20
                || Player.playerx==Player.nemrandxl3+20) && (Player.le3==Player.playery+19
                || (Player.le3==Player.playery)
                || (Player.le3==Player.playery-19))){
            if(Player.initl3==0){
            Handler.level++;
            }
            Player.initl3++;
        }
    }
    
    private void itempickupHulladekok(){

        if((Player.playerx==Player.nemrandxh
                || Player.playerx==Player.nemrandxh-20
                || Player.playerx==Player.nemrandxh+20) && (Player.le==Player.playery+38
                || (Player.le==Player.playery+19)
                || (Player.le==Player.playery))){
            if(Player.inith==0){
            Handler.hulladek++;
            }
            Player.inith++;
        }
        if((Player.playerx==Player.nemrandxh2
                || Player.playerx==Player.nemrandxh2-20
                || Player.playerx==Player.nemrandxh2+20) && (Player.le2==Player.playery+19
                || (Player.le2==Player.playery)
                || (Player.le2==Player.playery-19))){
            if(Player.inith2==0){
            Handler.hulladek++;
            }
            Player.inith2++;
        }
        if((Player.playerx==Player.nemrandxh3
                || Player.playerx==Player.nemrandxh3-20
                || Player.playerx==Player.nemrandxh3+20) && (Player.le3==Player.playery+19
                || (Player.le3==Player.playery)
                || (Player.le3==Player.playery-19))){
            if(Player.inith3==0){
            Handler.hulladek++;
            }
            Player.inith3++;
        }
    }
    
    private void itempickupHordok(){

        if((Player.playerx==Player.nemrandxho
                || Player.playerx==Player.nemrandxho-20
                || Player.playerx==Player.nemrandxho+20) && (Player.le==Player.playery+38
                || (Player.le==Player.playery+19)
                || (Player.le==Player.playery))){
            randomHordosHokamoka1();
        }

        if((Player.playerx==Player.nemrandxho2
                || Player.playerx==Player.nemrandxho2-20
                || Player.playerx==Player.nemrandxho2+20) && (Player.le2==Player.playery+19
                || (Player.le2==Player.playery)
                || (Player.le2==Player.playery-19))){
            randomHordosHokamoka2();
        }

        if((Player.playerx==Player.nemrandxho3
                || Player.playerx==Player.nemrandxho3-20
                || Player.playerx==Player.nemrandxho3+20) && (Player.le3==Player.playery+19
                || (Player.le3==Player.playery)
                || (Player.le3==Player.playery-19))){
            randomHordosHokamoka3();
        }
    }
    
    /**
     * A randomHordosHokamoka eljarasok a hordok tartalmanak<br>
     * randomizalasaert felelosek
     */
    private void randomHordosHokamoka1(){
        Random random = new Random();
        int randint = random.nextInt(16)+1;
        if(Player.initho==0){
            switch(randint){
                case 1:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.burgonya++;
                    break;
                case 2:
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    Handler.burgonya++;
                    break;
                case 3:
                    Handler.hulladek++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    Handler.burgonya++;
                    break;
                case 4:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.level++;
                    Handler.burgonya++;
                    break;
                case 5:
                    Handler.burgonya++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.level++;
                    break;
                case 6:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.burgonya++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    break;
                case 7:
                    Handler.burgonya++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    break;
                case 8:
                    Handler.deszka++;
                    Handler.level++;
                    Handler.level++;
                    Handler.burgonya++;
                    Handler.hulladek++;
                    break;
                case 9:
                    Handler.burgonya++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.level++;
                    Handler.hulladek++;
                    break;
                case 10:
                    Handler.burgonya++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.hulladek++;
                    break;
                case 11:
                    Handler.burgonya++;
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    Handler.hulladek++;
                    break;
                case 12:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.hulladek++;
                    Handler.burgonya++;
                    break;
            }
            Player.initho++;
        }
    }
    
    private void randomHordosHokamoka2(){
        Random random = new Random();
        int randint = random.nextInt(16)+1;
        if(Player.initho2==0){
            switch(randint){
                case 1:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    break;
                case 2:
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    break;
                case 3:
                    Handler.hulladek++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    break;
                case 4:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    break;
                case 5:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.level++;
                    break;
                case 6:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    break;
                case 7:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    break;
                case 8:
                    Handler.deszka++;
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    Handler.hulladek++;
                    break;
                case 9:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.level++;
                    Handler.hulladek++;
                    break;
                case 10:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.hulladek++;
                    break;
                case 11:
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    Handler.hulladek++;
                    break;
                case 12:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    break;
            }
            Player.initho2++;
        }
}
    
    private void randomHordosHokamoka3(){
        Random random = new Random();
        int randint = random.nextInt(16)+1;
        if(Player.initho3==0){
            switch(randint){
                case 1:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    break;
                case 2:
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    break;
                case 3:
                    Handler.hulladek++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    break;
                case 4:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    break;
                case 5:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.level++;
                    break;
                case 6:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    break;
                case 7:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    break;
                case 8:
                    Handler.deszka++;
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    Handler.hulladek++;
                    break;
                case 9:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.level++;
                    Handler.hulladek++;
                    break;
                case 10:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.hulladek++;
                    break;
                case 11:
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    Handler.level++;
                    Handler.hulladek++;
                    break;
                case 12:
                    Handler.deszka++;
                    Handler.deszka++;
                    Handler.level++;
                    Handler.hulladek++;
                    Handler.hulladek++;
                    break;
            }
            Player.initho3++;
        }
    }
    
    /**
     * A capamozog eljarassal a capa mozgasat hatarozhatjuk meg
     */
    public void capamozog(){
        capaint++;
        if(capaint>7){
            Player.cy-=1;
            if(capaint>14){
                Player.cy+=1;
                Player.cx-=1;
                if(capaint>21){
                    Player.cx+=1;
                    Player.cy+=1;
                    if(capaint>27){
                        capaint=0;
                    }

                }
            }
        } else{
            Player.cx+=1;
        }
    }
    
//-------------------------------------------------------------------------------
    // getter-ek
    public static boolean isHalobool1() {
        return halobool1;
    }
    public static boolean isHalobool2() {
        return halobool2;
    }
    public static boolean isHalobool3() {
        return halobool3;
    }
    public static boolean isHalobool4() {
        return halobool4;
    }
    public static boolean isHalobool5() {
        return halobool5;
    }
    public static boolean isHalobool6() {
        return halobool6;
    }public static boolean isHalobool7() {
        return halobool7;
    }
    public static boolean isHalobool8() {
        return halobool8;
    }
    public static boolean isHalobool9() {
        return halobool9;
    }
    public static boolean isHalobool10() {
        return halobool10;
    }
    public static boolean isHalobool11() {
        return halobool11;
    }
    public static boolean isHalobool12() {
        return halobool12;
    }
    
    public static boolean isViztisztitobool1(){
        return viztisztitobool1;
    }
    public static boolean isViztisztitobool2(){
        return viztisztitobool2;
    }
    public static boolean isViztisztitobool3(){
        return viztisztitobool3;
    }
    public static boolean isViztisztitobool4(){
        return viztisztitobool4;
    }

    public static boolean isTuzhelybool1() {
        return tuzhelybool1;
    }

    public static boolean isTuzhelybool2() {
        return tuzhelybool2;
    }

    public static boolean isTuzhelybool3() {
        return tuzhelybool3;
    }

    public static boolean isTuzhelybool4() {
        return tuzhelybool4;
    }
}
