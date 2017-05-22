/**
 * Created by Todler on 2017-05-22.
 */
public class Battle {
    private Knight knight1;
    private Knight knight2;

    public Battle(Knight knight1, Knight knight2){
        this.knight1=knight1;
        this.knight2=knight2;
    }

    private double getWholeKnightPower(Knight knight){
        double wholeKnightPower=knight.getKnightPower()+knight.getVassalsPower();
        return wholeKnightPower;
    }

    public void fight(){
        double wholeKnight1Power=getWholeKnightPower(this.knight1);
        double wholeKnight2Power=getWholeKnightPower(this.knight2);
        if(wholeKnight1Power>wholeKnight2Power) System.out.println("The winner is "+this.knight1.toString());
        else System.out.println("The winner is "+this.knight2.toString());
    }

}
