package com.crypticwallet;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

public class InputMap {
    String publicSpendKey;
    TransactionInput input;

    public InputMap(String publicSpendKey, TransactionInput input) {
        this.publicSpendKey = publicSpendKey;
        this.input = input;
    }

    public WritableMap toWriteableMap() {
        WritableMap map = Arguments.createMap();
        map.putString("publicSpendKey", publicSpendKey);
        map.putMap("input", input.toWriteableMap());

        return map;
    }
}
