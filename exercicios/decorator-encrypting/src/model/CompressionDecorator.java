package model;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressedData = compress(data);
        System.out.println("CompressionDecorator: Dados comprimidos para escrita.");
        super.writeData(compressedData); // Escrevendo dados comprimidos
    }

    @Override
    public String readData() {
        String data = super.readData(); // Lendo dados comprimidos
        String decompressedData = decompress(data);
        System.out.println("CompressionDecorator: Dados descomprimidos após leitura.");
        return decompressedData;
    }

    private String compress(String data) {
        // Simulação de compressão (apenas cortando metade da string)
        return data.substring(0, data.length() / 2);
    }

    private String decompress(String data) {
        // Simulação de descompressão (duplicando a string)
        return data + data;
    }
}