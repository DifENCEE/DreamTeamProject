package dreamteam.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;


public interface Command {

     void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException;

}
