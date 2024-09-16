package model;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String encryptedData = encode(data);
        System.out.println("EncryptionDecorator: Dados criptografados para escrita.");
        super.writeData(encryptedData); // Escrevendo dados criptografados
    }

    @Override
    public String readData() {
        String data = super.readData(); // Lendo dados criptografados
        String decryptedData = decode(data);
        System.out.println("EncryptionDecorator: Dados descriptografados após leitura.");
        return decryptedData;
    }

    private String encode(String data) {
        // Lógica simples de criptografia (invertendo a string)
        return new StringBuilder(data).reverse().toString();
    }

    private String decode(String data) {
        // Lógica simples de descriptografia (invertendo novamente)
        return new StringBuilder(data).reverse().toString();
    }
}