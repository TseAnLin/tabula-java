package technology.tabula;


public class TableWriter {
    public Writer createTableWriter(String Format)
    {
        switch (Format) {
            case CSV:
                return new CSVWriter();
            case JSON:
                return new JSONWriter();
            case TSV:
                return = new TSVWriter();
        }
    }
}