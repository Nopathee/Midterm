package exam.unit;

import exam.base.Orgunit;

public class Department extends Orgunit {

    private School school;

    public Department(int code, String name, School school) {
        super(code, name);
        this.school = school;
        this.logging = school.getCode() + ";";

    }



    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
        this.logging += school.getCode() + ";";
    }


}
