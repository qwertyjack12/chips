package MVC.services.disciplineService;

import MVC.Deserializator;
import MVC.Serializator;
import discipline.Discipline;

import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class DisciplineServiceImpl implements DisciplineService{

    private Hashtable<Integer, Discipline<?>> DisciplineTable;
    private final String fileName = "src\\usedFiles\\Discipline.bin";

    public DisciplineServiceImpl(){
        this.readData();
    }

    private void checkFIle(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        fileReader.close();
    }

    @Override
    public void saveData() {
        Serializator.serialization(DisciplineTable, fileName);
    }

    @Override
    public void readData() {
        try {
            this.checkFIle(fileName);
            this.DisciplineTable = Deserializator.getHashtable(fileName);
        } catch (IOException e) {
            this.DisciplineTable = new Hashtable<>();
        }
    }

    @Override
    public void setDiscipline(String name) {
        DisciplineTable.put(DisciplineTable.size() + 1, new Discipline<>(name));
    }

    @Override
    public void getDisciplines() {
        System.out.println(DisciplineTable);
    }

}
