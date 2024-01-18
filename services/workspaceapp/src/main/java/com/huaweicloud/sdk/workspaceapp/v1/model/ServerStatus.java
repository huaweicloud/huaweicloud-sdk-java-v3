package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 实例的状态： * &#x60;UNREGISTER&#x60; - 未就绪 * &#x60;REGISTERED&#x60; - 就绪状态 * &#x60;MAINTAINING&#x60; - 维护中 * &#x60;FREEZE&#x60; - 冻结 * &#x60;STOPPED&#x60; - 停止 * &#x60;NONE&#x60; - 异常状态
 */
public class ServerStatus {

    /**
     * Enum UNREGISTER for value: "UNREGISTER"
     */
    public static final ServerStatus UNREGISTER = new ServerStatus("UNREGISTER");

    /**
     * Enum REGISTERED for value: "REGISTERED"
     */
    public static final ServerStatus REGISTERED = new ServerStatus("REGISTERED");

    /**
     * Enum MAINTAINING for value: "MAINTAINING"
     */
    public static final ServerStatus MAINTAINING = new ServerStatus("MAINTAINING");

    /**
     * Enum FREEZE for value: "FREEZE"
     */
    public static final ServerStatus FREEZE = new ServerStatus("FREEZE");

    /**
     * Enum STOPPED for value: "STOPPED"
     */
    public static final ServerStatus STOPPED = new ServerStatus("STOPPED");

    /**
     * Enum NONE for value: "NONE"
     */
    public static final ServerStatus NONE = new ServerStatus("NONE");

    private static final Map<String, ServerStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ServerStatus> createStaticFields() {
        Map<String, ServerStatus> map = new HashMap<>();
        map.put("UNREGISTER", UNREGISTER);
        map.put("REGISTERED", REGISTERED);
        map.put("MAINTAINING", MAINTAINING);
        map.put("FREEZE", FREEZE);
        map.put("STOPPED", STOPPED);
        map.put("NONE", NONE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ServerStatus(String value) {
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
    public static ServerStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServerStatus(value));
    }

    public static ServerStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ServerStatus) {
            return this.value.equals(((ServerStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
