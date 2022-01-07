package IOAdapter;

public class Main {
    public static void main(String[] args) {
        IIO io = new BatchAdapter(new BatchIO());
        io.createFolder("./ornekKlasor");
    }
}
