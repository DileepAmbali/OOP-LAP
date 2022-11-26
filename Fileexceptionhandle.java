import java.io.*;

public class Fileexceptionhandle {
    public static void main(String a[]) throws IOException, FileNotFoundException {
        int i;
        try {
            FileOutputStream f1 = new FileOutputStream("xyz.txt");
            FileInputStream f2 = new FileInputStream("abc.txt");
            while ((i = f2.read()) != -1) {
                f1.write((char) i);
            }
            System.out.println("Written Successfully");
            f1.close();
            f2.close();
            FileInputStream f3 = new FileInputStream("xyz.txt");
            while ((i = f3.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } finally {

        }
    }
}
