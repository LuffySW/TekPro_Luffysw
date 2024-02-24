package TeoriPertemuan3.src;

import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        OperatingSystem windows = new Windows("10");
        OperatingSystem linux = new Linux("Ubuntu 20.04");
        OperatingSystem macOS = new MacOS("SIerra 10.12.6");

        windows.bootUp();
        windows.shutDown();

        linux.bootUp();
        linux.shutDown();

        macOS.bootUp();
        macOS.shutDown();
    }
}
