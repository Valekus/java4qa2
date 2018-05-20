package LR_6_hw.Aggrigation;

import java.util.List;

public class Institute {
    String instName;
    private List<Department> departments;
    Institute(String instName, List<Department> departments)
    {
        this.instName = instName;
        this.departments = departments;
    }

    public int getTotalStudents()
    {
        int noOfStudents = 0;
        List<Student> students;
        for(Department debt : departments)
        {
            students = debt.getStudents();
            for(Student s : students)
            {
                noOfStudents++;
            }
        } return noOfStudents;
    }
}
