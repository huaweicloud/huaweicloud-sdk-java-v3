package com.huaweicloud.sdk.roma.v2.model;





import java.util.function.Consumer;
import java.util.Objects;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 字典类型 - system: 代表系统内置字典,用户可编辑但不可删除 - user: 代表用户创建字典
 */
public class DictionaryType {
    
    /**
     * Enum SYSTEM for value: "system"
     */
    public static final DictionaryType SYSTEM = new DictionaryType("system");
    
    /**
     * Enum USER for value: "user"
     */
    public static final DictionaryType USER = new DictionaryType("user");
    

    private static final Map<String, DictionaryType> STATIC_FIELDS = createStaticFields();

    private static Map<String, DictionaryType> createStaticFields() {
        Map<String, DictionaryType> map = new HashMap<>();
        map.put("system", SYSTEM);
        map.put("user", USER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DictionaryType(String value) {
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
    public static DictionaryType fromValue(String value) {
        if( value == null ){
            return null;
        }
        DictionaryType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new DictionaryType(value);
        }
        return result;
    }

    public static DictionaryType valueOf(String value) {
        if( value == null ){
            return null;
        }
        DictionaryType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DictionaryType) {
            return this.value.equals(((DictionaryType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

