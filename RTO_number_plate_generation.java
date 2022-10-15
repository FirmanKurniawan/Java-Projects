public class Main {
    public static void main(String[] args) {
        String s = "MP09 CZ 9998";
        int n = 20;

        String s1 = s.substring(0, 4);
        String s2 = s.substring(5, 7);
        String s3 = s.substring(8, 12);

        int num = Integer.parseInt(s3);

        for (int i = 0; i < n; i++) {
            System.out.print(s1 + " " + s2 + " ");
            System.out.format("%04d", num);
            System.out.println();

            if (num != 9999) {
                num++;
            }

            else {
                num = 0001;
                char ch1 = s2.charAt(0);
                char ch2 = s2.charAt(1);

                if (ch2 == 'Z') {
                    ch1++;
                    ch2 = 'A';
                }

                else {
                    ch2++;
                }

                s2 = String.valueOf(ch1) + String.valueOf(ch2);
                System.out.print(s1 + " " + s2 + " ");
                System.out.format("%04d", num);
                System.out.println();
            }

        }

    }
}
