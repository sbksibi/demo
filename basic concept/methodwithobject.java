
// class main {
//     String name;
//     int Rollno;
//     int year;
//     char classes;
//  void details(){
//       System.out.println(name +" "+Rollno+" "+year+" "+classes );
//  }
// }

public class methodwithobject {
 
    String name;
    int Rollno;
    int year;
    char classes;
 void details(){
      System.out.println(name +" "+Rollno+" "+year+" "+classes );
 }

    public static void main(String[] args) {
        methodwithobject thirdYearC = new methodwithobject();
        thirdYearC.name="sibi";
        thirdYearC.Rollno= 161;
        thirdYearC.year=3;
        thirdYearC.classes='c';
        thirdYearC.details();           // invoke
    }
}
