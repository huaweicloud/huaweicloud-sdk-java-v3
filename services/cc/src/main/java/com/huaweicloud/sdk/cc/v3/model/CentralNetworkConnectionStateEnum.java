package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 中心网络连接状态。 - AVAILABLE (可用) - CREATING (创建中) - UPDATING (更新中) - DELETING (删除中) - FREEZING (冻结中) - UNFREEZING (解冻中) - RECOVERING (恢复中) - FAILED (失败) - DELETED (已删除) - APPROVING (审批中) - APPROVED (已审批) - UNAPPROVED (审批未通过)
 */
public class CentralNetworkConnectionStateEnum {

    /**
     * Enum AVAILABLE for value: "AVAILABLE"
     */
    public static final CentralNetworkConnectionStateEnum AVAILABLE =
        new CentralNetworkConnectionStateEnum("AVAILABLE");

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final CentralNetworkConnectionStateEnum CREATING = new CentralNetworkConnectionStateEnum("CREATING");

    /**
     * Enum UPDATING for value: "UPDATING"
     */
    public static final CentralNetworkConnectionStateEnum UPDATING = new CentralNetworkConnectionStateEnum("UPDATING");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final CentralNetworkConnectionStateEnum DELETING = new CentralNetworkConnectionStateEnum("DELETING");

    /**
     * Enum FREEZING for value: "FREEZING"
     */
    public static final CentralNetworkConnectionStateEnum FREEZING = new CentralNetworkConnectionStateEnum("FREEZING");

    /**
     * Enum UNFREEZING for value: "UNFREEZING"
     */
    public static final CentralNetworkConnectionStateEnum UNFREEZING =
        new CentralNetworkConnectionStateEnum("UNFREEZING");

    /**
     * Enum RECOVERING for value: "RECOVERING"
     */
    public static final CentralNetworkConnectionStateEnum RECOVERING =
        new CentralNetworkConnectionStateEnum("RECOVERING");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final CentralNetworkConnectionStateEnum FAILED = new CentralNetworkConnectionStateEnum("FAILED");

    /**
     * Enum DELETED for value: "DELETED"
     */
    public static final CentralNetworkConnectionStateEnum DELETED = new CentralNetworkConnectionStateEnum("DELETED");

    /**
     * Enum APPROVING for value: "APPROVING"
     */
    public static final CentralNetworkConnectionStateEnum APPROVING =
        new CentralNetworkConnectionStateEnum("APPROVING");

    /**
     * Enum APPROVED for value: "APPROVED"
     */
    public static final CentralNetworkConnectionStateEnum APPROVED = new CentralNetworkConnectionStateEnum("APPROVED");

    /**
     * Enum UNAPPROVED for value: "UNAPPROVED"
     */
    public static final CentralNetworkConnectionStateEnum UNAPPROVED =
        new CentralNetworkConnectionStateEnum("UNAPPROVED");

    private static final Map<String, CentralNetworkConnectionStateEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, CentralNetworkConnectionStateEnum> createStaticFields() {
        Map<String, CentralNetworkConnectionStateEnum> map = new HashMap<>();
        map.put("AVAILABLE", AVAILABLE);
        map.put("CREATING", CREATING);
        map.put("UPDATING", UPDATING);
        map.put("DELETING", DELETING);
        map.put("FREEZING", FREEZING);
        map.put("UNFREEZING", UNFREEZING);
        map.put("RECOVERING", RECOVERING);
        map.put("FAILED", FAILED);
        map.put("DELETED", DELETED);
        map.put("APPROVING", APPROVING);
        map.put("APPROVED", APPROVED);
        map.put("UNAPPROVED", UNAPPROVED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    CentralNetworkConnectionStateEnum(String value) {
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
    public static CentralNetworkConnectionStateEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElse(new CentralNetworkConnectionStateEnum(value));
    }

    public static CentralNetworkConnectionStateEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CentralNetworkConnectionStateEnum) {
            return this.value.equals(((CentralNetworkConnectionStateEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
