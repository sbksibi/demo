

class main {
    String name;
    int Rollno;
    int year;
    char classes;
}
class employee{
    int id;
    String name;
    int phno;
    }

public class classobject1 {
    public static void main(String[] args) {
        main thirdYearC = new main();
        employee details = new employee();       
        thirdYearC.name="sibi";
        thirdYearC.Rollno=161;
        thirdYearC.year=3;
        thirdYearC.classes='c';
        details.id=1;
        details.name="prithivik";

        System.out.println(details.name);
    }
}
