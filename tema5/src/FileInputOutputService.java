import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileInputOutputService implements IFileInputOutputService {
    @Override
    public List<Constellations> getConstellationsFromFile(String filePath) {
        List<Constellations> userList = new ArrayList<>();
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            bufferedReader.readLine(); // se citeste prima linie

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] lineParts = line.split(",");
                Constellations constellation = new Constellations(lineParts[0], lineParts[1], lineParts[2], lineParts[3], lineParts[4]);
                userList.add(constellation);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return userList;
    }

    @Override
    public void writeConstellationsToFile(String filePath, List<Constellations> usersList) {
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            String line;

            for (var constellation : usersList) {
                line = constellation.name + "," + constellation.abbreviation + "," + constellation.genitive + "," + constellation.meaning + "," + constellation.brightestStar;
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            writer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
