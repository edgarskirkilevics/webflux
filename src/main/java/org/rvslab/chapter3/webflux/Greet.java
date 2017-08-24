package org.rvslab.chapter3.webflux;


/**
 * Created by edgars.kirkilevics on 23/08/2017.
 */
public class Greet {

    private String message;
    public Greet() {}
    public Greet(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
