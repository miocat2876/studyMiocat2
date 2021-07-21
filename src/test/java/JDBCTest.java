import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.Assert.fail;

@Log4j
public class JDBCTest {
    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void connection() {
        try(Connection conn = DriverManager.getConnection(
                "jdbc:mariadb://kgm2876.iptime.org:9504/bvoat", "BVOAT", "1024")) {
            log.info(conn);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}