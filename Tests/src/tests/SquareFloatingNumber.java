package tests;

/**@author Tamara*/

/*
Given a floating point number, calculate its square root without using in-built sqrt() function.
from http://www.geeksforgeeks.org/microsoft-interview-experience-set-102-on-campus-for-idc/
*/
public class SquareFloatingNumber {
    
    public static void main(String[] args) {
        
//           float num = 06.8888f;
//           String s = ""+num;
//           StringBuilder sb = new StringBuilder();
//           
//          
//          System.out.println("s: " + s);
//          boolean is = false;
//          int countComma=-1;
//          
//          for (int i = 0; i < s.length(); i++) {
//              if(s.charAt(i)=='.'&&is==false){
//                  is = true;
//                  if(s.charAt(i)!='.'){
//                  
//                  }
//              }
//              if(is==true){
//              countComma++;
//              }
//              
//              if(s.charAt(i)!='.'){
//              sb.append(s.charAt(i));
//              }
//          }
//          
//          System.out.println("comma number: " + countComma);
//          System.out.println("builder: " + sb.toString());
//          
//          Float number = Float.valueOf(sb.toString())/(float)Math.pow(10, countComma);
//          System.out.println("number: " + number);
//          
//          number = 06.8888f;
        
       
      //  System.out.println("SQRT from number 1024f is 32 ==: " + sqrt(1024f));
      //  System.out.println("SQRT from number 1.25f is 1.118 ==: " + sqrt(1.25f));
        System.out.println("SQRT from number -68.32f is -8.26559 ==: " + sqrt(-68.32f));
       // System.out.println("SQRT from number 0.32f is 0.565685 ==: " + sqrt(0.32f));
        //System.out.println("SQRT from number 1.25f is 1.118 ==: " + sqrt(1.25f));
       // System.out.println("SQRT from number 1.25f is 1.118 ==: " + sqrt(1.25f));
  
    }
    
    
    public static float sqrt(float number){
        
        int i = 1;
          if(number<0){
          number = Math.abs(number);
          i = -1; //"-" will show that there must be "i" in result sqrt number
          }
    
          float left = 0;
          float right = number;
          float square = (left+right)/2;
          float prevSqrt = 0;
          float absDiff = Math.abs(prevSqrt - square);
          
          while(absDiff>=0.000005){
              if(square*square>number){
              right = square;
              } else{
              left = square;
              }
          prevSqrt = square;
          square = (left+right)/2;
          absDiff = Math.abs(prevSqrt-square);
          }
       
        return square*i;
  }
    
    
}
