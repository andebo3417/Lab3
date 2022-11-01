import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        _student[] list = null;
        int list_size = 0;
        String number = "-1";
        String answer = "-1";
        boolean flag = false;
        boolean leave = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (leave == false) {
            do {
                flag = false;
                System.out.print("Choose one option:\n");
                System.out.print("1 - Add student to the list\n");
                System.out.print("2 - Delete student from list\n");
                System.out.print("3 - Print list of students\n");
                System.out.print("4 - Calculate overall rating of a student\n");
                System.out.print("0 - Exit\n\n>");
                answer = reader.readLine();
                try {
                    if (Integer.parseInt(answer) >= 0 && Integer.parseInt(answer) < 5) {
                        flag = true;
                    };
                }
                catch (NumberFormatException ex) {
                    flag = false;
                    System.out.print("\nIncorrect input.\n\n");
                    System.out.print("\nPress any key to continue...\n");
                    reader.readLine();
                }

            } while (flag == false);

            switch (answer.charAt(0)) {
                case '1':
                    if (list_size > 0) {
                        list = _student.add_to_list(list, list_size);
                        list_size++;
                    }
                    else {
                        list = _student.create_list();
                        list_size++;
                    }
                    System.out.print("\nPress any key to continue...\n");
                    reader.readLine();
                    break;
                case '2':
                    if (list_size > 0) {
                        _student.print_list(list, list_size);
                        System.out.print("\nInput number of a student you want to delete:\n>");
                        number = reader.readLine();
                        try {
                            if (Integer.parseInt(number) > 0 && Integer.parseInt(number) <= list_size) {
                                list = _student.delete_from_list(list, list_size, Integer.parseInt(number) - 1);
                                list_size--;
                            }
                            else {
                                System.out.print("\nNumber of student is out of range.\n");
                            }
                        }
                        catch (NumberFormatException ex) {
                            System.out.print("\nIncorrect input.\n\n");
                        }
                    }
                    else {
                        System.out.print("\nList is empty. Nothing to delete.\n");
                    }
                    System.out.print("\nPress any key to continue...\n");
                    reader.readLine();
                    break;
                case '3':
                    if (list_size > 0) {
                        _student.print_list(list, list_size);
                    }
                    else {
                        System.out.print("\nList is empty. Nothing to print.\n");
                    }
                    System.out.print("\nPress any key to continue...\n");
                    reader.readLine();
                    break;
                case '4':
                    if (list_size > 0) {
                        _student.print_list(list, list_size);
                        System.out.print("\nInput number of a student:\n>");
                        number = reader.readLine();
                        try {
                            if (Integer.parseInt(number) > 0 && Integer.parseInt(number) <= list_size) {
                                System.out.print("\nAverage rating of a student is: " + list[Integer.parseInt(number) - 1].get_overall_rating() + "\n");
                            }
                            else {
                                System.out.print("\nNumber of student is out of range.\n");
                            }
                        }
                        catch (NumberFormatException ex) {
                            System.out.print("\nIncorrect input.\n\n");
                        }
                    }
                    else {
                        System.out.print("\nList is empty. Nothing to calculate.\n");
                    }
                    System.out.print("\nPress any key to continue...\n");
                    reader.readLine();
                    break;
                case '0':
                    leave = true;
                    break;
            }

        }
    }
}