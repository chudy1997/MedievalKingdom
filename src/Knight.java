import java.util.HashSet;
import java.util.Set;

/**
 * Created by Karol on 2017-05-21.
 */
public class Knight {
    private final static double ratio = 0.01;
    private final static int maxAnnualIncomeOfRuralTribute = 1000;
    private final String name;
    private final Set<Property> properties=new HashSet<>();
    private final Set<Property> freeProperties=new HashSet<>();
    private final Set<Knight> vassals=new HashSet<>();
    private Knight senior=null;

    Knight(String name){
        this.name=name;
    }
    public int getValueOfProperties(){
        int res=0;
        for (Property p:freeProperties) {
            res+=p.getAnnualIncome();
        }
        return res;
    }
    public void addProperty(Property p){
        properties.add(p);
        freeProperties.add(p);
    }
    public boolean giveProperty(Knight vassal){
        if(vassals.size()==0){
            System.err.println("giveProperty: it has to be invoked for senior");
            return false;
        }
        if(senior==null){
            System.err.println("giveProperty: it cannot be invoked for knight being already vassal");
            return false;
        }
        if(freeProperties.size()==0){
            System.err.println("Senior has no free property to give");
            return false;
        }
        if(vassals.size()==7){
            System.err.println("Senior cannot have more than 7 vassals");
        }
        Property p=(Property)(freeProperties.toArray())[0];
        if(!p.muncipal){
            int quotient=p.getAnnualIncome()/maxAnnualIncomeOfRuralTribute;
            if(quotient>1){
                Property[] tmp=p.splitProperty(quotient);
                if(tmp==null){
                    System.err.println("splitProperty: some error occured");
                    return false;
                }
                freeProperties.remove(p);
                p=tmp[0];
                for(int i=1;i<tmp.length;i++){
                    properties.add(tmp[i]);
                    freeProperties.add(tmp[i]);
                }
            }
        }
        else
            freeProperties.remove(p);
        vassals.add(vassal);
        vassal.addProperty(p);
        return true;
    }
    public boolean giveTribute(Knight senior){
        if(senior==null) {
            System.err.println("giveTribute: cannot be invoked for knight being already vassal");
            return false;
        }
        if(this instanceof King) {
            System.err.println("giveTributte: cannot be invoked for king");
            return false;
        }
        this.senior=senior;
        senior.giveProperty(this);
        return true;
    }
}