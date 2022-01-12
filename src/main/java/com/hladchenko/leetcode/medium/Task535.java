/*
    TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl
     and it returns a short URL such as http://tinyurl.com/4e9iAk. Design a class to encode a URL and decode a tiny URL.

    There is no restriction on how your encode/decode algorithm should work.
    You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.

    Implement the Solution class:

    Solution() Initializes the object of the system.
    String encode(String longUrl) Returns a tiny URL for the given longUrl.
    String decode(String shortUrl) Returns the original long URL for the given shortUrl.
    It is guaranteed that the given shortUrl was encoded by the same object.
    https://leetcode.com/problems/encode-and-decode-tinyurl/
 */
package com.hladchenko.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class Task535 {
    public static class Codec {

        private static final int MAX_GENERATE_TRIES = 5;

        Map<String, String> storage = new HashMap<>();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String uniqueId = "";

            for (int i = 0; i < MAX_GENERATE_TRIES; i++) {
                String id = generateId();
                if (!storage.containsKey("http://tinyurl.com/" + id)) {
                    uniqueId = id;
                    break;
                }
            }

            if (uniqueId.equals("")) {
                throw new RuntimeException("Could not create the unique id. Sorry!");
            }

            String shortUrl = "http://tinyurl.com/" + uniqueId;
            storage.put(shortUrl, longUrl);
            return shortUrl;
        }

        private String generateId() {
            char[] uniqueId = new char[6];
            for (int i = 0; i < 6; i++) {
                int random = getRandomNumberInRange(1, 3);
                if (random == 1) {
                    // 48 - 57 (0 - 9)
                    uniqueId[i] = (char) getRandomNumberInRange(48, 57);
                } else if (random == 2) {
                    // 65 - 90 (A - Z)
                    uniqueId[i] = (char) getRandomNumberInRange(65, 90);
                } else {
                    // 97 - 122 (a - z)
                    uniqueId[i] = (char) getRandomNumberInRange(97, 122);
                }
            }
            return String.valueOf(uniqueId);
        }

        private int getRandomNumberInRange(int min, int max) {
            int range = (max - min) + 1;
            return (int) (Math.random() * range) + min;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return storage.get(shortUrl);
        }
    }
}
