package com.car;

import java.io.IOException;
import java.util.Scanner;
public class Interface {
private static Scanner scanner = new Scanner(System.in);
public static String menu(){
  String choise;

  System.out.println("|**********************************|");
  System.out.println("|Виберіть один із варіантів!!!     |");
  System.out.println("|**********************************|");
  System.out.println("|1 - Створити новий аккаунт        |");
  System.out.println("|**********************************|");
  System.out.println("|2 - Увійти в свій обліковий запис |");
  System.out.println("|**********************************|");
  System.out.println("|3 - Переглянути каталог автосалону|");
  System.out.println("|**********************************|");
  System.out.println("|4 - Вихід                         |");
  System.out.println("|**********************************|");

  choise = input.next();
  switch (choise){
    case "1":
    authorization();
    break;
    case "2":
      try {
        registration();
      }  catch (IOException e){
        throw new RuntimeException();
      }
      break;
    case "3":
      System.out.println("|**********************************|");
      System.out.println("|Ви обрали варіант під номером 3   |");
      System.out.println("|**********************************|");
      menu();
      break;
    default:
      return choise = menu();
  }
  return choise;
}

private static void authorization(){
  String usernameInput;
  String passwordInput;
  String filepath = "";

  System.out.println("|************************|");
  System.out.println("|Сторінка авторизації    |");
  System.out.println("|************************|");

  System.out.println("|************************|");
  System.out.println("|Введіть ім'я користувача|");
  System.out.println("|************************|");

  System.out.println("|************************|");
  System.out.println("|Введіть пароль          |");
  System.out.println("|************************|");
  passwordInput = input.next();

  boolean loginSucces = VerifyUserLogin.verifiUserLogin(usernameInput, passwordInput, filepath, definiter",");

  if (loginSucces = true){
    System.out.println("|************************|");
    System.out.println("|Авторизація успішна!!!  |");
    System.out.println("|************************|");
    menu();
  }
  else {
    System.out.println("|************************|");
    System.out.println("|Помилка авторизації!!!  |");
    System.out.println("|************************|");
    menu();
  }
}

private static void registration() throws IOException{
  String usernameInput;
  String passwordInput;
  String filepath = "";

  System.out.println("|************************|");
  System.out.println("|Сторінка реєстрації    |");
  System.out.println("|************************|");

  System.out.println("|************************|");
  System.out.println("|Введіть ім'я користувача|");
  System.out.println("|************************|");

  System.out.println("|************************|");
  System.out.println("|Введіть пароль          |");
  System.out.println("|************************|");
  passwordInput = input.next();

  boolean registrationSucces = Registration.registration(usernameInput, passwordInput, filepath, definiter",");

  if (registrationSucces = true){
    System.out.println("|************************|");
    System.out.println("|Реєстрація успішна!!!  |");
    System.out.println("|************************|");
    menu();
  }
  else {
    System.out.println("|************************|");
    System.out.println("|Помилка реєстрації!!!  |");
    System.out.println("|************************|");
    menu();
  }
}

}
