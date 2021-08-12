public class challenge3 {

 public static void main( String[]args)
{
   int hposition = calculateHighScore(1500);
   displayHighScorePosition("sneha",hposition);

    hposition = calculateHighScore(900);
   displayHighScorePosition("sakshi",hposition);

    hposition = calculateHighScore(400);
   displayHighScorePosition("ram",hposition);
  
    hposition = calculateHighScore(50);
   displayHighScorePosition("sham",hposition);
   
 }
 public static void displayHighScorePosition(String name, int position)
{ System.out.println(name +"  is managed to get" + position +"in score table");
  }
 public static int calculateHighScore(int score) {
   if(score>1000){
     return 1;}
    else if(score>500 && score<1000){
     return 2;}
   else if(score>100 && score<500){
     return 3;}
   else{
     return 4;
    }
}
}