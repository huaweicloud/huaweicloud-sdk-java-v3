package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 访问分析结果的来源。 - bucket_acl：桶ACL - bucket_policy：桶策略 
 */
public class FindingSourceType {

    /**
     * Enum BUCKET_ACL for value: "bucket_acl"
     */
    public static final FindingSourceType BUCKET_ACL = new FindingSourceType("bucket_acl");

    /**
     * Enum BUCKET_POLICY for value: "bucket_policy"
     */
    public static final FindingSourceType BUCKET_POLICY = new FindingSourceType("bucket_policy");

    private static final Map<String, FindingSourceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, FindingSourceType> createStaticFields() {
        Map<String, FindingSourceType> map = new HashMap<>();
        map.put("bucket_acl", BUCKET_ACL);
        map.put("bucket_policy", BUCKET_POLICY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FindingSourceType(String value) {
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
    public static FindingSourceType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FindingSourceType(value));
    }

    public static FindingSourceType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FindingSourceType) {
            return this.value.equals(((FindingSourceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
