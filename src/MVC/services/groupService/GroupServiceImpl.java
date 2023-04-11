package MVC.services.groupService;

import MVC.Deserializator;
import MVC.Serializator;
import groups.Group;
import users.Student;

import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class GroupServiceImpl implements GroupService{

    private Hashtable<Integer, Group> GroupTable;
    private final String fileName = "src\\usedFiles\\Group.bin";

    public GroupServiceImpl(){
        this.readData();
    }

    private void checkFIle(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        fileReader.close();
    }

    @Override
    public void saveData() {
        Serializator.serialization(GroupTable, fileName);
    }

    @Override
    public void readData() {
        try {
            this.checkFIle(fileName);
            this.GroupTable = Deserializator.getHashtable(fileName);
        } catch (IOException e) {
            this.GroupTable = new Hashtable<>();
        }
    }

    @Override
    public void setGroup(String name) {
        GroupTable.put(GroupTable.size() + 1, new Group(name));
    }

    @Override
    public void removeGroup() {
        if (GroupTable.size() != 0) {
            GroupTable.remove(GroupTable.size());
        }
    }

    @Override
    public void removeStudentInGroup(Integer keyGroup, Integer keyStudent) {
        GroupTable.get(keyGroup).remove_student(keyStudent - 1);
    }

    @Override
    public void addStudent(Student student, Integer keyGroup) {
        GroupTable.get(keyGroup).add_student(student);
    }

    @Override
    public void getGroupsRating() {
        for (int i = 1; i <= GroupTable.size(); i++) {
            System.out.println(GroupTable.get(i).get_rating());
        }
    }

    @Override
    public void getGroups() {

        System.out.println(GroupTable);

    }

}
