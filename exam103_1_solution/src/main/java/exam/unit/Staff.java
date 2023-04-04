package exam.unit;

import exam.base.Orgunit;

public class Staff {
    private int id;
    private String firstname;
    private String lastname;
    private Orgunit affiliation;

    public Staff(int id, String firstname, String lastname, Orgunit affiliation) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.affiliation = affiliation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Orgunit getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Orgunit affiliation) {
        this.affiliation = affiliation;
    }
}
