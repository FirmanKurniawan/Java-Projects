public class BasicTable {
    // NOTE
    // FORMAT
    // String leftAlignFormat = "| %-15s | %-4d |%n";
    /**
     * s : for string element
     * d : for decimal element
     * %-n : left align (n spasi kosong di sebelah kanan elemen)
     * 
     * full format left alignment table
     * %-ntype
     * 
     * n = number of space - 2
     * notice that the number column name width is 17 (contains 17 char '-')
     * so n = 15
     * and the type is string (column name)
     */

    public static void main(String[] args) {
        String leftAlignFormat = "| %-15s | %-4d |%n";

        System.out.format("+-----------------+------+%n");
        System.out.format("| Column name     | ID   |%n");
        System.out.format("+-----------------+------+%n");
        for (int i = 0; i < 5; i++) {
            System.out.format(leftAlignFormat, "some data" + i, i * i);
        }
        System.out.format("+-----------------+------+%n");
    }
}
