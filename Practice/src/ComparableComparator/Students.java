//package ComparableComparator;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Students implements Comparable
//{
//    String name;
//    int marks;
//
//    public Students(String name , int marks)
//    {
//        super();
//        this.name = name;
//        this.marks = marks;
//    }
//
//    public String toString()
//    {
//        return ("Student [name =" + name + ", marks=" + marks + "]");
//    }
//
//    public String getName()
//    {
//        return name;
//    }
//
//    public void setName(String name)
//    {
//        this.name = name;
//    }
//
//    public int getMarks()
//    {
//        return marks;
//    }
//
//    public void setMarks(int marks)
//    {
//        this.marks = marks;
//    }
//
//    @Override
//    public int compareTo(Students s)
//    {
//        if (this.marks > s.marks) return 1;
//        else if (this.marks < s.marks) return -1;
//        else return 0;
//
//    }
//
//    public static void main(String[] args)
//    {
//        List<Students> students = new ArrayList<>();
//
//        students.add( new Students( "saim", 95));
//        students.add(new Students( "fuzail", 100));
//        students.add(new Students( "insha", 98)) ;
//
//        Collections.sort(students);
//
//        students.forEach(System.out::println);
//
//
//    }
//}
