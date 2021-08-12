public class challenge2 {
  public static void main (String [] args){
    double mynum = 20.00d;
    double mynum2 = 80.00d;
    double result = (double) (mynum + mynum2 *100.00);
    //System.out.println(result);
    double remainder =(double) (result % 40);
    //System.out.println(remainder);    
     boolean ans = (remainder == 0) ? true:false;
     System.out.println(ans);
     if(ans == false) {
     System.out.println("got some remainder");
}
}
}