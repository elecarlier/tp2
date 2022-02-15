public class Division {
    public static int divide(int a, int b, int c){
        if(b!=0 && c!=0 && a%b==0 && a%c==0) return (b+c);
        if(b!=0 && a%b==0) return b;
        if(c!=0 && a%c==0) return c;
        return -1;
    }
}
