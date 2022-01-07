package IOAdapter;

public interface IIO {
    void copy(String source, String destination);
    void createFolder(String path);
    void createText(String path);
}
