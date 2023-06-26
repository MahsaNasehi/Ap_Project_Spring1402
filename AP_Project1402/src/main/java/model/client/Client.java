package model.client;


import controller.TwitterApplication;
import javafx.application.Application;
import model.console_action.ConsoleImpl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.ParseException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        try {
//            Socket socket = new Socket("127.0.0.1", 8080);
//            ObjectOutputStream writer = new ObjectOutputStream(socket.getOutputStream());
//            ObjectInputStream reader = new ObjectInputStream(socket.getInputStream());
//            ExecutorService executorService = Executors.newCachedThreadPool();
//            ConsoleImpl.openAccountMenu(socket, writer,null);
//            Listener listeningUser = new Listener(socket, reader, writer);
//            executorService.execute(listeningUser);
//        }catch (IOException | ParseException e){
//            System.out.println("Server isn't available");
//        }

        Application.launch(TwitterApplication.class,args);
    }


}

