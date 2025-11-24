public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] array = new boolean[n + 1];

        for (int i = 2; i < n + 1; i++){
            array [i] = true;   
        }

        for (int i = 2; i < Math.sqrt(n + 1); i++){

            if (array[i] == true){

                for (int j = i * i; j < n + 1; j += i){
                    
                    array [j] = false;

                }
            }
        }

         for (int i = 3; i < Math.sqrt(n + 1); i++){

            if (array[i] == true){

                for (int j = i * i; j < n + 1; j += i){
                    
                    array [j] = false;

                }
            }
        }

         for (int i = 5; i < Math.sqrt(n + 1); i++){

            if (array[i] == true){

                for (int j = i * i; j < n + 1; j += i){
                    
                    array [j] = false;

                }
            }
        }

            System.out.println("Prime numbers up to " + n + ":");

            int count = 0;
            for (int i = 2 ; i < n+1 ; i++){
            if (array[i] == true){
                System.out.println(i); 
                count ++;
            } 
            }

            int percent = (int)(100.0 * count/n);
            System.out.println("There are " + count + " primes between 2 and " + n + " (" + percent + "% are primes)");
        }
    }

