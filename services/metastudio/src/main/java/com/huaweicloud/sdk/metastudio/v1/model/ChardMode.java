package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 资源计费类型。 * PERIODIC: 包周期 * ONE_TIME：一次性计费 &gt; * 一次性计费包括：租户订购的一次性资源，SP管理员分配给租户的一次性资源。
 */
public class ChardMode {

    /**
     * Enum PERIODIC for value: "PERIODIC"
     */
    public static final ChardMode PERIODIC = new ChardMode("PERIODIC");

    /**
     * Enum ONE_TIME for value: "ONE_TIME"
     */
    public static final ChardMode ONE_TIME = new ChardMode("ONE_TIME");

    private static final Map<String, ChardMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, ChardMode> createStaticFields() {
        Map<String, ChardMode> map = new HashMap<>();
        map.put("PERIODIC", PERIODIC);
        map.put("ONE_TIME", ONE_TIME);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ChardMode(String value) {
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
    public static ChardMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChardMode(value));
    }

    public static ChardMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ChardMode) {
            return this.value.equals(((ChardMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
