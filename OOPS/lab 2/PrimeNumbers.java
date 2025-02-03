
class Primenum {
        public static void main(String[] args) {
            int cnt = 0;
            System.out.println("Prime numbers between 1 and 1000:");
            for (int num = 2; num <= 1000; num++) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(num + " ");
                    cnt++;
                }
            }
            System.out.println("\nTotal prime numbers: " + cnt);
        }
    }

