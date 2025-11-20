package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 分析器的类型。 - account: 账号级外部访问分析器 - organization：组织级外部访问分析器 - account_unused_access：账号级未使用访问分析器 - organization_unused_access：组织级未使用访问分析器 - account_privilege_escalation：账号级提权访问分析器 - account_iam_best_practice：账号级IAM最佳实践分析器 
 */
public class AnalyzerType {

    /**
     * Enum ACCOUNT for value: "account"
     */
    public static final AnalyzerType ACCOUNT = new AnalyzerType("account");

    /**
     * Enum ORGANIZATION for value: "organization"
     */
    public static final AnalyzerType ORGANIZATION = new AnalyzerType("organization");

    /**
     * Enum ACCOUNT_UNUSED_ACCESS for value: "account_unused_access"
     */
    public static final AnalyzerType ACCOUNT_UNUSED_ACCESS = new AnalyzerType("account_unused_access");

    /**
     * Enum ORGANIZATION_UNUSED_ACCESS for value: "organization_unused_access"
     */
    public static final AnalyzerType ORGANIZATION_UNUSED_ACCESS = new AnalyzerType("organization_unused_access");

    /**
     * Enum ACCOUNT_PRIVILEGE_ESCALATION for value: "account_privilege_escalation"
     */
    public static final AnalyzerType ACCOUNT_PRIVILEGE_ESCALATION = new AnalyzerType("account_privilege_escalation");

    /**
     * Enum ACCOUNT_IAM_BEST_PRACTICE for value: "account_iam_best_practice"
     */
    public static final AnalyzerType ACCOUNT_IAM_BEST_PRACTICE = new AnalyzerType("account_iam_best_practice");

    private static final Map<String, AnalyzerType> STATIC_FIELDS = createStaticFields();

    private static Map<String, AnalyzerType> createStaticFields() {
        Map<String, AnalyzerType> map = new HashMap<>();
        map.put("account", ACCOUNT);
        map.put("organization", ORGANIZATION);
        map.put("account_unused_access", ACCOUNT_UNUSED_ACCESS);
        map.put("organization_unused_access", ORGANIZATION_UNUSED_ACCESS);
        map.put("account_privilege_escalation", ACCOUNT_PRIVILEGE_ESCALATION);
        map.put("account_iam_best_practice", ACCOUNT_IAM_BEST_PRACTICE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AnalyzerType(String value) {
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
    public static AnalyzerType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AnalyzerType(value));
    }

    public static AnalyzerType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AnalyzerType) {
            return this.value.equals(((AnalyzerType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
