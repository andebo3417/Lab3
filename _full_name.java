public class _full_name {
    private String name;
    private String surname;
    private String fathername;

    public _full_name(String name, String surname, String fathername) {
        set_name(name);
        set_surname(surname);
        set_fathername(fathername);
    }

    public _full_name() {
        set_name("N/A");
        set_surname("N/A");
        set_fathername("N/A");
    }

    public _full_name(String name) {
        set_name(name);
        set_surname("N/A");
        set_fathername("N/A");
    }

    public int set_name(String name) {
        if (name.length() > 0) this.name = name;
    else {
            System.out.println("Wrong value sent to set_name");
            return -1;
        }
        return 0;
    }

    public int set_surname(String surname) {
        if (surname.length() > 0) this.surname = surname;
        else {
            System.out.println("Wrong value sent to set_surname");
            return -1;
        }
        return 0;
    }

    public int set_fathername(String fathername) {
        if (fathername.length() > 0) this.fathername = fathername;
        else {
            System.out.println("Wrong value sent to set_fathername");
            return -1;
        }
        return 0;
    }

    public String get_name() {
        return this.name;
    }

    public String get_surname() {
        return this.surname;
    }

    public String get_fathername() {
        return this.fathername;
    }

    public String get_full_name() {
        return  this.surname + " " + this.name + " " + this.fathername;
    }
}
