package model;

public abstract class DataSourceDecorator implements DataSource {
    protected DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data); // Delegando a operação
    }

    @Override
    public String readData() {
        return wrappee.readData(); // Delegando a operação
    }
}

