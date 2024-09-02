package org.example.app.utils;

public enum Constants {

     FIRST_NUM("Enter a first number: "),
     SEC_NUM ("Enter second number:"),
     NOT_NUM("This is not a number! Try again: "),
     NOW_SUCH_OPTION("There is no such option! Try again: "),
     WHY_ZERO("You can't divide by 0!"),
     SMTH_NOT_WRONG("Something went wrong."),
     FINISH("Application is closing...");


     private final String message;

     Constants (String message) {
          this.message = message;
     }
     public String getMessage () {
          return message;
     }
}

