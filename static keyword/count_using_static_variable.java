class student{
    static int count = 0;

    student(){
        count++;
    }
    
    void display(){
        System.out.println("Total number of student is " + count);
    }
}

public class count_using_static_variable {

     public static void main(String []args){
        student s1 = new student();
        s1.display();
        student s2 = new student();
        s2.display();
        student s3 = new student();
        s3.display();
    }
}
