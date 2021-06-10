package ca.sherdiancollege.week1.softwarefundamentals;

/** This class +++Insert Description+++
 *
 * @author Muhammad Chaudhry
 */
public class StrudentList {
    public static void main(String[] args) {
        Student[] sList = new Student[5];
        
        for (int i=0;i<(sList.length-1);i++)
        {
            sList[i] = new Student();
            sList[i].setName("Student" + (i+1));
        }
        for (Student s:sList)
            System.out.println("The Student list is " + s.getName());
    }
}
