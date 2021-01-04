class Student{
    int NIM;
    String name;
    static String college ="Unsyiah";
   
    static void change(){
        college = "USK";
    }
   
    Student(int r,String n){
        NIM = r;
        name = n;
    }

    void display (){
        System.out.println(NIM+" "+name+" "+college);
    }
    public static void main(String args[]){
        Student s1 = new Student(111, "Karen");
        Student s2 = new Student(222, "Arya");
        s1.display();
        s2.display();

        Student.change();
        s1.display();
        s2.display();
    }
}