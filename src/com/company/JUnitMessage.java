package com.company;

public class JUnitMessage {
    private String message;
    public JUnitMessage(String message){
        this.message = message;
    }
    public double printMessage(){
        System.out.println(message);
        int divide=1/0;
        return 0;
    }

    public String printHiMessage(){

        message="Hi!"+ message;

        System.out.println(message);

        return message;
    }

}
