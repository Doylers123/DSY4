package ie.gmit.ds;

import java.io.IOException;
import java.util.logging.Logger;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class PasswordServer {
    private Server Server;
    private static final Logger logger = Logger.getLogger(Server.class.getName());
    private static final int PORT = 50551;

    private void start() throws IOException {
        Server = ServerBuilder.forPort(PORT)
                .addService(new PasswordServiceImpl())
                .build();
        logger.info("Server started, listening on " + PORT);

    }

    private void stop() {
        if (Server != null) {
            Server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (Server != null) {
            Server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final PasswordServer server = new PasswordServer();
        server.start();
        server.blockUntilShutdown();
    }
}
