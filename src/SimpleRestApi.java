import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;

public class SimpleRestApi {
    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/courses", new CourseHandler());


        server.setExecutor(null);
        System.out.println("Сервер қосылды! Тексеру үшін мына сілтемеге кір: http://localhost:8080/courses");
        server.start();
    }


    static class CourseHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {

            CourseDAO dao = new CourseDAO();
            List<Course> courses = dao.getAllCourses();


            Gson gson = new Gson();
            String jsonResponse = gson.toJson(courses);


            exchange.getResponseHeaders().set("Content-Type", "application/json; charset=UTF-8");
            exchange.sendResponseHeaders(200, jsonResponse.getBytes().length);

            OutputStream os = exchange.getResponseBody();
            os.write(jsonResponse.getBytes());
            os.close();
        }
    }
}