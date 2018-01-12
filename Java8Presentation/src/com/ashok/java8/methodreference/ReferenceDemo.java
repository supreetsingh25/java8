package com.ashok.java8.methodreference;

// Don't forget Functional interfaces are heart of labmda expression.
interface IsReferable {
   public void referenceDemo();
}

/**
 * The Class ReferenceDemo.
 */
public class ReferenceDemo {

   /**
    * Common method.
    */
   public static void commonMethod() {
      System.out.println("This method is already defined.");
   }

   /**
    * The main method.
    *
    * @param args the arguments
    */
   public static void main(String []args) {

      // Anonymous class.
      IsReferable demoOne = new IsReferable() {
         @Override
         public void referenceDemo() {
            ReferenceDemo.commonMethod();
         }
      };
      demoOne.referenceDemo();

      // Lambda implementaion.
      IsReferable demo = () -> ReferenceDemo.commonMethod();
      demo.referenceDemo();

      // Method reference.
      IsReferable demoTwo = ReferenceDemo::commonMethod;
      demoTwo.referenceDemo();
   }
}