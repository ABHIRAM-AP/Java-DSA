import java.util.Random;

class RandomValues{
  public static void main(String args[]){
    Random random = new Random();

   // int x = random.nextInt(2);
    double y= random.nextDouble(3);
    double sum=y+1d;
    //boolean z = random.nextBoolean();
    System.out.println(y);
    System.out.printf("SUM= %lf",sum);
  }
}