package org.example;

public class IntToIp {

    public static String integerToIp(int ipInteger) {
        StringBuilder ipAddress = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int octet = (ipInteger >> ((3 - i) * 8)) & 0xFF;
            ipAddress.append(octet);
            if (i < 3) {
                ipAddress.append(".");
            }
        }
        return ipAddress.toString();
    }
}
