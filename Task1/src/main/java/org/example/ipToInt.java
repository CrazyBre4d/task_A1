package org.example;

public class ipToInt {

    public static int ipToInteger(String ipAddress) {
        String[] octets = ipAddress.split("\\.");
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int octet = Integer.parseInt(octets[i]);
            result |= octet << ((3 - i) * 8);
        }
        return result;
    }
}
