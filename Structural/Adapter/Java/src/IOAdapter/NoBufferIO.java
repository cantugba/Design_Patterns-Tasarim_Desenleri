package IOAdapter;

public class NoBufferIO implements IIO{
    @Override
    public void copy(String source, String destination) {
        System.out.println(String.format("%s ==> %s Copy(NoBufferIO)", source, destination));
    }

    @Override
    public void createFolder(String path) {
        System.out.println(String.format("%s Create Folder(NoBufferIO)", path));
    }

    @Override
    public void createText(String path) {
        System.out.println(String.format("%s Create Text File(NoBufferIO)", path));
    }
}
