import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Collections;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RentManagerTest {

    @Test
    void testRentManager() throws IOException, InterruptedException {
        RentManager rentManager = new RentManager();
        rentManager.getTenants(Collections.singletonList("Addresses"));
    }

}