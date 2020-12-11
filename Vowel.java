import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class storeNoOfVowels{
    int noOfVowels;
    String word;

    String showWord(int count){
        return word;
    }
}

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j = 0;
        System.out.println("Enter sentence");
        String sen = sc.nextLine();

        String senArray[] = sen.split(" ");
        storeNoOfVowels[] vow = new storeNoOfVowels[senArray.length];
        ArrayList<Integer> num = new ArrayList<Integer>();

        for(String word : senArray){
            int length = word.length();
            int count = 0;
            vow[j] = new storeNoOfVowels();

            for(int i=0; i<length; i++){
                char s = word.charAt(i);

                if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
                    count++;
                }
            }
            num.add(count);
            vow[j].word = word;
            vow[j].noOfVowels = count;
            System.out.println(word+" contains "+count+" vowels");
        }
        int max = Collections.max(num);
        System.out.println("Max no of vowel is "+max);
        // String maxWord = vow[max].showWord(max);
        // System.out.println("\n"+maxWord);
        sc.close();
    }
}
