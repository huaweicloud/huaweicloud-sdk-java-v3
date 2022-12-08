package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 验证码接收模式 VMFA：虚拟MFA设备 HMFA：硬件MFA设备
 */
public class ReceiveModeEnum {

    /**
     * Enum VMFA for value: "VMFA"
     */
    public static final ReceiveModeEnum VMFA = new ReceiveModeEnum("VMFA");

    /**
     * Enum HMFA for value: "HMFA"
     */
    public static final ReceiveModeEnum HMFA = new ReceiveModeEnum("HMFA");

    private static final Map<String, ReceiveModeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ReceiveModeEnum> createStaticFields() {
        Map<String, ReceiveModeEnum> map = new HashMap<>();
        map.put("VMFA", VMFA);
        map.put("HMFA", HMFA);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ReceiveModeEnum(String value) {
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
    public static ReceiveModeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        ReceiveModeEnum result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ReceiveModeEnum(value);
        }
        return result;
    }

    public static ReceiveModeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        ReceiveModeEnum result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ReceiveModeEnum) {
            return this.value.equals(((ReceiveModeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
