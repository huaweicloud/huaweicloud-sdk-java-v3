package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 服务器类型。 COMPUTE: 计算服务器 NETWORK: 网络服务器 BLOCK_STORAGE: 硬盘存储服务器
 */
public class ServerType {

    /**
     * Enum COMPUTE for value: "COMPUTE"
     */
    public static final ServerType COMPUTE = new ServerType("COMPUTE");

    /**
     * Enum NETWORK for value: "NETWORK"
     */
    public static final ServerType NETWORK = new ServerType("NETWORK");

    /**
     * Enum BLOCK_STORAGE for value: "BLOCK_STORAGE"
     */
    public static final ServerType BLOCK_STORAGE = new ServerType("BLOCK_STORAGE");

    private static final Map<String, ServerType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ServerType> createStaticFields() {
        Map<String, ServerType> map = new HashMap<>();
        map.put("COMPUTE", COMPUTE);
        map.put("NETWORK", NETWORK);
        map.put("BLOCK_STORAGE", BLOCK_STORAGE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ServerType(String value) {
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
    public static ServerType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServerType(value));
    }

    public static ServerType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ServerType) {
            return this.value.equals(((ServerType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
