package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 中心网络状态。 - AVAILABLE (可用) - UPDATING (处理中) - FAILED (失败) - CREATING (创建中) - DELETING (删除中) - DELETED (已删除) - RESTORING (恢复中)
 */
public class CentralNetworkStateEnum {

    /**
     * Enum AVAILABLE for value: "AVAILABLE"
     */
    public static final CentralNetworkStateEnum AVAILABLE = new CentralNetworkStateEnum("AVAILABLE");

    /**
     * Enum UPDATING for value: "UPDATING"
     */
    public static final CentralNetworkStateEnum UPDATING = new CentralNetworkStateEnum("UPDATING");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final CentralNetworkStateEnum FAILED = new CentralNetworkStateEnum("FAILED");

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final CentralNetworkStateEnum CREATING = new CentralNetworkStateEnum("CREATING");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final CentralNetworkStateEnum DELETING = new CentralNetworkStateEnum("DELETING");

    /**
     * Enum DELETED for value: "DELETED"
     */
    public static final CentralNetworkStateEnum DELETED = new CentralNetworkStateEnum("DELETED");

    /**
     * Enum RESTORING for value: "RESTORING"
     */
    public static final CentralNetworkStateEnum RESTORING = new CentralNetworkStateEnum("RESTORING");

    private static final Map<String, CentralNetworkStateEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, CentralNetworkStateEnum> createStaticFields() {
        Map<String, CentralNetworkStateEnum> map = new HashMap<>();
        map.put("AVAILABLE", AVAILABLE);
        map.put("UPDATING", UPDATING);
        map.put("FAILED", FAILED);
        map.put("CREATING", CREATING);
        map.put("DELETING", DELETING);
        map.put("DELETED", DELETED);
        map.put("RESTORING", RESTORING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    CentralNetworkStateEnum(String value) {
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
    public static CentralNetworkStateEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CentralNetworkStateEnum(value));
    }

    public static CentralNetworkStateEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CentralNetworkStateEnum) {
            return this.value.equals(((CentralNetworkStateEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
