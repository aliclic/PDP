package model;

public class FileDataSource implements DataSource {
    private String filename;
    private String storedData; // Simulação de um arquivo onde os dados são gravados

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        System.out.println("FileDataSource: Gravando dados no arquivo '" + filename + "'");
        this.storedData = data;
    }

    @Override
    public String readData() {
        System.out.println("FileDataSource: Lendo dados do arquivo '" + filename + "'");
        return storedData;
    }
}

