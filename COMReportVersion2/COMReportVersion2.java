import java.io.FileNotFoundException;

import misc.BlockSectionDA;

public class COMReportVersion2 {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("unused")
            BlockSectionDA blockSectionDA = new BlockSectionDA();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}