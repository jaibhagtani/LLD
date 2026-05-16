public class Main {

    static void main() {
//        since it is static method, it is not necessary to make object first,
//        can be directly called by classname.staticFunction()
        Database db = Database.getInstance();
        Database db2 = Database.getInstance();

    }
}
