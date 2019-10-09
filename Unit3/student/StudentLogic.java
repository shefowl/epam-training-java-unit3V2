package by.epam.unit3.student;

public class StudentLogic {

    public static boolean isExcellentStudent(Student student){
        int k = 0;
            for(int j = 0; j < Student.N; ++j){
                if(student.getAcademicPerformanceElement(j) != 9 && student.getAcademicPerformanceElement(j) != 10){
                    return false;
                }
            }
        return true;
    }
}
