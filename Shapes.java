public class Shapes {
    public void area(){
        System.out.println("display area");
    }
}
class triangle extends Shapes{

}
class Equilateraltriangle  extends triangle{

}
class  Multiple{
    public static void main(String[] args) {
        Shapes s1=new Shapes();
        triangle t1=new triangle();
         Equilateraltriangle e1=new Equilateraltriangle();
         s1.area();
         t1.area();
         e1.area();
        
        }
}