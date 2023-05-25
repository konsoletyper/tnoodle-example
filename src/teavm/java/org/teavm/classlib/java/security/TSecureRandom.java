package org.teavm.classlib.java.security;

import java.util.Random;

public class TSecureRandom extends Random {
    public static TSecureRandom getInstance(String algorithm) {
        return new TSecureRandom();
    }

    public static TSecureRandom getInstance(String algorithm, String provider) {
        return new TSecureRandom();
    }
}
