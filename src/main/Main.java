package src.main;

import java.io.IOException;

public class Main {

public static void main(String[] args) {
        try {
        // Создаем сервер на порту 12345
        Server server = new Server(12345);
        // Запускаем сервер
        server.start();
        } catch (IOException e) {
        e.printStackTrace();
        }
} }

