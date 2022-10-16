import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;

public class CompressToZip {

    public static void main(String[] args) {
        ContohZip1 zipObj = new ContohZip1();
        zipObj.zipMyFile();
    }

    public void zipMyFile() {
        byte[] buffer = new byte[1024];
        try {
            ZipOutputStream gos = new ZipOutputStream(new FileOutputStream("Your Spesific Path"));
            FileInputStream fis = new FileInputStream("Your Spesific Path");
            ZipEntry ze = new ZipEntry("items spesitic path to be zipped");
            gos.putNextEntry(ze);
            int length;
            while ((length = fis.read(buffer)) > 0) {
                gos.write(buffer, 0, length);
            }
            fis.close();
            gos.finish();
            gos.close();
            System.out.println("File Compressed!!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}