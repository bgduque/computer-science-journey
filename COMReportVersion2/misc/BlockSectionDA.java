package misc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BlockSectionDA {
    public BlockSectionDA() throws FileNotFoundException { 
        Scanner blockInfo = new Scanner(new FileReader("./data/blockSection.csv"));

        while (blockInfo.hasNext()) {
            String blockRowSection = blockInfo.nextLine();

            String[] specificBlockRow = blockRowSection.split(",");
            BlockSection blockSection = new BlockSection();

            blockSection.setBlockCode(specificBlockRow[0].trim());
            blockSection.setDescription(specificBlockRow[1].trim());
            blockSection.setAdviser(specificBlockRow[2].trim());

            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
            blockSection.setStudents(studentDA.getStudentLists());
            blockSection.setTotalStudents(studentDA.getTotalStudents());
            
            System.out.println(blockSection);
        }
        blockInfo.close();
    }
}