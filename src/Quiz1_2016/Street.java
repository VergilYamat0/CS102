package previous.quiz01.fall2016;

public class Street {
    
    private int number;
    public String name;
    public String quarter;
    
    public Street (int n, String na, String q){
        number = n;
        name = na;
        quarter=q;
    }
    
    public String toString(){
        return String.format("%s %s, %s", number, name, quarter);
    }
    
    public void setNumber(int n){
        number=n;
    }
    
}

