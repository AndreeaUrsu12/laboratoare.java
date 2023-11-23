import java.util.List;

public interface IFileInputOutputService {
    List<Constellations> getConstellationsFromFile(String filePath);
    void writeConstellationsToFile(String filePath, List<Constellations> usersList);
}
