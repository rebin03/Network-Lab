import java.net.*;
import java.io.*;

public class SimpleServer {
    public static void main(String args[]) throws IOException {
        // Register service on port 1254
        ServerSocket s = new ServerSocket(1254);

        // Wait and accept a connection
        Socket s1 = s.accept();

        // Get a communication stream associated with the socket 
        OutputStream s1out = s1.getOutputStream();
        DataOutputStream dos = new DataOutputStream(s1out);

        // Send a string! 
        dos.writeUTF("Hi there");

        // Close the connection, but not the server socket
        dos.close();
        s1out.close();
        s1.close();
    }
}


    // Create a ServerSocket object s bound to port 1254.
    // Call accept() on the server socket s to accept incoming client connections. This method blocks until a client connects.
    // Create an OutputStream object s1out from the accepted socket s1.
    // Create a DataOutputStream object dos from the output stream to simplify writing data in a specific format.
    // Use dos to write the string "Hi there" as UTF-8 encoded data to the client.
    // Close the DataOutputStream, the OutputStream, and the accepted socket to release resources and terminate the connection.