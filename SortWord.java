
import java.util.Scanner;
import java.lang.String;

public class SortWord {

    static String[] wordList = new String[100];

    int partitioner(int first, int last) {
        int i, j;
        i = first + 1;
        j = last;

        int temp = 0;
        for (i = 0; i < 2; i++) {
            System.out.println(wordList[i]);
            System.out.println(wordList[temp].compareToIgnoreCase(wordList[i]) + "\n");
        }

        // String tempo, piv = wordList[first];

        // while (i < j) {
        // while (i < j && wordList[i].compareTo(wordList[first]) < 0) {
        // tempo = wordList[i];
        // i++;
        // }
        // while (j > i && (wordList[j].compareTo(wordList[first]) > 0))
        // j--;

        // if (i < j) {
        // tempo = wordList[i];
        // wordList[i] = wordList[j];
        // wordList[j] = tempo;
        // }
        // }

        return j;

    }

    void Qsort(int first, int last) {

        int pivot = partitioner(first, last);

        String temp = wordList[first];
        wordList[first] = wordList[pivot];
        wordList[pivot] = temp;

        Qsort(first, pivot);
        Qsort(pivot + 1, last);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            wordList[i] = sc.next();
        }
        // int temp = 0;
        // for (int i = 0; i < 5; i++) {
        // System.out.println(wordList[i]);
        // System.out.println(wordList[temp].compareToIgnoreCase(wordList[i]) + "\n");
        // }
        SortWord sw = new SortWord();
        sw.Qsort(0, 9);
        // System.out.print(wordList[0]);
    }
}
