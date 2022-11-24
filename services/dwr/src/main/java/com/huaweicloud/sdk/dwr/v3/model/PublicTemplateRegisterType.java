package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * init_created新建，submit_approve等待审核，deprecate_approve申请禁用
 */
public class PublicTemplateRegisterType {

    /**
     * Enum INIT_CREATED_SUBMIT_APPROVE_DEPRECATE_APPROVE for value: "init_created，submit_approve，deprecate_approve"
     */
    public static final PublicTemplateRegisterType INIT_CREATED_SUBMIT_APPROVE_DEPRECATE_APPROVE =
        new PublicTemplateRegisterType("init_created，submit_approve，deprecate_approve");

    private static final Map<String, PublicTemplateRegisterType> STATIC_FIELDS = createStaticFields();

    private static Map<String, PublicTemplateRegisterType> createStaticFields() {
        Map<String, PublicTemplateRegisterType> map = new HashMap<>();
        map.put("init_created，submit_approve，deprecate_approve", INIT_CREATED_SUBMIT_APPROVE_DEPRECATE_APPROVE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PublicTemplateRegisterType(String value) {
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
    public static PublicTemplateRegisterType fromValue(String value) {
        if (value == null) {
            return null;
        }
        PublicTemplateRegisterType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new PublicTemplateRegisterType(value);
        }
        return result;
    }

    public static PublicTemplateRegisterType valueOf(String value) {
        if (value == null) {
            return null;
        }
        PublicTemplateRegisterType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PublicTemplateRegisterType) {
            return this.value.equals(((PublicTemplateRegisterType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
