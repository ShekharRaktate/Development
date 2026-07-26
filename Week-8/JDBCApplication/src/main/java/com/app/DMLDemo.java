package com.app;

import java.util.Scanner;

import com.app.controller.StudentController;

public class DMLDemo {

    public static void main(String[] args) {
        System.out.println("===========Menu===========");
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. Delete Student ");
        System.out.println("4. Display Student");
        System.out.println("5. select a perticular Student");
        System.out.println("====================================");
        Scanner sn=new Scanner(System.in);
        System.out.println("please use below keywords for "+"operaation like add, update, viiew byId:");
        int operation=sn.nextInt();
        StudentController controller=new StudentController();
        switch (operation) {
            case 1:
                controller.addStudent();
                break;
                
            case 2:
                controller.updateStudent();
                break;
                
            case 3:
                controller.deleteStudent();
            	break;
            	
            case 4:
                controller.addStudent();
                break;
            case 5:
                controller.addStudent();
                break;
                
            default:
            	System.out.println("Invalid Request.....!");
                break;
        }
    }
}