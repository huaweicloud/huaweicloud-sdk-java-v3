package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The type of KMS key (CustomerManagedKey or ServiceManagedKey).
 */
public class KmsKeyType {

    /**
     * Enum CUSTOMERMANAGEDKEY for value: "CustomerManagedKey"
     */
    public static final KmsKeyType CUSTOMERMANAGEDKEY = new KmsKeyType("CustomerManagedKey");

    /**
     * Enum SERVICEMANAGEDKEY for value: "ServiceManagedKey"
     */
    public static final KmsKeyType SERVICEMANAGEDKEY = new KmsKeyType("ServiceManagedKey");

    private static final Map<String, KmsKeyType> STATIC_FIELDS = createStaticFields();

    private static Map<String, KmsKeyType> createStaticFields() {
        Map<String, KmsKeyType> map = new HashMap<>();
        map.put("CustomerManagedKey", CUSTOMERMANAGEDKEY);
        map.put("ServiceManagedKey", SERVICEMANAGEDKEY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    KmsKeyType(String value) {
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
    public static KmsKeyType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KmsKeyType(value));
    }

    public static KmsKeyType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof KmsKeyType) {
            return this.value.equals(((KmsKeyType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
