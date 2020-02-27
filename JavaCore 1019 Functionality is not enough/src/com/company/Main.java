package com.company;

/*

1019 Functionality is not enough
Task: The program enters a pair from the keyboard: (number and line) and displays them on the screen.

New task: The program enters pairs (number and string) from the keyboard and saves them in HashMap.

An empty line is the end of data entry.
Numbers can be repeated.
Lines are always unique.
The entered data should not be lost!
The program then displays the contents of the HashMap on the screen.
Each pair from a new line.
Input Example:
1
Mother
2
Frame
1
Soaps
Output Example:
1 Soaps
2 frame
1 mom

Requirements:
1. The program should read data from the keyboard.
2. The program should display the text on the screen.
3. In the main method, declare the HashMap collection variable and immediately initialize ee.
4. The program should place in the HashMap pairs read from the keyboard.
5. The program should display the contents of the HashMap according to the condition. The key and value are separated by a space. Each value from a new line.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> map = new HashMap<>();
    while(true) {
        try {
            int id = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            map.put(name, id);
        }
        catch (Exception e) {
            break;
        }
    }
    for (Map.Entry<String, Integer> me : map.entrySet()) {
        System.out.println(me.getValue() + " " + me.getKey());
    }
    }
}


















