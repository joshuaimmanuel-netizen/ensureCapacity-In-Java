import java.lang.*;
class Main{
    public static void main(String[] args){
        StringBuffer a= new StringBuffer();
        System.out.println(a.capacity());
        a.ensureCapacity(100);
        System.out.println(a.capacity());
    }
}