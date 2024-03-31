class EmirpNumber {
    public static void main(String[] args) {
        int num = 11; 
        int count = 0;
        
        // Check if num is prime
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        
        boolean flag = count == 0;

        if (flag) {
            int rev = 0;
            int tempNum = num; 
            // Reverse the number
            while (tempNum > 0) {
                int rem = tempNum % 10;
                rev = rev * 10 + rem; 
                tempNum /= 10;
            }

            int count1 = 0;
            // Check if the reversed number is prime
            for (int i = 2; i < rev; i++) {
                if (rev % i == 0) {
                    count1++;
                    break;
                }
            }
            boolean flag1 = count1 == 0;

            if (flag1) {
                System.out.println(num + " is an Emirp Number");
            } else {
                System.out.println(num + " is not an Emirp Number");
            }
        } 
    }
}