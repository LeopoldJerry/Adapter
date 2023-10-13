
public class DataBaseRunner {
    public static void main(String[] args) {
    DataBase database = new AdapterJavaToDB();

    database.insert();
    database.update();
    database.select();
    database.remove();
    }
}