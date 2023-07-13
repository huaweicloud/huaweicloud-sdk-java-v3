package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets ComponentActionType
 */
public class ComponentActionType {

    /**
     * Enum START for value: "start"
     */
    public static final ComponentActionType START = new ComponentActionType("start");

    /**
     * Enum STOP for value: "stop"
     */
    public static final ComponentActionType STOP = new ComponentActionType("stop");

    /**
     * Enum RESTART for value: "restart"
     */
    public static final ComponentActionType RESTART = new ComponentActionType("restart");

    /**
     * Enum SCALE for value: "scale"
     */
    public static final ComponentActionType SCALE = new ComponentActionType("scale");

    /**
     * Enum ROLLBACK for value: "rollback"
     */
    public static final ComponentActionType ROLLBACK = new ComponentActionType("rollback");

    /**
     * Enum CONTINUE_DEPLOY for value: "continue_deploy"
     */
    public static final ComponentActionType CONTINUE_DEPLOY = new ComponentActionType("continue_deploy");

    /**
     * Enum CHECK_GRAY_RELEASE for value: "check_gray_release"
     */
    public static final ComponentActionType CHECK_GRAY_RELEASE = new ComponentActionType("check_gray_release");

    /**
     * Enum MODIFY_GRAY_RULE for value: "modify_gray_rule"
     */
    public static final ComponentActionType MODIFY_GRAY_RULE = new ComponentActionType("modify_gray_rule");

    private static final Map<String, ComponentActionType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ComponentActionType> createStaticFields() {
        Map<String, ComponentActionType> map = new HashMap<>();
        map.put("start", START);
        map.put("stop", STOP);
        map.put("restart", RESTART);
        map.put("scale", SCALE);
        map.put("rollback", ROLLBACK);
        map.put("continue_deploy", CONTINUE_DEPLOY);
        map.put("check_gray_release", CHECK_GRAY_RELEASE);
        map.put("modify_gray_rule", MODIFY_GRAY_RULE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ComponentActionType(String value) {
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
    public static ComponentActionType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ComponentActionType(value));
    }

    public static ComponentActionType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComponentActionType) {
            return this.value.equals(((ComponentActionType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
