package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 中心网络策略状态。 - AVAILABLE (可用) - CANCELING (取消中) - APPLYING (应用中) - FAILED (失败) - DELETED (已刪除)
 */
public class CentralNetworkPolicyStateEnum {

    /**
     * Enum AVAILABLE for value: "AVAILABLE"
     */
    public static final CentralNetworkPolicyStateEnum AVAILABLE = new CentralNetworkPolicyStateEnum("AVAILABLE");

    /**
     * Enum CANCELING for value: "CANCELING"
     */
    public static final CentralNetworkPolicyStateEnum CANCELING = new CentralNetworkPolicyStateEnum("CANCELING");

    /**
     * Enum APPLYING for value: "APPLYING"
     */
    public static final CentralNetworkPolicyStateEnum APPLYING = new CentralNetworkPolicyStateEnum("APPLYING");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final CentralNetworkPolicyStateEnum FAILED = new CentralNetworkPolicyStateEnum("FAILED");

    /**
     * Enum DELETED for value: "DELETED"
     */
    public static final CentralNetworkPolicyStateEnum DELETED = new CentralNetworkPolicyStateEnum("DELETED");

    private static final Map<String, CentralNetworkPolicyStateEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, CentralNetworkPolicyStateEnum> createStaticFields() {
        Map<String, CentralNetworkPolicyStateEnum> map = new HashMap<>();
        map.put("AVAILABLE", AVAILABLE);
        map.put("CANCELING", CANCELING);
        map.put("APPLYING", APPLYING);
        map.put("FAILED", FAILED);
        map.put("DELETED", DELETED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    CentralNetworkPolicyStateEnum(String value) {
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
    public static CentralNetworkPolicyStateEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CentralNetworkPolicyStateEnum(value));
    }

    public static CentralNetworkPolicyStateEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CentralNetworkPolicyStateEnum) {
            return this.value.equals(((CentralNetworkPolicyStateEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
