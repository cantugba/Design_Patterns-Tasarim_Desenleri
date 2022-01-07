package IOAdapter;

//Adapter
public class BatchAdapter implements IIO{
    private BatchIO batch;

    public BatchAdapter(BatchIO batch) {
        this.batch = batch;
    }

    @Override
    public void copy(String source, String destination) {
        batch.kopyala(source, destination);
    }

    @Override
    public void createFolder(String path) {
        batch.klasorOlustur(path);
    }

    @Override
    public void createText(String path) {
        batch.dosyaOlustur(path);
    }
}
