//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

//    for (int i = 1; i <= 5; i++) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        IO.println("i = " + i);
//    }
    Student jai = new Student("vsnjv", "nvnjsfnv", "nfsnvjsd", "nvjs", 83, "nvsjkvn");
//    Student jai = new Student();
//    jai.name = "jai";
//    jai.address = "n fjdnvf";
//    jai.state = "ACTIVE";
    jai.pauseCourse();


    System.out.println(jai.state);
    System.out.println(jai.address);
//    System.out.println(jai.Student());
    Student j = new Student(jai);
    System.out.println(j.state);
    System.out.println(j.address);
    System.out.println("Doing something");

    System.out.println(jai.name);
    System.out.println(j.name);
    j.name = "nothing";
    System.out.println(jai.name);
    System.out.println(j.name);

}
