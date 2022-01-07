package IOAdapter;

public class BufferIO implements IIO{
    @Override
    public void copy(String source, String destination) {
        System.out.println(String.format("%s ==> %s Copy(BufferIO)", source, destination));
    }

    @Override
    public void createFolder(String path) {
        System.out.println(String.format("%s Create Folder(BufferIO)", path));
    }

    @Override
    public void createText(String path) {
        System.out.println(String.format("%s Create Text File(BufferIO)", path));
    }
}
