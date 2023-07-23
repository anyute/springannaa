package src.main;

import java.io.IOException;

public class Main {

        public static void main(String[] args) {
            int port = 8080; // Порт, на котором будет запущен сервер
            try {
                server.Server server = new server.Server(port);
                server.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
