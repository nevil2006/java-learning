public class opitmal {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                int num = 0;
                i++;

                // read full number (handles multi-digit like a10)
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    num = num * 10 + (input.charAt(i) - '0');
                    i++;
                }

                i--; // step back after reading number

                // append character num times
                for (int j = 0; j < num; j++) {
                    result.append(ch);
                }
            }
        }

        System.out.println(result.toString());
    }
}
    

