/**
 * Created by Karol on 2017-05-21.
 */
public final class Property {
    private final Rectangle location;
    final boolean municipal;

    public Property(int x,int y,int length,int width,boolean municipal){
        location=new Rectangle(x,y,length,width);
        this.municipal=municipal;
    }
    public Property(Rectangle loc, boolean municipal){
        location=loc;
        this.municipal=municipal;
    }
    public int getAnnualIncome(){
        return location.length*location.width;
    }
    public Property[] splitProperty(int n){
        if(municipal){
            System.err.println("Cannot split muncipal property");
            return null;
        }
        Property[] res=new Property[n];
        for(int i=0;i<n;i++)
            res[i]=new Property(new Rectangle(location.x+i*location.length/n,location.y,location.length/n,location.width),municipal);
        return res;
    }

    @Override
    public String toString() {
        String s="Location:\n"+location.toString()+"Annual income:\n"+getAnnualIncome();
        return super.toString();
    }

    private class Rectangle{
        private int x;
        private int y;
        private int length;
        private int width;
        Rectangle(int x,int y,int length,int width){
            this.x=x;
            this.y=y;
            this.length=length;
            this.width=width;
        }

        @Override
        public String toString() {
            return "x: "+x+" y: "+y+" length: "+length+" width: "+width+'\n';
        }
    }
}

