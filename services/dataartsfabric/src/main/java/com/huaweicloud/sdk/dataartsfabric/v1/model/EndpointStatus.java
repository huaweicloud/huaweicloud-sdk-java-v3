package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 状态。可选值如下： CREATING：创建中 RUNNING：运行中 CREATE_FAILED：创建失败 DELETING：删除中 DELETED：已删除 UPDATING: 更新中 UPDATE_FAILED:升级失败 DELETE_FAILED：创建失败 FROZEN:冻结 INACTIVE:未开通（公共EP）
 */
public class EndpointStatus {

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final EndpointStatus CREATING = new EndpointStatus("CREATING");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final EndpointStatus RUNNING = new EndpointStatus("RUNNING");

    /**
     * Enum CREATE_FAILED for value: "CREATE_FAILED"
     */
    public static final EndpointStatus CREATE_FAILED = new EndpointStatus("CREATE_FAILED");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final EndpointStatus DELETING = new EndpointStatus("DELETING");

    /**
     * Enum DELETED for value: "DELETED"
     */
    public static final EndpointStatus DELETED = new EndpointStatus("DELETED");

    /**
     * Enum UPDATING for value: "UPDATING"
     */
    public static final EndpointStatus UPDATING = new EndpointStatus("UPDATING");

    /**
     * Enum UPDATE_FAILED for value: "UPDATE_FAILED"
     */
    public static final EndpointStatus UPDATE_FAILED = new EndpointStatus("UPDATE_FAILED");

    /**
     * Enum DELETE_FAILED for value: "DELETE_FAILED"
     */
    public static final EndpointStatus DELETE_FAILED = new EndpointStatus("DELETE_FAILED");

    /**
     * Enum FROZEN for value: "FROZEN"
     */
    public static final EndpointStatus FROZEN = new EndpointStatus("FROZEN");

    /**
     * Enum INACTIVE for value: "INACTIVE"
     */
    public static final EndpointStatus INACTIVE = new EndpointStatus("INACTIVE");

    private static final Map<String, EndpointStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, EndpointStatus> createStaticFields() {
        Map<String, EndpointStatus> map = new HashMap<>();
        map.put("CREATING", CREATING);
        map.put("RUNNING", RUNNING);
        map.put("CREATE_FAILED", CREATE_FAILED);
        map.put("DELETING", DELETING);
        map.put("DELETED", DELETED);
        map.put("UPDATING", UPDATING);
        map.put("UPDATE_FAILED", UPDATE_FAILED);
        map.put("DELETE_FAILED", DELETE_FAILED);
        map.put("FROZEN", FROZEN);
        map.put("INACTIVE", INACTIVE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    EndpointStatus(String value) {
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
    public static EndpointStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EndpointStatus(value));
    }

    public static EndpointStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EndpointStatus) {
            return this.value.equals(((EndpointStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
