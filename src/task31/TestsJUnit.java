package task31;

import org.junit.*;
import org.junit.platform.commons.JUnitException;
import task25.ValidateIP;

import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestsJUnit {

    public static boolean test() {
        String s = "143.1.1.1";
        assertTrue(ValidateIP.validate(s));
        return true;
    }

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/task31/test.md");
        fw.write("Results of test\n");
        if (test()) {
            fw.write("All good");
        } else {
            fw.write("tests failed");
        }
        fw.flush();
    }
}
