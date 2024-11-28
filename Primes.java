public class Primes {
    public static void main(String[] args) {
       int num = Integer.parseInt(args[0]);
       System.out.println("Prime numbers up to " + num + ":");
       int n = 0;
       for (int i=0; i<=num; i++)
       {
        if (isPrime(i)==true)
        {
            System.out.println(i);
            n=n+1;
        }
        }
        double ratio = ((double)n/num)*100;
        System.out.println("There are " + n + " primes between 2 and " + num +" (" + (int)ratio + "% are primes)");
}
        public static boolean isPrime(int number) {     //בודקת האם מספר שנכנס הוא ראשוני או לא       
            if (number<=1)
            {
                return false;
            }
            for (int i=2; i<= Math.sqrt(number); i++){
                if (number%i==0)
                {
                return false;
                }
        }
        return true;
    }
}
