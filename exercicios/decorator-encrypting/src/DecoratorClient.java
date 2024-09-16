import model.CompressionDecorator;
import model.DataSourceDecorator;
import model.EncryptionDecorator;
import model.FileDataSource;

public class DecoratorClient {
    public static void main(String[] args) {
        String message = "Este é um exemplo de texto a ser gravado!";

        FileDataSource fileDataSource = new FileDataSource("OutputDemo.txt");

        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(fileDataSource));

        encoded.writeData(message);

        String result = encoded.readData();

        System.out.println("\nResultado Final (após leitura): " + result);
    }
}