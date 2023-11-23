import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        IFileInputOutputService ioService = new FileInputOutputService();
        List<Constellations> constellationsFromFile = ioService.getConstellationsFromFile("C:\\Users\\40726\\Desktop\\lab-java\\Constellation_Names.csv");

        for (var constellation: constellationsFromFile) {
            System.out.println(constellation);
        }

                ioService.writeConstellationsToFile("C:\\Users\\40726\\Desktop\\lab-java\\Raspuns.csv", constellationsFromFile);
            }
        }

