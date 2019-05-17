import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Comparator.*;
import java.util.List;

class Student
{
    private int student_id;
    private String student_name;
    private int student_age;

    public Student(Integer student_id, String student_name, Integer student_age) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_age = student_age;
    }

    public Integer getStudent_id () {
            return student_id;
        }

        public String getStudent_name () {
            return student_name;
        }

        public Integer getStudent_age () {
            return student_age;
        }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void setStudent_age(Integer student_age) {
        this.student_age = student_age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", student_age=" + student_age +
                '}';
    }
}
class StudentSorter implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        int agecompare=s1.getStudent_age().compareTo(s2.getStudent_age());
        int namecompare=s1.getStudent_name().compareTo(s2.getStudent_name());
        int idcompare=s1.getStudent_id().compareTo(s2.getStudent_id());
        if (agecompare == 0) {
            if(namecompare==0)
            {
                return((namecompare==0)?idcompare : namecompare);
            }
            else
            {
                return namecompare;
            }
        }
        else
        {
            return agecompare;
        }
    }
}
class MainTest
{
    public static void main(String[] args)
    {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(15, "Harshitha", 21));
        list.add(new Student(10, "Harshitha", 21));
        list.add(new Student(7, "Shahina", 21));
        list.add(new Student(15, "Harshitha", 22));
        list.add(new Student(6, "Monieesha", 20));
        Comparator obj = Collections.reverseOrder(new StudentSorter());
        Collections.sort(list,obj);
        for (Student s:list) {
            System.out.println(s);
        }
    }

}
