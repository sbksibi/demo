public class practice {

    static class Student {
        String name;
        int id;
        Student(String n, int i) {
            name = n;
            id = i;
        }
        int add(int i,int j){
            return i+j;
        }
        String showId() {
            return "My name and ID is " + name + " " + id;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("tharun", 6548);
        System.out.println(s1.add(2,10));
        System.out.println(s1.showId());
    }
}
