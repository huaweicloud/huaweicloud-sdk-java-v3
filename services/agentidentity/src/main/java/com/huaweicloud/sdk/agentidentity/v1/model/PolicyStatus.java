package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 策略的当前状态。CREATING - 策略正在创建中；ACTIVE - 策略已激活并可用；UPDATING - 策略正在更新中；DELETING - 策略正在删除中；CREATE_FAILED - 策略创建失败；UPDATE_FAILED - 策略更新失败；DELETE_FAILED - 策略删除失败。
 */
public class PolicyStatus {

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final PolicyStatus CREATING = new PolicyStatus("CREATING");

    /**
     * Enum ACTIVE for value: "ACTIVE"
     */
    public static final PolicyStatus ACTIVE = new PolicyStatus("ACTIVE");

    /**
     * Enum UPDATING for value: "UPDATING"
     */
    public static final PolicyStatus UPDATING = new PolicyStatus("UPDATING");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final PolicyStatus DELETING = new PolicyStatus("DELETING");

    /**
     * Enum CREATE_FAILED for value: "CREATE_FAILED"
     */
    public static final PolicyStatus CREATE_FAILED = new PolicyStatus("CREATE_FAILED");

    /**
     * Enum UPDATE_FAILED for value: "UPDATE_FAILED"
     */
    public static final PolicyStatus UPDATE_FAILED = new PolicyStatus("UPDATE_FAILED");

    /**
     * Enum DELETE_FAILED for value: "DELETE_FAILED"
     */
    public static final PolicyStatus DELETE_FAILED = new PolicyStatus("DELETE_FAILED");

    private static final Map<String, PolicyStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, PolicyStatus> createStaticFields() {
        Map<String, PolicyStatus> map = new HashMap<>();
        map.put("CREATING", CREATING);
        map.put("ACTIVE", ACTIVE);
        map.put("UPDATING", UPDATING);
        map.put("DELETING", DELETING);
        map.put("CREATE_FAILED", CREATE_FAILED);
        map.put("UPDATE_FAILED", UPDATE_FAILED);
        map.put("DELETE_FAILED", DELETE_FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PolicyStatus(String value) {
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
    public static PolicyStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyStatus(value));
    }

    public static PolicyStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PolicyStatus) {
            return this.value.equals(((PolicyStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
