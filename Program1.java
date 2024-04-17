class Program1{
public static void main(String[] args){
// First way to create String object :-- by using without new keyword
      String a="raka";
       String b="vivek";
       String c="raka";
//equals() is method which are use to compare string object and its returns type boolean so
// it is return true and false type
      System.out.println("compare to String a and c "+a.equals(c));
      System.out.println("compare to String a and b "+a.equals(b));

//Second way to String object creation :- By using new keyword

      String s1 =new String("vijay");
      String s2 =new String("sachin");
      System.out.println(s1.equals(s2));
      System.out.println(s1);
//Third way to create string object creation :-- by using sequence of character

      char[] p={'a','p','p','l','e'};
      String s3=new String(p);
      char[] p1={'m','a','n','g','o'};
      String s4=new String(p1);
      System.out.println(s3);
      System.out.println(s4);
      System.out.println(s3.equals(s4));
    
}
}
