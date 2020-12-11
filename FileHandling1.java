import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling1 {
    public static void main(String[] args) throws IOException {
        File country = new File("Country.txt");
        File capital = new File("Capital.txt");
        File countryCapital = new File("countryCapital.txt");

        FileWriter writeCountryCapital = new FileWriter("countryCapital.txt");

        Scanner countryRead = new Scanner(country);
        Scanner capitalRead = new Scanner(capital);

        while(countryRead.hasNextLine() && capitalRead.hasNextLine()){
            String countryText = countryRead.nextLine();
            String capitalText = capitalRead.nextLine();

            writeCountryCapital.write("The Capital of "+countryText+" is "+capitalText+"\n");
        }
        countryRead.close();
        capitalRead.close();
        writeCountryCapital.close();
    }
}
