package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * * AUDIT_TEXT：直播在非人工退出场景（如最大时长中断，网络异常中断，欠费中断）中断。
 */
public class NotifyEventEnum {

    /**
     * Enum AUTO_EXIT for value: "AUTO_EXIT"
     */
    public static final NotifyEventEnum AUTO_EXIT = new NotifyEventEnum("AUTO_EXIT");

    private static final Map<String, NotifyEventEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, NotifyEventEnum> createStaticFields() {
        Map<String, NotifyEventEnum> map = new HashMap<>();
        map.put("AUTO_EXIT", AUTO_EXIT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    NotifyEventEnum(String value) {
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
    public static NotifyEventEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotifyEventEnum(value));
    }

    public static NotifyEventEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NotifyEventEnum) {
            return this.value.equals(((NotifyEventEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
