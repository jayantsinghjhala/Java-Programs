class bitwise2 {
     public static void main(String args[])
     {
          int x=5,y=1;
          System.out.println("Left Shift : "+x+" << "+y+" = "+(x<<y));
          System.out.println("Right Shift : "+x+" >> "+y+" = "+(x>>y));
          System.out.println("Unsignes Right Shift : "+x+" >>> "+y+" = "+(x>>>y));
          
          System.out.println("Right Shift : -"+x+" >> "+y+" = "+(-x>>y));
          System.out.println("Unsignes Right Shift : -"+x+" >>> "+y+" = "+(-x>>>y));
          System.out.println("Left Shift : -"+x+" << "+y+" = "+(-x<<y));
     }
     
}
