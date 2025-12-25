package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 采集通道部署的进度 - READY 等待部署 - START 开始部署 - SUCCESS 部署成功 - FAIL 部署失败  **约束限制** 不涉及 **取值范围**: - READY - START - SUCCESS - FAIL  **默认值** 不涉及
 */
public class ChannelOperationStatus {

    /**
     * Enum READY for value: "READY"
     */
    public static final ChannelOperationStatus READY = new ChannelOperationStatus("READY");

    /**
     * Enum START for value: "START"
     */
    public static final ChannelOperationStatus START = new ChannelOperationStatus("START");

    /**
     * Enum SUCCESS for value: "SUCCESS"
     */
    public static final ChannelOperationStatus SUCCESS = new ChannelOperationStatus("SUCCESS");

    /**
     * Enum FAIL for value: "FAIL"
     */
    public static final ChannelOperationStatus FAIL = new ChannelOperationStatus("FAIL");

    private static final Map<String, ChannelOperationStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ChannelOperationStatus> createStaticFields() {
        Map<String, ChannelOperationStatus> map = new HashMap<>();
        map.put("READY", READY);
        map.put("START", START);
        map.put("SUCCESS", SUCCESS);
        map.put("FAIL", FAIL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ChannelOperationStatus(String value) {
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
    public static ChannelOperationStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChannelOperationStatus(value));
    }

    public static ChannelOperationStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ChannelOperationStatus) {
            return this.value.equals(((ChannelOperationStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
