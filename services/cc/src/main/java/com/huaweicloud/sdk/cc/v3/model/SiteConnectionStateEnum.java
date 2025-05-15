package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 分支网络连接状态。 - AVAILABLE （可用） - CREATING （创建中） - UPDATING （更新中） - DELETING （删除中） - FREEZING （冻结中） - UNFREEZING （解冻中） - RECOVERING （恢复中） - FAILED （失败） - FREEZED （冻结） - DELETED （已刪除）
 */
public class SiteConnectionStateEnum {

    /**
     * Enum AVAILABLE for value: "AVAILABLE"
     */
    public static final SiteConnectionStateEnum AVAILABLE = new SiteConnectionStateEnum("AVAILABLE");

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final SiteConnectionStateEnum CREATING = new SiteConnectionStateEnum("CREATING");

    /**
     * Enum UPDATING for value: "UPDATING"
     */
    public static final SiteConnectionStateEnum UPDATING = new SiteConnectionStateEnum("UPDATING");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final SiteConnectionStateEnum DELETING = new SiteConnectionStateEnum("DELETING");

    /**
     * Enum FREEZING for value: "FREEZING"
     */
    public static final SiteConnectionStateEnum FREEZING = new SiteConnectionStateEnum("FREEZING");

    /**
     * Enum UNFREEZING for value: "UNFREEZING"
     */
    public static final SiteConnectionStateEnum UNFREEZING = new SiteConnectionStateEnum("UNFREEZING");

    /**
     * Enum RECOVERING for value: "RECOVERING"
     */
    public static final SiteConnectionStateEnum RECOVERING = new SiteConnectionStateEnum("RECOVERING");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final SiteConnectionStateEnum FAILED = new SiteConnectionStateEnum("FAILED");

    /**
     * Enum FREEZED for value: "FREEZED"
     */
    public static final SiteConnectionStateEnum FREEZED = new SiteConnectionStateEnum("FREEZED");

    /**
     * Enum DELETED for value: "DELETED"
     */
    public static final SiteConnectionStateEnum DELETED = new SiteConnectionStateEnum("DELETED");

    private static final Map<String, SiteConnectionStateEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, SiteConnectionStateEnum> createStaticFields() {
        Map<String, SiteConnectionStateEnum> map = new HashMap<>();
        map.put("AVAILABLE", AVAILABLE);
        map.put("CREATING", CREATING);
        map.put("UPDATING", UPDATING);
        map.put("DELETING", DELETING);
        map.put("FREEZING", FREEZING);
        map.put("UNFREEZING", UNFREEZING);
        map.put("RECOVERING", RECOVERING);
        map.put("FAILED", FAILED);
        map.put("FREEZED", FREEZED);
        map.put("DELETED", DELETED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SiteConnectionStateEnum(String value) {
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
    public static SiteConnectionStateEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SiteConnectionStateEnum(value));
    }

    public static SiteConnectionStateEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SiteConnectionStateEnum) {
            return this.value.equals(((SiteConnectionStateEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
