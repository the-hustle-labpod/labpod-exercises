package contacts;
import util.Input;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("Duplicates")
public class ContactsManager {
    static Input input;
    static String directory = "src/contacts/data";
    static String filename = "contacts.txt";
    static Path dataDirectory = Paths.get(directory);
    static Path dataFile = Paths.get(directory, filename);
    static List<String> iocontacts = new ArrayList<>();
    static List<String> contactlist;

///////////////////////////////////////////
// Add dashes to 7- and 10-digit numbers //
///////////////////////////////////////////
    public static String phoneNumConverter(String phoneNum) {
        if (phoneNum.length() == 10) {
            phoneNum = phoneNum.substring(0, 3) + "-" + phoneNum.substring(3, 6) + "-" + phoneNum.substring(6);
        }
        if (phoneNum.length() == 7) {
            phoneNum = phoneNum.substring(0, 3) + "-" + phoneNum.substring(3);
        }
        return phoneNum;
    }

    public static void selectionMenu() {
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Edit contact name.\n" +
                "5. Delete an existing contact.\n" +
                "6. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5): ");
        int choose = input.getInt();
        switch (choose) {
            case 1 :
                try {
                    viewAllContacts();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
                break;
            case 2 :
                try {
                    addContact();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }

                break;
            case 3 :
                try {
                    searchByName();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }

                break;
            case 4 :
                try {
                    editContact();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }

                break;
            case 5 :
                try {
                    deleteContact();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }

                break;
            case 6 :
                return;
        }
    }

    public static void viewAllContacts() throws IOException {
        int index = 0;
        contactlist = Files.readAllLines(dataFile);
        System.out.println("Name                 | Phone number     |\n" +
                "------------------------------------------");
        for (String contact : contactlist) {
            if(contact.length() > 0) {
                index = contact.lastIndexOf(" ");
                String firstStr = contact.substring(0, index);
                String lastStr = contact.substring(index + 1);
                System.out.printf("%-20s | %-16s |%n", firstStr, lastStr);
            }

        }
        System.out.println();
        System.out.println();
        selectionMenu();
    }

    public static void addContact() throws IOException {
        List<String> newList = new ArrayList<>();
        System.out.printf("%nEnter first name: %n");
        String firstName = input.getString();
        System.out.println("Enter last name: ");
        String lastName = input.getString();
        System.out.println("Enter phone number: ");
        String phoneNum = input.getString();
        String fullName = firstName + " " + lastName;
        phoneNum = phoneNumConverter(phoneNum);
        System.out.printf("%s %s %s%n", firstName, lastName, phoneNum);
        Contact newContact = new Contact(firstName, lastName, phoneNum);
        iocontacts.clear();
        iocontacts.add(newContact.toString());

        contactlist = Files.readAllLines(dataFile);
        for (String contact : contactlist) {
            if (contact.contains(fullName)) {
                System.out.println(contact);
                System.out.printf("There's already a contact named %s.%nDo you want to overwrite it? (Yes/No)", fullName);
                boolean response = input.yesNo();
                if (response) {
                    newList.add("");
                    continue;
                }

            }
            newList.add(contact);
        }
        Files.write(dataFile, newList);

        Path contactDirectory = Paths.get(directory);
        Path contactFile = Paths.get(directory, filename);
        if (Files.notExists(contactDirectory)) {
            Files.createDirectories(contactDirectory);
        }
        if (Files.notExists(contactFile)) {
            Files.createFile(contactFile);
        }
        Files.write(
                Paths.get(directory, filename),
                iocontacts,
                StandardOpenOption.APPEND
        );
        System.out.println();
        System.out.println();
        selectionMenu();
    }

    public static void searchByName() throws IOException {
        System.out.printf("%nEnter a first name: %n");
        String firstName = input.getString();
        System.out.printf("%nEnter a last name: %n");
        String lastName = input.getString();
        String fullName = firstName + " " + lastName;
        List<String> contacts = Files.readAllLines(dataFile);
        for(String contact : contacts){
            if(contact.contains(fullName)){
                System.out.println("\n");
                System.out.println(contact);
            }
        }
        System.out.println();
        System.out.println();
        selectionMenu();
    }

    public static void editContact() throws IOException {
        System.out.println("Enter contact name to edit: ");
        String userEdit = input.getString();
        System.out.println("Enter new contact name: ");
        String newName = input.getString();
        List<String> newList = new ArrayList<>();
        List<String> contacts = Files.readAllLines(dataFile);
        for (String line : contacts) {
            if (line.contains(userEdit)) {
                newName = line.replaceFirst(userEdit, newName);
                newList.add(newName);
                continue;
            }
            newList.add(line);
        }
        Files.write(dataFile, newList);
        System.out.println();
        selectionMenu();
    }

    public static void deleteContact() throws IOException {
        System.out.println("You have requested the deletion of a contact...");
        System.out.printf("%nEnter a first name: %n");
        String firstName = input.getString();
        System.out.printf("%nEnter a last name: %n");
        String lastName = input.getString();
        String fullName = firstName + " " + lastName;
        List<String> lines = Files.readAllLines(dataFile);
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.contains(fullName)) {
                newList.add("");
                continue;
            }
            newList.add(line);
        }

        Files.write(dataFile, newList);
        System.out.println();
        System.out.printf("%s has been deleted.", fullName);
        System.out.println();
        System.out.println();
        selectionMenu();
    }

    public static void main(String[] args) {

        input = new Input();
        selectionMenu();




    }
}
