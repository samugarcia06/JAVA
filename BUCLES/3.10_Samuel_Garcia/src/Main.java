public class Main {
    public static void main(String[] args) {
      int isol , isuma=0;
      for(int impar=1 ; impar<20 ; impar+=2){
        isuma+=impar;
        isol=impar;
        System.out.println(isol);
      }
      System.out.println("la suma de todos ellos es : " +isuma);
    }
}