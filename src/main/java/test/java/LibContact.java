package test.java;
import java.util.Scanner;
import java.lang.String;
public class LibContact {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Lib library=new Lib();
        System.out.println("enter 9 to quit:");
        while(true){
            System.out.println("1. add contact 2: update contact 3:delete contact 4: search contact 5:quit");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("enter first name");
                String firstname=sc.next();
                System.out.println("enter last Name");
                String lastname=sc.next();
                System.out.println("enter phone number");
                long phonenumber=sc.nextInt();
                Contact contact=new Contact(firstname,lastname,phonenumber);
                library.addContact(contact);
                System.out.println("added successfully");
            }
            else if(choice==2){
                System.out.println("enter name which you want to update");
                String name=sc.next();
                Contact contact=library.getContact(name);
                library.updateContact(contact);
                System.out.println("contact updated successfully");
            }
            else if(choice==3){
                System.out.println("enter name which you want to delete");
                String name=sc.next();
                Contact contact=library.getContact(name);
                library.updateContact(contact);
                System.out.println("contact deleted successfully");

            }
            else if(choice==4){
                System.out.println("enter name which you want to search");
                String name=sc.next();
                Contact contact=library.getContact(name);
                if(contact==null){
                    System.out.println("Contact not founded");
                }
                else{
                    System.out.println(contact);
                }
            }
            else if(choice==5){
                break;
            }
            else{
                choice=1;
            }
        }

    }
}
