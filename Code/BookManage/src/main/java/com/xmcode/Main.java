package com.xmcode;

import com.xmcode.entity.Book;
import com.xmcode.entity.Student;
import com.xmcode.sql.SqlUnit;
import lombok.extern.java.Log;
import org.apache.ibatis.io.Resources;

import java.util.Scanner;
import java.util.logging.LogManager;


@Log
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            LogManager manager = LogManager.getLogManager();
            manager.readConfiguration(Resources.getResourceAsStream("logging.properties"));

            while (true) {
                System.out.println("===Welcome To Book Management System===");
                System.out.println("1.Add Student Info");
                System.out.println("2.Add Book Info");
                System.out.println("3.Add Borrow Info");
                System.out.println("4.Show Student List");
                System.out.println("5.Show Book List");
                System.out.println("6.Show Borrow List");
                System.out.println("0.Exit");
                System.out.println("=======================================");
                System.out.print("Enter Number: ");
                int choice;
                try {
                    choice = scanner.nextInt();
                }catch (Exception e){
                    return;
                }
                switch (choice) {
                    case 0:
                        return;
                    case 1:
                        addStudent(scanner);
                        break;
                    case 2:
                        addBook(scanner);
                        break;
                    case 3:
                        addBorrow(scanner);
                         break;
                    case 4:
                        showStudentList();
                        break;
                    case 5:
                        showBookList();
                        break;
                    case 6:
                        showBorrowList();
                        break;
                    default:
                        return;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void addStudent(Scanner scanner){
        System.out.println();
        System.out.print("Enter Student Name: ");
        String name = scanner.next();
        System.out.print("Enter Student Sex(man/woman): ");
        String sex = scanner.next();
        System.out.print("Enter Student Grade(20XX): ");
        String grade = scanner.next();
        int g = Integer.parseInt(grade);
        Student student = new Student(name, sex, g);
        SqlUnit.doSqlWork(mapper -> {
            int x = mapper.addStudent(student);
            if (x > 0) {
                System.out.println("[System]: Add Successfully!");
                log.info("Add A Student: " + student);
            }else {
                System.out.println("[System]: Add Failed. Please Try Again.");
                log.info("Add Failed.");
            }
        });
        System.out.println();
    }

    private static void addBook(Scanner scanner){
        System.out.println();
        System.out.print("Enter Book Title: ");
        String title = scanner.next();
        System.out.print("Enter Book Main: ");
        String main = scanner.next();
        System.out.print("Enter Book Price: ");
        String price = scanner.next();
        float p = Float.parseFloat(price);
        Book book = new Book(title, main, p);
        SqlUnit.doSqlWork(mapper -> {
            int x = mapper.addBook(book);
            if (x > 0) {
                System.out.println("[System]: Add Successfully!");
                log.info("Add A Book: " + book);
            }else {
                System.out.println("[System]: Add Failed. Please Try Again.");
                log.info("Add Failed.");
            }
        });
        System.out.println();
    }

    private static void addBorrow(Scanner scanner){
        System.out.print("Enter Book Id: ");
        int bid = scanner.nextInt();
        System.out.print("Enter Student Id: ");
        int sid = scanner.nextInt();
        SqlUnit.doSqlWork(mapper -> {
            int x = mapper.addBorrow(sid, bid);
            if (x > 0) {
                System.out.println("[System]: Add Successfully!");
                log.info("Add A Borrow: " + sid + " -> " + bid);
            }else {
                System.out.println("[System]: Add Failed. Please Try Again.");
                log.info("Add Failed.");
            }
        });
    }

    private static void showBorrowList(){
        System.out.println("=======================================");
        SqlUnit.doSqlWork(mapper -> mapper.getBorrowList().forEach(borrow ->
                System.out.println("[ " + borrow.getStudent().getName() + " -> " + borrow.getBook().getTitle()+" ]")));
        System.out.println("=======================================");
    }

    private static void showStudentList(){
        System.out.println("=======================================");
        SqlUnit.doSqlWork(mapper -> mapper.getStudentList().forEach(student ->
                System.out.println("[ "
                                + student.getSid()
                                +" : " + student.getName()
                                +" : " + student.getSex()
                                +" : Grade " + student.getGrade()
                                +" ]")));
        System.out.println("=======================================");
    }

    private static void showBookList(){
        System.out.println("=======================================");
        SqlUnit.doSqlWork(mapper -> mapper.getBookList().forEach(book ->
                System.out.println("[ "
                        + book.getBid()
                        + " : " + book.getTitle()
                        + " : " + book.getMain()
                        + " : $" + book.getPrice()
                        + " ]")));
        System.out.println("=======================================");
    }
}
