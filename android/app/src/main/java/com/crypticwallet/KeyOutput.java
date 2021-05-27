package com.crypticwallet;

import com.facebook.react.bridge.ReadableMap;

public class KeyOutput {
    String key;
    long amount;
    long globalIndex;

    public KeyOutput() {}

    public KeyOutput(String key, long amount, long globalIndex) {
        this.key = key;
        this.amount = amount;
        this.globalIndex = globalIndex;
    }

    public KeyOutput(ReadableMap map) {
        this(
            map.getString("key"),
            (long)map.getDouble("amount"),
            map.hasKey("globalIndex") ? (long)map.getDouble("globalIndex") : -1
        );
    }
}
