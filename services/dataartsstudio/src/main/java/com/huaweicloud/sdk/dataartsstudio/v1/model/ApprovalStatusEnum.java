package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 业务审批状态，只读。 枚举值：   - DEVELOPING: 审核中   - APPROVED: 审核通过   - REJECT: 审核驳回   - WITHDREW: 审核撤销 
 */
public class ApprovalStatusEnum {

    /**
     * Enum DEVELOPING for value: "DEVELOPING"
     */
    public static final ApprovalStatusEnum DEVELOPING = new ApprovalStatusEnum("DEVELOPING");

    /**
     * Enum APPROVED for value: "APPROVED"
     */
    public static final ApprovalStatusEnum APPROVED = new ApprovalStatusEnum("APPROVED");

    /**
     * Enum REJECT for value: "REJECT"
     */
    public static final ApprovalStatusEnum REJECT = new ApprovalStatusEnum("REJECT");

    /**
     * Enum WITHDREW for value: "WITHDREW"
     */
    public static final ApprovalStatusEnum WITHDREW = new ApprovalStatusEnum("WITHDREW");

    private static final Map<String, ApprovalStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ApprovalStatusEnum> createStaticFields() {
        Map<String, ApprovalStatusEnum> map = new HashMap<>();
        map.put("DEVELOPING", DEVELOPING);
        map.put("APPROVED", APPROVED);
        map.put("REJECT", REJECT);
        map.put("WITHDREW", WITHDREW);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ApprovalStatusEnum(String value) {
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
    public static ApprovalStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApprovalStatusEnum(value));
    }

    public static ApprovalStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ApprovalStatusEnum) {
            return this.value.equals(((ApprovalStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
