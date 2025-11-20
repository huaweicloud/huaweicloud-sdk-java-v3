package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 要校验的策略类型。 - identity_policy：身份策略 - agency_trust_policy：委托信任策略 - bucket_policy：桶策略 
 */
public class PolicyDocumentType {

    /**
     * Enum IDENTITY_POLICY for value: "identity_policy"
     */
    public static final PolicyDocumentType IDENTITY_POLICY = new PolicyDocumentType("identity_policy");

    /**
     * Enum AGENCY_TRUST_POLICY for value: "agency_trust_policy"
     */
    public static final PolicyDocumentType AGENCY_TRUST_POLICY = new PolicyDocumentType("agency_trust_policy");

    /**
     * Enum BUCKET_POLICY for value: "bucket_policy"
     */
    public static final PolicyDocumentType BUCKET_POLICY = new PolicyDocumentType("bucket_policy");

    private static final Map<String, PolicyDocumentType> STATIC_FIELDS = createStaticFields();

    private static Map<String, PolicyDocumentType> createStaticFields() {
        Map<String, PolicyDocumentType> map = new HashMap<>();
        map.put("identity_policy", IDENTITY_POLICY);
        map.put("agency_trust_policy", AGENCY_TRUST_POLICY);
        map.put("bucket_policy", BUCKET_POLICY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PolicyDocumentType(String value) {
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
    public static PolicyDocumentType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyDocumentType(value));
    }

    public static PolicyDocumentType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PolicyDocumentType) {
            return this.value.equals(((PolicyDocumentType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
