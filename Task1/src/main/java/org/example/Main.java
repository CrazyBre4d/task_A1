package org.example;

import static org.example.IntToIp.integerToIp;
import static org.example.ipToInt.ipToInteger;

public class Main {

    public static void main(String[] args) {
        String ipAddress = "128.32.10.0";
        int ipInteger2 = 255;

        int ipInteger = ipToInteger(ipAddress);
        String ipAddress2 = integerToIp(ipInteger2);

        System.out.println(ipInteger);
        System.out.println(ipAddress2);

    }
}