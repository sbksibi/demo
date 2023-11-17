
class main {
    String name;
    int Rollno;
    int year;
    char classes;

    main(String i, int j, int k, char l) {
        name = i;
        Rollno = j;
        year = k;
        classes = l;
    }

    void details() {
        System.out.println(name + " " + Rollno + " " + year + " " + classes);
    }
}

public class constructor {
    public static void main(String[] args) {
        main thirdYearC = new main("sibi", 161, 3, 'c');
        thirdYearC.details(); // invoke
    }
}
