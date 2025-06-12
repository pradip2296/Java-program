public class shape {
    public void area(){
        System.out.println("Display area");
    }
    
}
class Triangle extends shape{
    public void CalcArea(double  l,double  b){
      double result=(0.5)*l*b;
    System.err.println(result);
    }
 }
  class solution {
public static void main(String[] args) {
    Triangle t1=new Triangle();
    t1.area();
    t1.CalcArea(12,45);

}
}