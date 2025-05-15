package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 分支网络状态。 - AVAILABLE (可用) - UPDATING (处理中) - FAILED (失败) - CREATING (创建中 - DELETING (删除中) - DELETED (已刪除) - NON-COMPLETE (配置未完成) - RESTORING (恢复中)
 */
public class SiteNetworkStateEnum {

    /**
     * Enum AVAILABLE for value: "AVAILABLE"
     */
    public static final SiteNetworkStateEnum AVAILABLE = new SiteNetworkStateEnum("AVAILABLE");

    /**
     * Enum UPDATING for value: "UPDATING"
     */
    public static final SiteNetworkStateEnum UPDATING = new SiteNetworkStateEnum("UPDATING");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final SiteNetworkStateEnum FAILED = new SiteNetworkStateEnum("FAILED");

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final SiteNetworkStateEnum CREATING = new SiteNetworkStateEnum("CREATING");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final SiteNetworkStateEnum DELETING = new SiteNetworkStateEnum("DELETING");

    /**
     * Enum DELETED for value: "DELETED"
     */
    public static final SiteNetworkStateEnum DELETED = new SiteNetworkStateEnum("DELETED");

    /**
     * Enum NON_COMPLETE for value: "NON-COMPLETE"
     */
    public static final SiteNetworkStateEnum NON_COMPLETE = new SiteNetworkStateEnum("NON-COMPLETE");

    /**
     * Enum RESTORING for value: "RESTORING"
     */
    public static final SiteNetworkStateEnum RESTORING = new SiteNetworkStateEnum("RESTORING");

    private static final Map<String, SiteNetworkStateEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, SiteNetworkStateEnum> createStaticFields() {
        Map<String, SiteNetworkStateEnum> map = new HashMap<>();
        map.put("AVAILABLE", AVAILABLE);
        map.put("UPDATING", UPDATING);
        map.put("FAILED", FAILED);
        map.put("CREATING", CREATING);
        map.put("DELETING", DELETING);
        map.put("DELETED", DELETED);
        map.put("NON-COMPLETE", NON_COMPLETE);
        map.put("RESTORING", RESTORING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SiteNetworkStateEnum(String value) {
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
    public static SiteNetworkStateEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SiteNetworkStateEnum(value));
    }

    public static SiteNetworkStateEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SiteNetworkStateEnum) {
            return this.value.equals(((SiteNetworkStateEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
