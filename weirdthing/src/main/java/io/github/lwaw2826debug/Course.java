package io.github.lwaw2826debug;

public class Course {
    private int creditHours;
    public int courseNum;
    public String departmentCode;
    public String description;
    public String title;

    public  Course(
            int creditHours,
            int courseNum,
            String departmentCode,
            String title,
            String description
    ){
        this.creditHours = creditHours;
        this.courseNum = courseNum;
        this.description = description;
        this.departmentCode = departmentCode;
        this.title = title;
    }

    public void setCreditHours(int creditHours){
        this.creditHours = creditHours;
    }



}