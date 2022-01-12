package com.hladchenko.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class Task535Test {

    @Test
    public void decodeEncodedUrl() {
        Task535.Codec codec = new Task535.Codec();
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String encoded = codec.encode(longUrl);

        String result = codec.decode(encoded);

        Assert.assertEquals(longUrl, result);
    }

    @Test
    public void decodeEncodedUrlSecondTry() {
        Task535.Codec codec = new Task535.Codec();
        String longUrl = "https://google.com";
        String encoded = codec.encode(longUrl);

        String result = codec.decode(encoded);

        Assert.assertEquals(longUrl, result);
    }
}