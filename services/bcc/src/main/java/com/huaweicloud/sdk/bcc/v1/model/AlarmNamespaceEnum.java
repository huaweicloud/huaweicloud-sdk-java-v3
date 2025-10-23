package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 告警命名空间，取值范围：SYS.CBR,SYS.RDS,SYS.GaussDB
 */
public class AlarmNamespaceEnum {

    /**
     * Enum SYS_CBR for value: "SYS.CBR"
     */
    public static final AlarmNamespaceEnum SYS_CBR = new AlarmNamespaceEnum("SYS.CBR");

    /**
     * Enum SYS_RDS for value: "SYS.RDS"
     */
    public static final AlarmNamespaceEnum SYS_RDS = new AlarmNamespaceEnum("SYS.RDS");

    /**
     * Enum SYS_GAUSSDB for value: "SYS.GaussDB"
     */
    public static final AlarmNamespaceEnum SYS_GAUSSDB = new AlarmNamespaceEnum("SYS.GaussDB");

    private static final Map<String, AlarmNamespaceEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AlarmNamespaceEnum> createStaticFields() {
        Map<String, AlarmNamespaceEnum> map = new HashMap<>();
        map.put("SYS.CBR", SYS_CBR);
        map.put("SYS.RDS", SYS_RDS);
        map.put("SYS.GaussDB", SYS_GAUSSDB);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AlarmNamespaceEnum(String value) {
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
    public static AlarmNamespaceEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmNamespaceEnum(value));
    }

    public static AlarmNamespaceEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AlarmNamespaceEnum) {
            return this.value.equals(((AlarmNamespaceEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
