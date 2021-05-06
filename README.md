# NeobisJava
## Erzhan Beishenbiev
## 06.05.21

![java](https://upload.wikimedia.org/wikipedia/commons/6/65/%D0%92%D0%B5%D0%BB%D0%BE%D1%81%D0%B8%D0%BF%D0%B5%D0%B4_%D1%81_%D1%84%D0%B8%D0%BA%D1%81%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B9_%D0%BF%D0%B5%D1%80%D0%B5%D0%B4%D0%B0%D1%87%D0%B5%D0%B9.jpg)

```java
class B{
    public static void a(){
        System.out.print(1);
        b();
        System.out.print(2);
    }
     public static void b(){
        System.out.print(3);
        c();
        System.out.print(4);
    }
     public static void c(){
        System.out.print(5);
        
    }
    public static void main(String args[]){
        a();
    }
    
    

}
