import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karol on 2017-05-21.
 */
public class Kingdom {
    private final King king;
    private final List<Knight> knights;

    Kingdom(King king,List<Knight> knights){
        this.king=king;
        this.knights=knights;
    }
    Kingdom(King king){
        this.king=king;
        this.knights=new ArrayList<>(20);
    }

    public void addKnight(Knight knight){knights.add(knight);}
    public void removeKnight(Knight knight){knights.remove(knight);}
    public List<Knight> getKnights() {return knights;}
    public King getKing() {return king;}
}
