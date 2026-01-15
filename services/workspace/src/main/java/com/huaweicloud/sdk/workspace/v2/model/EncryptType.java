package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 加密类型。 - KEEP：保持原有加密状态 - UNENCRYPTED：不加密 - ENCRYPTED：加密（需同步上传kms_id）
 */
public class EncryptType {

    /**
     * Enum KEEP for value: "KEEP"
     */
    public static final EncryptType KEEP = new EncryptType("KEEP");

    /**
     * Enum UNENCRYPTED for value: "UNENCRYPTED"
     */
    public static final EncryptType UNENCRYPTED = new EncryptType("UNENCRYPTED");

    /**
     * Enum ENCRYPTED for value: "ENCRYPTED"
     */
    public static final EncryptType ENCRYPTED = new EncryptType("ENCRYPTED");

    private static final Map<String, EncryptType> STATIC_FIELDS = createStaticFields();

    private static Map<String, EncryptType> createStaticFields() {
        Map<String, EncryptType> map = new HashMap<>();
        map.put("KEEP", KEEP);
        map.put("UNENCRYPTED", UNENCRYPTED);
        map.put("ENCRYPTED", ENCRYPTED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    EncryptType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static EncryptType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EncryptType(value));
    }

    public static EncryptType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EncryptType) {
            return this.value.equals(((EncryptType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
