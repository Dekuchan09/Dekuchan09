

public class pangalawa{
    public int Highest(int num1, int num2, int num3, int num4, int num5){
        int highest1 = Math.max(num1, num2);
        int highest2 = Math.max(num3, num4);
        int highest3 = Math.max(highest1, highest2);
        return Math.max(highest3, num5);
    }
    
    public int Lowest(int num1, int num2, int num3, int num4, int num5){
        int Lowest1 = Math.min(num1, num2);
        int Lowest2 = Math.min(num3, num4);
        int Lowest3 = Math.min(Lowest1, Lowest2);
        return Math.min(Lowest3, num5);
    }
}
