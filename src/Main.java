import static java.lang.Boolean.*;

/**
 * Created by Todler on 2017-05-22.
 */
public class Main {
    public static void main(String[] args) {
        King king = new King();

        Kingdom bartyzellia=new Kingdom(king);

        Knight knight = new Knight("Karol I");
        Knight knight1 = new Knight("Karol Wielki");
        Knight knight2 = new Knight("Burczymuch");
        Knight knight3 = new Knight("Andrzej Matematyk");
        Knight knight4 = new Knight("Michał Krzywoustny");
        Knight knight5 = new Knight("Piotr I Ostry");
        Knight knight6 = new Knight("Stanisław Chudy");
        Knight knight7 = new Knight("Sebek Krol Osiedla");
        Knight knight8 = new Knight("Grzegorz LCD");
        Knight knight9 = new Knight("Emilio II");

        Property property = new Property(30,30,10,10,FALSE);
        Property property1 = new Property(40,50,10,10,FALSE);
        Property property2 = new Property(0,0,5,5,TRUE);
        Property property3 = new Property(90,5,10,10,TRUE);
        Property property4 = new Property(170,130,15,15,TRUE);
        Property property5 = new Property(9,9,2,2,FALSE);
        Property property6 = new Property(210,5,10,10,TRUE);
        Property property7 = new Property(12,123,6,8,FALSE);
        Property property8 = new Property(123,12,8,6,FALSE);
        Property property9 = new Property(81,54,12,9,TRUE);
        Property property10 = new Property(11,98,3,7,FALSE);
        Property property11 = new Property(66,66,10,10,TRUE);
        Property property12 = new Property(222,222,4,14,FALSE);
        Property property13 = new Property(333,289,30,40,TRUE);
        Property property14 = new Property(4,5,10,10,FALSE);
        Property property15 = new Property(77,66,5,1,TRUE);

        bartyzellia.addKnight(knight);
        bartyzellia.addKnight(knight1);
        bartyzellia.addKnight(knight2);
        bartyzellia.addKnight(knight3);
        bartyzellia.addKnight(knight4);
        bartyzellia.addKnight(knight5);
        bartyzellia.addKnight(knight6);
        bartyzellia.addKnight(knight7);
        bartyzellia.addKnight(knight8);
        bartyzellia.addKnight(knight9);

        knight.addProperty(property);
        knight.addProperty(property1);
        knight2.addProperty(property2);
        knight2.addProperty(property3);
        knight3.addProperty(property4);
        knight4.addProperty(property5);
        knight5.addProperty(property6);
        knight6.addProperty(property7);
        knight7.addProperty(property8);
        knight7.addProperty(property9);
        knight8.addProperty(property10);
        knight9.addProperty(property11);
        knight.addProperty(property12);
        knight.addProperty(property13);
        knight1.addProperty(property14);
        knight1.addProperty(property15);

        knight3.giveTribute(knight);
        knight4.giveTribute(knight);
        knight5.giveTribute(knight);
        knight6.giveTribute(knight1);
        knight7.giveTribute(knight1);
        knight8.giveTribute(knight1);
        knight9.giveTribute(knight3);

        Battle first=new Battle(knight,knight1);
        first.fight();
    }
}
