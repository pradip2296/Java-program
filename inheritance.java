public class inheritance {
    int a;
    int b;
}
class Y extends inheritance{
    void add( int p,int q)
    {
        System.out.println(p+q);
    }
    

}
class Z
{
    public static void main(String[] args) {
        Y y1=new Y();
        y1.a=25;
        y1.b=45;
        y1.add(y1.a,y1.b);

    }
}
    

