package ShirtSize;

import java.io.PrintWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Patrick Foy - pjfoy
 * CIS171 - 20390
 * Mar 15, 2025
 */
public class SortShirtSizesFoy {

    public static void main(String[] args) {
        String inputFile = "https://bbmedia.dmacc.edu/CIS/CIS171/shirtsizes.txt";

        try {
            URL pageLocation = new URL(inputFile);

            try (Scanner pageData = new Scanner(pageLocation.openStream());
                 PrintWriter smallWriter = new PrintWriter("smallshirts.txt");
                 PrintWriter mediumWriter = new PrintWriter("mediumshirts.txt");
                 PrintWriter largeWriter = new PrintWriter("largeshirts.txt");
                 PrintWriter extraLargeWriter = new PrintWriter("extralargeshirts.txt")) {

                while (pageData.hasNextLine()) {
                    String line = pageData.nextLine();
                    String[] parts = line.split(","); // https://stackoverflow.com/questions/10631715/how-to-split-a-comma-separated-string

                    if (parts.length == 3) {
                        String size = parts[0];
                        String fname = parts[1];
                        String lname = parts[2];

                        if (size.equals("S")) {
                            smallWriter.println(fname + " " + lname);
                        } else if (size.equals("M")) {
                            mediumWriter.println(fname + " " + lname);
                        } else if (size.equals("L")) {
                            largeWriter.println(fname + " " + lname);
                        } else if (size.equals("XL")) {
                            extraLargeWriter.println(fname + " " + lname);
                        }
                    }
                }

                System.out.println("Shirt sizes sorted successfully.");

            } catch (IOException e) {
                System.err.println(inputFile + " is not available.");
                
            }

        } catch (MalformedURLException e) {
            System.err.println("The URL '" + inputFile + "' is malformed.");
            
        }
    }
}