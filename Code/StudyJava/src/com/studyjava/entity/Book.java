package com.studyjava.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@Setter
@Getter
public class Book implements java.io.Serializable{
    private int BOOK_ID;
    private String BOOK_NAME;
    private String BOOK_AUTHOR;

    public Book(String BOOK_AUTHOR, int BOOK_ID, String BOOK_NAME) {
        this.BOOK_AUTHOR = BOOK_AUTHOR;
        this.BOOK_ID = BOOK_ID;
        this.BOOK_NAME = BOOK_NAME;
    }

    @Override
    public String toString() {
        return "Book[" +
                "书籍ID = " + BOOK_ID +
                ", 书籍名称 = " + BOOK_NAME +
                ", 书籍作者 = " + BOOK_AUTHOR +
                ']';
    }
}

//public class Main {
//    private static List<Book> books;
//
//    public static void main(String[] args) {
//        System.out.println("Loading...⏳");
//        load();
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("=================");
//            System.out.println("欢迎使用图书管理系统");
//            System.out.println("1.录入信息");
//            System.out.println("2.查询信息");
//            System.out.println("3.修改信息");
//            System.out.println("4.删除信息");
//            System.out.println("5.退出");
//            System.out.println("=================");
//            switch (sc.nextInt()) {
//                case 1:
//                    addBook(sc);
//                    break;
//                case 2:
//                    getBook();
//                    break;
//                case 3:
//                    System.out.println("功能未开放");
//                    break;
//                case 4:
//                    deleteBook(sc);
//                    break;
//                case 5:
//                    System.out.println("Saving...💾");
//                    save();
//                    System.out.println("Thanks for use.Bye.👋");
//                    return;
//            }
//        }
//    }
//
//    private static void load() {
//        File file = new File("data");
//        if (file.exists()) {
//            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
//                books = (List<Book>) ois.readObject();
//            } catch (IOException | ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        } else {
//            books = new LinkedList<>();
//        }
//    }
//
//    private static void save() {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
//            oos.writeObject(books);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void addBook(Scanner sc) {
//        sc.nextLine();
//        System.out.println("请输入图书名称：");
//        String BOOK_NAME = sc.nextLine();
//        System.out.println("请输入图书作者：");
//        String BOOK_AUTHOR = sc.nextLine();
//        System.out.println("请输入图书编号：");
//        int BOOK_ID = sc.nextInt();
//        sc.nextLine();
//        Book book = new Book(BOOK_AUTHOR, BOOK_ID, BOOK_NAME);
//        books.add(book);
//        System.out.println("添加成功！");
//        System.out.println("图书信息如下：");
//        System.out.println(book);
//    }
//
//    private static void getBook() {
//        for (Book book : books) {
//            System.out.println(book);
//        }
//    }
//
//
//    private static void deleteBook(Scanner sc) {
//        sc.nextLine();  // 消耗掉前一次输入可能遗留的换行符
//        System.out.println("请输入要删除的图书编号：");
//
//        if (books.isEmpty()) {
//            System.out.println("图书列表为空！");
//            return;
//        }
//
//        try {
//            while (!sc.hasNextInt()) {  // 验证输入是否为整数
//                System.out.println("输入错误，请输入一个整数编号：");
//                sc.next();  // 清除非法输入
//            }
//
//            int bookId = sc.nextInt();
//
//            if (books.removeIf(book -> book.getBOOK_ID() == bookId)) {
//                System.out.println("删除成功！");
//            } else {
//                System.out.println("图书编号不存在！");
//            }
//        } catch (Exception e) {
//            System.out.println("发生错误：" + e.getMessage());
//        }
//    }
//}


