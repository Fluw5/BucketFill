package dev.fluw.bucketfill.utils;


import net.md_5.bungee.api.ChatColor;

import java.net.http.WebSocket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexCode implements WebSocket.Listener {
    public static final Pattern HEX_PATTERN = Pattern.compile("&#([A-Fa-f0-9]{6})");

    public static String format(String msg) {
        if (msg != null) {
            Matcher matcher = HEX_PATTERN.matcher(msg);
            StringBuffer buffer = new StringBuffer();

            while (matcher.find()) {
                matcher.appendReplacement(buffer, ChatColor.of("#" + matcher.group(1)).toString());
            }

            return ChatColor.translateAlternateColorCodes('&', matcher.appendTail(buffer).toString());

        }
        return msg;
    }
}
