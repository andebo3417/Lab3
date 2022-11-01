public class _adress {
    private String city;
    private String street;
    private int house_number;
    private int flat_number;

    public _adress(String city, String street, int house_humber, int flat_number) {
        set_city(city);
        set_street(street);
        set_house_number(house_humber);
        set_flat_number(flat_number);
    }

    public _adress() {
        set_city("N/A");
        set_street("N/A");
        set_house_number(1);
        set_flat_number(1);
    }

    public _adress(String city) {
        set_city(city);
        set_street("N/A");
        set_house_number(1);
        set_flat_number(1);
    }

    public int set_city(String city) {
        if (city.length() != 0) this.city = city;
    else {
            System.out.println("Wrong value sent to set_city");
            return -1;
        }
        return 0;
    }

    public int set_street(String street) {
        if (street.length() != 0) this.street = street;
        else {
            System.out.println("Wrong value sent to set_street");
            return -1;
        }
        return 0;
    }

    public int set_house_number(int house_number) {
        if (house_number > 0) this.house_number = house_number;
        else {
            System.out.println("Wrong value sent to set_house_number");
            return -1;
        }
        return 0;
    }

    public int set_flat_number(int flat_number) {
        if (flat_number > 0) this.flat_number = flat_number;
        else {
            System.out.println("Wrong value sent to set_house_number");
            return -1;
        }
        return 0;
    }

    public String get_city() {
        return this.city;
    }

    public String get_street() {
        return this.street;
    }

    public int get_house_number() {
        return this.house_number;
    }

    public int get_flat_number() {
        return this.flat_number;
    }

    public String get_full_adress() {
        return this.city + ", " + this.street + " " + Integer.toString(this.house_number) + ", " + Integer.toString(this.flat_number);
    }
}
