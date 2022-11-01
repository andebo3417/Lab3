import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _student {
    private _full_name full_name;
    String gender;
    private _avg_marks avg_marks;
    private _adress adress;
    private _contacts contacts;

    _student(String name, String surname, String fathername, String gender, int physics, int math, int economics, String city, String street, int house_humber, int flat_number, String phone_number, String parent_phone_number) {
        full_name = new _full_name(name, surname, fathername);
        set_gender(gender);
        avg_marks = new _avg_marks(physics, math, economics);
        adress = new _adress(city, street, house_humber, flat_number);
        contacts = new _contacts(phone_number, parent_phone_number);
    }

    _student() {
        full_name = new _full_name("name", "surname", "fathername");
        set_gender("male");
        avg_marks = new _avg_marks(0, 0, 0);
        adress = new _adress("city", "street", 1, 1);
        contacts = new _contacts("N/A", "N/A");
    }

    _student(String name) {
        full_name = new _full_name(name, "surname", "fathername");
        set_gender("male");
        avg_marks = new _avg_marks(0, 0, 0);
        adress = new _adress("city", "street", 1, 1);
        contacts = new _contacts("N/A", "N/A");
    }

    public int get_student() throws IOException {
        boolean flag = false;
        String temp;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nInput info about student.\n\n");

        //name
        do {
            flag = true;
            System.out.print("Input name: \n>>");
            temp = reader.readLine();
            if (this.full_name.set_name(temp) != 0) flag = false;
            if (flag == false) System.out.print("\nIncorrect input.\n\n");
        } while (flag == false);
        do {
            flag = true;
            System.out.print("Input surname: \n>>");
            temp = reader.readLine();
            if (this.full_name.set_surname(temp) != 0) flag = false;
            if (flag == false) System.out.print("\nIncorrect input.\n\n");
        } while (flag == false);
        do {
            flag = true;
            System.out.print("Input fathername: \n>>");
            temp = reader.readLine();
            if (this.full_name.set_fathername(temp) != 0) flag = false;
            if (flag == false) System.out.print("\nIncorrect input.\n\n");
        } while (flag == false);

        //gender
        do {
            flag = true;
            System.out.print("Input gender (male or female): \n>>");
            temp = reader.readLine();
            if (this.set_gender(temp) != 0) {
                System.out.print("\nIncorrect input.\n\n");
                flag = false;
            }
        } while (flag == false);

        //marks
        System.out.print("Input average marks of a student.\n\n");
        do {
            flag = true;
            System.out.print("Input average physics mark (0 to 100): \n>>");
            temp = reader.readLine();
            try {
                this.avg_marks.set_physics(Integer.parseInt(temp));
            }
            catch (NumberFormatException ex) {
                System.out.print("\nIncorrect input.\n\n");
                flag = false;
            }
        } while (flag == false);

        do {
            flag = true;
            System.out.print("Input average physics mark (0 to 100): \n>>");
            temp = reader.readLine();
            try {
                this.avg_marks.set_math(Integer.parseInt(temp));
            }
            catch (NumberFormatException ex) {
                System.out.print("\nIncorrect input.\n\n");
                flag = false;
            }
        } while (flag == false);

        do {
            flag = true;
            System.out.print("Input average physics mark (0 to 100): \n>>");
            temp = reader.readLine();
            try {
                this.avg_marks.set_economics(Integer.parseInt(temp));
            }
            catch (NumberFormatException ex) {
                System.out.print("\nIncorrect input.\n\n");
                flag = false;
            }
        } while (flag == false);

        //adress
        System.out.print("Input adress of a student.\n\n");
        do {
            System.out.print("Input city: \n>>");
            temp = reader.readLine();
            if (this.adress.set_city(temp) != 0) flag = false;
            if (flag == false) System.out.print("\nIncorrect input.\n\n");
        } while (flag == false);
        do {
            System.out.print("Input street: \n>>");
            temp = reader.readLine();
            if (this.adress.set_street(temp) != 0) flag = false;
            if (flag == false) System.out.print("\nIncorrect input.\n\n");
        } while (flag == false);
        do {
            flag = true;
            System.out.print("Input house number: \n>>");
            temp = reader.readLine();
            try {
                this.adress.set_house_number(Integer.parseInt(temp));
            }
            catch (NumberFormatException ex) {
                System.out.print("\nIncorrect input.\n\n");
                flag = false;
            }
        } while (flag == false);
        do {
            flag = true;
            System.out.print("Input flat number: \n>>");
            temp = reader.readLine();
            try {
                this.adress.set_flat_number(Integer.parseInt(temp));
            }
            catch (NumberFormatException ex) {
                System.out.print("\nIncorrect input.\n\n");
                flag = false;
            }

        } while (flag == false);

        //contacts
        System.out.print("Input contacts of a student.\n\n");

        do {
            flag = true;
            System.out.print("Input student's phone number: \n>>");
            temp = reader.readLine();
            if (this.contacts.set_phone_number("student", temp) != 0) flag = false;
            if (flag == false) System.out.print("\nIncorrect input.\n\n");
        } while (flag == false);

        do{
            flag = true;
            System.out.print("Input student's parent phone number: \n>>");
            temp = reader.readLine();
            if (this.contacts.set_phone_number("parent", temp) != 0) flag = false;
            if (flag == false) System.out.print("\nIncorrect input.\n\n");
        } while (flag == false);

        return 0;
    }

    public int print_student() {
        System.out.print("\nName: " + this.full_name.get_full_name() + "\n");
        System.out.print("Gender: " + this.gender + "\n");
        System.out.print("Average marks: \n");
        System.out.print("\tPhysics: " + this.avg_marks.get_physics() + "\n");
        System.out.print("\tMath: " + this.avg_marks.get_math() + "\n");
        System.out.print("\tEconomics: " + this.avg_marks.get_economics() + "\n");
        System.out.print("Adress: " + this.adress.get_full_adress() + "\n");
        System.out.print("Contacts:\n");
        System.out.print("Student phone number : " + this.contacts.get_phone_number("student") + "\n");
        System.out.print("Parent phone number : " + this.contacts.get_phone_number("parent") + "\n");
        return 0;
    }

    public static int print_list(_student list[], int list_size) {
        for (int i = 0; i < list_size; i++) {
            System.out.print("\nNumber: " + (i + 1));
            list[i].print_student();
        }
        return 0;
    }

    public static _student[] create_list() {
        boolean flag = true;
        _student[] student_array;
        System.out.print("\nCreating list...\n");
        student_array = new _student[1];
        student_array[0] = new _student();
        try {
            student_array[0].get_student();
        }
        catch (IOException ex) {
            System.out.print("\nIncorrect input\n");
            return null;
        }
        System.out.print("\nList was created.\n");
        return student_array;
    }

    public static _student[] add_to_list(_student[] list, int list_size) {
        System.out.print("\nIncreasing list size...\n");
        list_size++;
        _student new_list[] = new _student[list_size];

        for (int i = 0; i < list_size - 1; i++) {
            new_list[i] = new _student();
            new_list[i].copy(list[i]);
        }
        System.out.print("\nPlease input student data:\n");
        try {
            new_list[list_size - 1] = new _student();
            new_list[list_size - 1].get_student();
        }
        catch (IOException ex) {
            System.out.print("\nIncorrect input\n");
            return  list;
        }
        System.out.print("\nStudent added to list.\n");
        return new_list;
    }

    public static _student[] delete_from_list(_student[] list, int list_size, int index) {

        if (list_size <= 0) {
            System.out.print("\nList is empty. Nothing to delete.\n");
            return list;
        }

        if (index < 0 || index >= list_size) {
            System.out.print("\nIncorrect index.\n");
            return list;
        }

        list_size--;

        if (list_size == 0) {
            System.out.print("\nStudent was deleted. List is now empty.\n");
            return null;
        }

        _student[] new_list = new _student[list_size];

        for (int i = 0, k = 0; i < list_size + 1; i++) {
            if (i != index) {
                new_list[k] = new _student();
                new_list[k].copy(list[i]);
                k++;
            }
        }
        System.out.print("\nStudent was deleted.\n");
        return new_list;
    }
    public int set_gender(String gender) {
        if (gender.equals("male") || gender.equals("female")) this.gender = gender;
    else {
            System.out.println("Wrong value sent to set_gender");
            return -1;
        }
        return 0;
    }

    public String get_gender() {
        return this.gender;
    }

    public int copy(_student unit) {
        if (unit == this) {
            return -1;
        }
        this.full_name.set_name(unit.full_name.get_name());
        this.full_name.set_surname(unit.full_name.get_surname());
        this.full_name.set_fathername(unit.full_name.get_fathername());
        this.set_gender(unit.get_gender());
        this.avg_marks.set_physics(unit.avg_marks.get_physics());
        this.avg_marks.set_math(unit.avg_marks.get_math());
        this.avg_marks.set_economics(unit.avg_marks.get_economics());
        this.adress.set_city(unit.adress.get_city());
        this.adress.set_street(unit.adress.get_street());
        this.adress.set_house_number(unit.adress.get_house_number());
        this.adress.set_flat_number(unit.adress.get_flat_number());
        this.contacts.set_phone_number("student", unit.contacts.get_phone_number("student"));
        this.contacts.set_phone_number("parent", unit.contacts.get_phone_number("parent"));
        return 0;
    }

    public int get_overall_rating() {
        return this.avg_marks.get_avg_rating();
    }

}
