package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 字段类型所属域。NUMBER(数字类型)、STRING(字符类型)、DATETIME(日期类型)、BLOB(大对象(BLOB))、OTHER(其它类型)。
 */
public class DataTypeDomainEnum {

    /**
     * Enum NUMBER for value: "NUMBER"
     */
    public static final DataTypeDomainEnum NUMBER = new DataTypeDomainEnum("NUMBER");

    /**
     * Enum STRING for value: "STRING"
     */
    public static final DataTypeDomainEnum STRING = new DataTypeDomainEnum("STRING");

    /**
     * Enum DATETIME for value: "DATETIME"
     */
    public static final DataTypeDomainEnum DATETIME = new DataTypeDomainEnum("DATETIME");

    /**
     * Enum BLOB for value: "BLOB"
     */
    public static final DataTypeDomainEnum BLOB = new DataTypeDomainEnum("BLOB");

    /**
     * Enum OTHER for value: "OTHER"
     */
    public static final DataTypeDomainEnum OTHER = new DataTypeDomainEnum("OTHER");

    private static final Map<String, DataTypeDomainEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, DataTypeDomainEnum> createStaticFields() {
        Map<String, DataTypeDomainEnum> map = new HashMap<>();
        map.put("NUMBER", NUMBER);
        map.put("STRING", STRING);
        map.put("DATETIME", DATETIME);
        map.put("BLOB", BLOB);
        map.put("OTHER", OTHER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DataTypeDomainEnum(String value) {
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
    public static DataTypeDomainEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DataTypeDomainEnum(value));
    }

    public static DataTypeDomainEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DataTypeDomainEnum) {
            return this.value.equals(((DataTypeDomainEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
