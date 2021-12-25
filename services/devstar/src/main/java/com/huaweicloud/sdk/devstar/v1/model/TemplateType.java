package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/** Gets or Sets TemplateType */
public class TemplateType {

    /** Enum MOBILE for value: "mobile" */
    public static final TemplateType MOBILE = new TemplateType("mobile");

    /** Enum MICROSERVICE for value: "microservice" */
    public static final TemplateType MICROSERVICE = new TemplateType("microservice");

    /** Enum WEB for value: "web" */
    public static final TemplateType WEB = new TemplateType("web");

    /** Enum FUNCTION for value: "function" */
    public static final TemplateType FUNCTION = new TemplateType("function");

    /** Enum IOT for value: "iot" */
    public static final TemplateType IOT = new TemplateType("iot");

    /** Enum AI for value: "ai" */
    public static final TemplateType AI = new TemplateType("ai");

    /** Enum OTHERS for value: "others" */
    public static final TemplateType OTHERS = new TemplateType("others");

    /** Enum NONE for value: "none" */
    public static final TemplateType NONE = new TemplateType("none");

    private static final Map<String, TemplateType> STATIC_FIELDS = createStaticFields();

    private static Map<String, TemplateType> createStaticFields() {
        Map<String, TemplateType> map = new HashMap<>();
        map.put("mobile", MOBILE);
        map.put("microservice", MICROSERVICE);
        map.put("web", WEB);
        map.put("function", FUNCTION);
        map.put("iot", IOT);
        map.put("ai", AI);
        map.put("others", OTHERS);
        map.put("none", NONE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TemplateType(String value) {
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
    public static TemplateType fromValue(String value) {
        if (value == null) {
            return null;
        }
        TemplateType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new TemplateType(value);
        }
        return result;
    }

    public static TemplateType valueOf(String value) {
        if (value == null) {
            return null;
        }
        TemplateType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TemplateType) {
            return this.value.equals(((TemplateType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
