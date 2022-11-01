public class _contacts {
    private String phone_number;
    private String parent_phone_number;

    public _contacts(String phone_number, String parent_phone_number) {
        set_phone_number("student", phone_number);
        set_phone_number("parent", parent_phone_number);
    }

    public _contacts() {
        set_phone_number("student", phone_number);
        set_phone_number("parent", parent_phone_number);
    }

    public _contacts(String phone_number) {
        set_phone_number("student", phone_number);
        set_phone_number("parent", "N/A");
    }

    public String get_phone_number(String owner) {
        if (owner.equals("student"))
            return this.phone_number;
        if (owner.equals("parent"))
            return this.parent_phone_number;
        return "N/A";
    }
    public int set_phone_number(String owner, String phone_number) {
        boolean flag = true;
        if (!owner.equals("student") && !owner.equals("parent")) return -1;
        if (phone_number.length() != 12) return -1;
        else {
            if (phone_number.charAt(0) != '+') flag = false;
            for (int i = 1; i < 11; i++)
                if (phone_number.charAt(i) < '0' || phone_number.charAt(i) > '9') {
                    flag = false;
                    break;
                }
        }
        if (flag == true) {
            if (owner.equals("student"))
                this.phone_number = phone_number;
            if (owner.equals("parent"))
                this.parent_phone_number = phone_number;
        }
        else return -1;
        return 0;
    }
}
