public class Assi4_array_ques5 {
        public static void main(String[] args) {
            int[] numbers = {2, 5, 8, 9, 12, 15, 22, 31};

            int evenCount = 0;
            int oddCount = 0;

            for (int num : numbers) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println("Even numbers count: " + evenCount);
            System.out.println("Odd numbers count: " + oddCount);
        }
    }