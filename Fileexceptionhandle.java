import java.io.*;
import java.util.Scanner;

class Fileexceptionhandle {
    public static void main(String argsp[]) {
        Scanner s = new Scanner(System.in);
        File file = new File("C:/Users/dilee/Documents/Vscode/OOPS/OOP-LAP/FileHandle.txt");
        try {
            System.out.print("Enter a string to be written into file: ");
            String str = s.nextLine();
            byte[] b = str.getBytes();
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(b);
            fos.close();

            System.out.print("The contents of the file: ");
            FileInputStream fis = new FileInputStream(file);
            int c = fis.read();
            while (c != -1) {
                System.out.print((char) c);
                c = fis.read();
            }
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("File could not be found. Check is file path is correct.");
        }

        catch (IOException j) {
            System.out.println("Java I/O errors!");
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
