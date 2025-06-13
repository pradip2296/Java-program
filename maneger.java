 class student {
    String name ;
    int age;
    void info(String name ){
        System.out.println("name"+name);
    }
    void info(int age){
     System.out.println("age"+age);
    }
    
}public class maneger{
public static void main(String[] args) {
    student s1=new student();
    s1.info(  "pradip");
    s1.info(20);
}
}

