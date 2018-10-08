package day12_String.StringTest_Login;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String name = "test";
        String psw = "12345";
        String choice = new String();
        int maxTimes = 3;

        while (true){
            System.out.println("\n---------模拟登陆系统---------");
            System.out.println("Please choose what you want to do:\n1) login in    2) sign up");
            Scanner scChioce = new Scanner(System.in);
            choice = scChioce.nextLine();

            switch (choice){
                case "1":
                    Scanner scName = new Scanner(System.in);
                    Scanner scPsw = new Scanner(System.in);

                    for(int i = maxTimes; i > 0; i--){
                        System.out.println("\nplease input the user name and password:");
                        if(authen(scName.nextLine(), scPsw.nextLine(), name, psw)){
                            System.out.println("login success!");
                            GuessNumberGame.start();
                            break;
                        }else{
                            System.out.println("please check you user name or password!");
                            System.out.println("you have only " + (i-1) + " times to try again!");
                        }
                    }

                    break;
                case "2":
                    signIn(name, psw);
                    break;
                default:
                    System.out.println("error choice!");
                    break;
            }
        }

    }

    // 重新设置账户密码
    // 此时并不会真正改变name和psw,因为String是不可改变的，
    // 新开辟了空间存储新name psw(形参指向这里，原来的依旧指向就旧的值)
    public static void signIn(String name, String psw){
        Scanner scName = new Scanner(System.in);
        Scanner scPsw = new Scanner(System.in);

        System.out.println("please input a new user name:");
        name = scName.nextLine();
        System.out.println("please input a new password:");
        psw = scPsw.nextLine();

        System.out.println("user name:" + name + "    password:" + psw + "  set success!");
    }

    //比较账户密码是否正确
    public static boolean authen(String inputName, String inputPsw, String name, String psw){
        return name.equals(inputName) && psw.equals(inputPsw);
    }
}
