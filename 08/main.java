public class main {

    public static void main(String[] args) {

        String str = "hello java Programming";
        String sub = "jeva";

        boolean found = false;

        for (int i = 0; i <= str.length() - sub.length(); i++) {

            int j = 0;
            int k = i;

            while (j < sub.length() &&
                   str.charAt(k) == sub.charAt(j)) {

                j++;
                k++;
            }

            if (j == sub.length()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }
    }
}