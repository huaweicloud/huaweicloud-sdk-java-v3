package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 资源运营状态场景： ARREAR：欠费场景 POLICE：公安场景 ILLEGAL：违规场景 VERIFY：客户未实名认证冻结场景
 */
public class Scene {

    /**
     * Enum ARREAR for value: "ARREAR"
     */
    public static final Scene ARREAR = new Scene("ARREAR");

    /**
     * Enum POLICE for value: "POLICE"
     */
    public static final Scene POLICE = new Scene("POLICE");

    /**
     * Enum ILLEGAL for value: "ILLEGAL"
     */
    public static final Scene ILLEGAL = new Scene("ILLEGAL");

    /**
     * Enum VERIFY for value: "VERIFY"
     */
    public static final Scene VERIFY = new Scene("VERIFY");

    private static final Map<String, Scene> STATIC_FIELDS = createStaticFields();

    private static Map<String, Scene> createStaticFields() {
        Map<String, Scene> map = new HashMap<>();
        map.put("ARREAR", ARREAR);
        map.put("POLICE", POLICE);
        map.put("ILLEGAL", ILLEGAL);
        map.put("VERIFY", VERIFY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Scene(String value) {
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
    public static Scene fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Scene(value));
    }

    public static Scene valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Scene) {
            return this.value.equals(((Scene) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
