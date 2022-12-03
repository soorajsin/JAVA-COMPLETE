public class Factorial1 {
          static double print_factorial(int n){
                    if(n==1){
                              return 1;
                    }
                    else{
                              return(n*(print_factorial(n-1)));
                    }
          }
          public static void main(String[] args) {
                    double n=print_factorial(120);
                    System.out.println("Factorial of n= "+n);
                    
          }
}
