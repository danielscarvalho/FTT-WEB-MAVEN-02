package ftt.ec;

import static spark.Spark.*;

import java.util.Date;

public class HelloFtt {
	
	//Referências:
	//http://localhost:4567/hello
	//https://sparkjava.com/
	//https://books.goalkicker.com/JavaBook/
	//https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826
	//https://maven.apache.org/

    public static void main(String[] args) {
    	
    	
    	//Java Lambda
    	
        get("/hello", (req, res) -> "Hello FTT - GET - " + new Date().toString());
        put("/hello", (req, res) -> "Hello FTT - PUT - " + new Date().toString());
        post("/hello", (req, res) -> "Hello FTT - POST - " + new Date().toString());
        delete("/hello", (req, res) -> "Hello FTT - DELETE - " + new Date().toString());

        
    }
	
	
}



