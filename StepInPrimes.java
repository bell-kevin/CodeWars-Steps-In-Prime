/**
* The Steps in prime program implements an application that
* simply displays the first pair of prime numbers determined by a step to the standard output.
*
* @author  Jeremi Frazier
* @version 1.0
* @since   2016-05-06 
*/
class StepInPrimes {

    /**
    * This method is used to find the first pair of primes by a step 
    * within an inclusive range. The pairs are determined by the step.
    * @param g The step.
    * @param g The minimum starting number.
    * @param g The maximum number.
    * @return long[] An array containting the pair.
    **/
    
    public static long[] step(int g, long m, long n) {
      if(m==n || g == 0)
        throw new RuntimeException("Cannot execute with given parameters");
        long[] pair = new long[2];
        long prime = 0;
        for(long i=m;i < n+1;i++){
          if(isPrime(i) && isPrime(i+g)){
            pair[0] = i;
            pair[1] = i+g;
            return pair;
     
          }
          
        }
        return null;
    }
    /**
    * This method is used to determine
    * Whether or not a number is prime.
    * @param num The number to determine.
    * @return boolean yes if prime no otherwise
    **/
    
    public static boolean isPrime(long num){
      if(num < 2) return false; 
      if(num == 2) return true;
      if(num %2 ==0) return false;
      for(int i=3; i < num;i+=2){
        if(num%i == 0) return false;
      }
      return true;
    }
}
