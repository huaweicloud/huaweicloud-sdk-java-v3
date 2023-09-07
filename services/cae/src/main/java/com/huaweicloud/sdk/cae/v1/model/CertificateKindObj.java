package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“Certificate”，该值不可修改。
 */
public class CertificateKindObj {

    /**
     * Enum CERTIFICATE for value: "Certificate"
     */
    public static final CertificateKindObj CERTIFICATE = new CertificateKindObj("Certificate");

    private static final Map<String, CertificateKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, CertificateKindObj> createStaticFields() {
        Map<String, CertificateKindObj> map = new HashMap<>();
        map.put("Certificate", CERTIFICATE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    CertificateKindObj(String value) {
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
    public static CertificateKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CertificateKindObj(value));
    }

    public static CertificateKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CertificateKindObj) {
            return this.value.equals(((CertificateKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
