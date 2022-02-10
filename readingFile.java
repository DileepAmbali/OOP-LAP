import java.io.*;

class readingFile {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        File file = new File("C:/Users/dilee/Documents/Vscode/OOPS/OOP-LAP/FileHandle.txt");
        Reader r = new FileReader(file);
        int c = r.read();
        while (c != -1) {
            System.out.print((char) c);
            c = r.read();
        }
        r.close();
    }
}
