package exam.main;


import exam.base.Group;
import exam.base.Loggable;
import exam.base.Orgunit;
import exam.unit.Department;
import exam.unit.School;
import exam.unit.Staff;

public class MainOrgTest {
    public static void main(String[] args) {
//        testSchool();
//        testDepartment();
//        testSchoolAsOrgUnit();
//        testDepartmentAsLoggable();
//        testStaff();
        testDepartmentGroup();
    }

    private static void testDepartmentGroup(){
        Group<Department> departmentGroup = new Group<>(4);
        Department department1 = new Department(1 , "KMUTT-1" , new School( 1 , "School-1"));
        Department department2 = new Department(2 , "KMUTT-2" , new School( 2 , "School-2"));
        Department department3 = new Department(3 , "KMUTT-3" , new School( 3 , "School-3"));
        Department department4 = new Department(4 , "KMUTT-4" , new School( 4 , "School-4"));
        Department department5 = new Department(5 , "KMUTT-5" , new School( 5 , "School-5"));
        Department department6 = new Department(6 , "KMUTT-6" , new School( 6 , "School-6"));
        System.out.println("Append Department1 : " + departmentGroup.append(department1));
        System.out.println("Append Department1 : " + departmentGroup.append(department1));
        System.out.println("Append Department2 : " + departmentGroup.append(department2));
        System.out.println("Append Department3 : " + departmentGroup.append(department3));
        System.out.println("Append Department4 : " + departmentGroup.append(department4));
        System.out.println("Append Department5 : " + departmentGroup.append(department5));

        System.out.println("Find Department1 : " + departmentGroup.find(department1));
        System.out.println("Find Department6 : " + departmentGroup.find(department6));

        System.out.println("Remove Department6 : " + departmentGroup.remove(department6));

        System.out.println("Get department 3 : " + departmentGroup.get(3).getName());
        System.out.println("Get department 10 : " + departmentGroup.get(10));

        for(int i = 0 ; i < departmentGroup.getSize() ; i++){
            Department department = departmentGroup.get(i);
            System.out.printf("(%d) - %s - %s%n" , department.getCode() , department.getName() , department.getSchool().getName());

        }
        System.out.println("Remove Department1 : " + departmentGroup.remove(department1));

        for(int i = 0 ; i < departmentGroup.getSize() ; i++){
            Department department = departmentGroup.get(i);
            System.out.printf("(%d) - %s - %s%n" , department.getCode() , department.getName() , department.getSchool().getName());

        }




    }

    private static void testStaff(){
        Staff staff = new Staff(1 , "Nopathee" , "Chan-in " ,
                new School(1 , "KMUTT"));
        System.out.println("getId : " + staff.getId());
        staff.setId(2);
        System.out.println("After setId getId : " + staff.getId());
        System.out.println("getFirstname : " + staff.getFirstname());
        staff.setFirstname("Earth");
        System.out.println("After setFirstname getFirstname : " + staff.getFirstname());
        System.out.println("getLastname : " + staff.getLastname());
        staff.setLastname("wowwow");
        System.out.println("After setLastname getLastname : " + staff.getLastname());
        System.out.println("getAffiliation : " + staff.getAffiliation().getClass().getSimpleName());
        staff.setAffiliation(new Department(40 , "SIT" ,
                new School(50 , "Bangmod" )));
        System.out.println("After setAffiliation getAffiliation : " + staff.getAffiliation().getClass().getSimpleName());
    }

    private static void testSchool(){
        School school = new School(1,"KMUTT");
        System.out.println("getCode: " + school.getCode());
        System.out.println("getName: " + school.getName());
        school.setName("SIIT");
        System.out.println("getName: " + school.getName());
        System.out.println("getLog: " + school.getLog());
        school.clearLog();
        System.out.println("After clearLog : " + school.getLog());
        System.out.println("getBalance : " + school.getBalance());
        school.earn(100000D);
        System.out.println("After earn getBalnce : " + school.getBalance());
        System.out.println("After earn getLog : " + school.getLog());
        school.spend(50000D);
        System.out.println("After spend getBalance : " + school.getBalance());
        System.out.println("After spend getLog : " + school.getLog());

    }

    private static void testDepartment(){
        School school = new School(2,"KMUTT school");
        Department department = new Department(1 , "SIT" , school );
        System.out.println("getCode: " + department.getCode());
        System.out.println("getName: " + department.getName());
        department.setName("SIT");
        System.out.println("getName: " + department.getName());
        System.out.println("getLog: " + department.getLog());
        department.clearLog();
        System.out.println("After clearLog : " + department.getLog());

        System.out.println("getSchool : " + department.getSchool().getName());
        School newSchool = new School(3 ,"Bangmod");
        department.setSchool(newSchool);
        System.out.println("school After setSchool : " + department.getSchool());
        System.out.println("logging After setSchool : " + department.getLog());

    }

    private static void testSchoolAsOrgUnit(){
        School school = new School(1,"KMUTT");
        System.out.println("getCode: " + school.getCode());
        System.out.println("getName: " + school.getName());
        school.setName("SIIT");
        System.out.println("getName: " + school.getName());
        System.out.println("getLog: " + school.getLog());
        school.clearLog();
        System.out.println("After clearLog : " + school.getLog());
        System.out.println("getBalance : " + school.getBalance());
        school.earn(100000D);
        System.out.println("After earn getBalnce : " + school.getBalance());
        System.out.println("After earn getLog : " + school.getLog());
        school.spend(50000D);
        System.out.println("After spend getBalance : " + school.getBalance());
        System.out.println("After spend getLog : " + school.getLog());

        Orgunit o = school;
        System.out.println("getCode: " + o.getCode());
        System.out.println("getName: " + o.getName());
        o.setName("SIIT");
        System.out.println("getName: " + o.getName());
        System.out.println("getLog: " + o.getLog());
        o.clearLog();
        System.out.println("After clearLog : " + o.getLog());
        System.out.println("getBalance : " + ((School) o).getBalance());
        ((School) o).earn(100000D);
        System.out.println("After earn getBalnce : " + ((School) o).getBalance());
        System.out.println("After earn getLog : " + o.getLog());
        ((School) o).spend(50000D);
        System.out.println("After spend getBalance : " + ((School) o).getBalance());
        System.out.println("After spend getLog : " + o.getLog());
    }

    private static void testDepartmentAsLoggable(){
        School school = new School(2,"KMUTT school");
        Department department = new Department(1 , "SIT" , school );
        System.out.println("getCode: " + department.getCode());
        System.out.println("getName: " + department.getName());
        department.setName("SIT");
        System.out.println("getName: " + department.getName());
        System.out.println("getLog: " + department.getLog());
        department.clearLog();
        System.out.println("After clearLog : " + department.getLog());

        System.out.println("getSchool : " + department.getSchool().getName());
        School newSchool = new School(3 ,"Bangmod");
        department.setSchool(newSchool);
        System.out.println("school After setSchool : " + department.getSchool());
        System.out.println("logging After setSchool : " + department.getLog());

        Loggable l = department;
        System.out.println("getLog : " + l.getLog());
        l.clearLog();
        System.out.println("After clearLog : " + l.getLog());
        }
    }
