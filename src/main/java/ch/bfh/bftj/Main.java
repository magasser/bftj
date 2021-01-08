package ch.bfh.bftj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
int x;
int y = 0;
int[] a = new int[5];
String s = "string";
for (byte i = 0; i < 256; i++) {
    y = a[i];
    System.out.println(y);
}
if (s == new StringBuilder("string").toString()) {
    System.out.println("pass");
}
Thread t = new Thread() {
    public void run() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
};
t.start();
try {
    FileInputStream fis = new FileInputStream("test");
    fis.read(new byte[3]);
} catch (FileNotFoundException ex) {} catch (IOException ex) {}

Vector v = new Vector();


for (byte i = 0; i < 128; i++) {
    System.out.println(i);
}

int[] arr = new int[2];
int z = arr[arr.length];

try {
    throw new Exception();
} catch (Exception ex) {

}

    }
}
