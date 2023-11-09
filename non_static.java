// Fig. 6.9: MethodOverload.java
// Overloaded method declarations

public class non_static{
   // test overloaded square methods
	//int c;
  	//double d;

	static int c;
        static double d;

    public static void main(String[] args) {
  
     non_static o3 = new non_static();
      //System.out.printf("Square of integer is %d%n", o3.square(10.5));
      //System.out.printf("Square of double is %f%n", o3.square(15.5));

      System.out.printf("Square of integer is %d%n",o3.square(10));
      System.out.printf("Square of double is %f%n", o3.square(15.5));
 

   } 

     
   // square method with int argument                             
   public static int square(int k) {
   //public int square(int k) {
    non_static o1 = new non_static();
      o1.c =k;
      return o1.c * o1.c;    
                          
 	  } 

// square method with double argument                             
 public static double square(double k) {
 //  public double square(double k) {
    non_static o2 = new non_static();
      o2.d =k;
      return o2.d * o2.d;    
                          
 	  } 


} 

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
