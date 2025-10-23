package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 模板项
 */
public class TemplateItemEnum {

    /**
     * Enum TASK_STATUS_PIE for value: "task-status-pie"
     */
    public static final TemplateItemEnum TASK_STATUS_PIE = new TemplateItemEnum("task-status-pie");

    /**
     * Enum TASK_TYPE_PIE for value: "task-type-pie"
     */
    public static final TemplateItemEnum TASK_TYPE_PIE = new TemplateItemEnum("task-type-pie");

    /**
     * Enum TASK_STATUS_REGION_COLUMN for value: "task-status-region-column"
     */
    public static final TemplateItemEnum TASK_STATUS_REGION_COLUMN = new TemplateItemEnum("task-status-region-column");

    /**
     * Enum TASK_TYPE_REGION_COLUMN for value: "task-type-region-column"
     */
    public static final TemplateItemEnum TASK_TYPE_REGION_COLUMN = new TemplateItemEnum("task-type-region-column");

    /**
     * Enum TASK_STATUS_TYPE_COLUMN for value: "task-status-type-column"
     */
    public static final TemplateItemEnum TASK_STATUS_TYPE_COLUMN = new TemplateItemEnum("task-status-type-column");

    /**
     * Enum TASK_STATUS_RESOURCE_COLUMN for value: "task-status-resource-column"
     */
    public static final TemplateItemEnum TASK_STATUS_RESOURCE_COLUMN =
        new TemplateItemEnum("task-status-resource-column");

    /**
     * Enum TASK_TREND_CURVE for value: "task-trend-curve"
     */
    public static final TemplateItemEnum TASK_TREND_CURVE = new TemplateItemEnum("task-trend-curve");

    /**
     * Enum TASK_DETAILS for value: "task-details"
     */
    public static final TemplateItemEnum TASK_DETAILS = new TemplateItemEnum("task-details");

    /**
     * Enum RESOURCE_PROTECTION_PIE for value: "resource-protection-pie"
     */
    public static final TemplateItemEnum RESOURCE_PROTECTION_PIE = new TemplateItemEnum("resource-protection-pie");

    /**
     * Enum RESOURCE_COMPLIANCE_PIE for value: "resource-compliance-pie"
     */
    public static final TemplateItemEnum RESOURCE_COMPLIANCE_PIE = new TemplateItemEnum("resource-compliance-pie");

    /**
     * Enum RESOURCE_PROTECTION_REGION_COLUMN for value: "resource-protection-region-column"
     */
    public static final TemplateItemEnum RESOURCE_PROTECTION_REGION_COLUMN =
        new TemplateItemEnum("resource-protection-region-column");

    /**
     * Enum RESOURCE_COMPLIANCE_REGION_COLUMN for value: "resource-compliance-region-column"
     */
    public static final TemplateItemEnum RESOURCE_COMPLIANCE_REGION_COLUMN =
        new TemplateItemEnum("resource-compliance-region-column");

    /**
     * Enum RESOURCE_PROTECTION_TYPE_COLUMN for value: "resource-protection-type-column"
     */
    public static final TemplateItemEnum RESOURCE_PROTECTION_TYPE_COLUMN =
        new TemplateItemEnum("resource-protection-type-column");

    /**
     * Enum RESOURCE_COMPLIANCE_TYPE_COLUMN for value: "resource-compliance-type-column"
     */
    public static final TemplateItemEnum RESOURCE_COMPLIANCE_TYPE_COLUMN =
        new TemplateItemEnum("resource-compliance-type-column");

    /**
     * Enum RESOURCE_COMPLIANCE_PROTECTION_COLUMN for value: "resource-compliance-protection-column"
     */
    public static final TemplateItemEnum RESOURCE_COMPLIANCE_PROTECTION_COLUMN =
        new TemplateItemEnum("resource-compliance-protection-column");

    /**
     * Enum PROTECTED_RESOURCE_COMPLIANCE_TREND_CURVE for value: "protected-resource-compliance-trend-curve"
     */
    public static final TemplateItemEnum PROTECTED_RESOURCE_COMPLIANCE_TREND_CURVE =
        new TemplateItemEnum("protected-resource-compliance-trend-curve");

    /**
     * Enum UNPROTECTED_RESOURCE_COMPLIANCE_TREND_CURVE for value: "unprotected-resource-compliance-trend-curve"
     */
    public static final TemplateItemEnum UNPROTECTED_RESOURCE_COMPLIANCE_TREND_CURVE =
        new TemplateItemEnum("unprotected-resource-compliance-trend-curve");

    /**
     * Enum RESOURCE_TREND_CURVE for value: "resource-trend-curve"
     */
    public static final TemplateItemEnum RESOURCE_TREND_CURVE = new TemplateItemEnum("resource-trend-curve");

    /**
     * Enum RESOURCE_DETAILS for value: "resource-details"
     */
    public static final TemplateItemEnum RESOURCE_DETAILS = new TemplateItemEnum("resource-details");

    /**
     * Enum VAULT_CAPACITY_PIE for value: "vault-capacity-pie"
     */
    public static final TemplateItemEnum VAULT_CAPACITY_PIE = new TemplateItemEnum("vault-capacity-pie");

    /**
     * Enum VAULT_TYPE_PIE for value: "vault-type-pie"
     */
    public static final TemplateItemEnum VAULT_TYPE_PIE = new TemplateItemEnum("vault-type-pie");

    /**
     * Enum VAULT_CAPACITY_REGION_COLUMN for value: "vault-capacity-region-column"
     */
    public static final TemplateItemEnum VAULT_CAPACITY_REGION_COLUMN =
        new TemplateItemEnum("vault-capacity-region-column");

    /**
     * Enum VAULT_TYPE_REGION_COLUMN for value: "vault-type-region-column"
     */
    public static final TemplateItemEnum VAULT_TYPE_REGION_COLUMN = new TemplateItemEnum("vault-type-region-column");

    /**
     * Enum VAULT_CAPACITY_TYPE_COLUMN for value: "vault-capacity-type-column"
     */
    public static final TemplateItemEnum VAULT_CAPACITY_TYPE_COLUMN =
        new TemplateItemEnum("vault-capacity-type-column");

    /**
     * Enum VAULT_USAGE_TREND_CURVE for value: "vault-usage-trend-curve"
     */
    public static final TemplateItemEnum VAULT_USAGE_TREND_CURVE = new TemplateItemEnum("vault-usage-trend-curve");

    /**
     * Enum VAULT_DETAILS for value: "vault-details"
     */
    public static final TemplateItemEnum VAULT_DETAILS = new TemplateItemEnum("vault-details");

    /**
     * Enum BACKUP_STATUS_PIE for value: "backup-status-pie"
     */
    public static final TemplateItemEnum BACKUP_STATUS_PIE = new TemplateItemEnum("backup-status-pie");

    /**
     * Enum BACKUP_TYPE_PIE for value: "backup-type-pie"
     */
    public static final TemplateItemEnum BACKUP_TYPE_PIE = new TemplateItemEnum("backup-type-pie");

    /**
     * Enum BACKUP_TYPE_REGION_COLUMN for value: "backup-type-region-column"
     */
    public static final TemplateItemEnum BACKUP_TYPE_REGION_COLUMN = new TemplateItemEnum("backup-type-region-column");

    /**
     * Enum BACKUP_STATUS_REGION_COLUMN for value: "backup-status-region-column"
     */
    public static final TemplateItemEnum BACKUP_STATUS_REGION_COLUMN =
        new TemplateItemEnum("backup-status-region-column");

    /**
     * Enum BACKUP_STATUS_TYPE_COLUMN for value: "backup-status-type-column"
     */
    public static final TemplateItemEnum BACKUP_STATUS_TYPE_COLUMN = new TemplateItemEnum("backup-status-type-column");

    /**
     * Enum BACKUP_TREND_CURVE for value: "backup-trend-curve"
     */
    public static final TemplateItemEnum BACKUP_TREND_CURVE = new TemplateItemEnum("backup-trend-curve");

    /**
     * Enum BACKUP_DETAILS for value: "backup-details"
     */
    public static final TemplateItemEnum BACKUP_DETAILS = new TemplateItemEnum("backup-details");

    private static final Map<String, TemplateItemEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, TemplateItemEnum> createStaticFields() {
        Map<String, TemplateItemEnum> map = new HashMap<>();
        map.put("task-status-pie", TASK_STATUS_PIE);
        map.put("task-type-pie", TASK_TYPE_PIE);
        map.put("task-status-region-column", TASK_STATUS_REGION_COLUMN);
        map.put("task-type-region-column", TASK_TYPE_REGION_COLUMN);
        map.put("task-status-type-column", TASK_STATUS_TYPE_COLUMN);
        map.put("task-status-resource-column", TASK_STATUS_RESOURCE_COLUMN);
        map.put("task-trend-curve", TASK_TREND_CURVE);
        map.put("task-details", TASK_DETAILS);
        map.put("resource-protection-pie", RESOURCE_PROTECTION_PIE);
        map.put("resource-compliance-pie", RESOURCE_COMPLIANCE_PIE);
        map.put("resource-protection-region-column", RESOURCE_PROTECTION_REGION_COLUMN);
        map.put("resource-compliance-region-column", RESOURCE_COMPLIANCE_REGION_COLUMN);
        map.put("resource-protection-type-column", RESOURCE_PROTECTION_TYPE_COLUMN);
        map.put("resource-compliance-type-column", RESOURCE_COMPLIANCE_TYPE_COLUMN);
        map.put("resource-compliance-protection-column", RESOURCE_COMPLIANCE_PROTECTION_COLUMN);
        map.put("protected-resource-compliance-trend-curve", PROTECTED_RESOURCE_COMPLIANCE_TREND_CURVE);
        map.put("unprotected-resource-compliance-trend-curve", UNPROTECTED_RESOURCE_COMPLIANCE_TREND_CURVE);
        map.put("resource-trend-curve", RESOURCE_TREND_CURVE);
        map.put("resource-details", RESOURCE_DETAILS);
        map.put("vault-capacity-pie", VAULT_CAPACITY_PIE);
        map.put("vault-type-pie", VAULT_TYPE_PIE);
        map.put("vault-capacity-region-column", VAULT_CAPACITY_REGION_COLUMN);
        map.put("vault-type-region-column", VAULT_TYPE_REGION_COLUMN);
        map.put("vault-capacity-type-column", VAULT_CAPACITY_TYPE_COLUMN);
        map.put("vault-usage-trend-curve", VAULT_USAGE_TREND_CURVE);
        map.put("vault-details", VAULT_DETAILS);
        map.put("backup-status-pie", BACKUP_STATUS_PIE);
        map.put("backup-type-pie", BACKUP_TYPE_PIE);
        map.put("backup-type-region-column", BACKUP_TYPE_REGION_COLUMN);
        map.put("backup-status-region-column", BACKUP_STATUS_REGION_COLUMN);
        map.put("backup-status-type-column", BACKUP_STATUS_TYPE_COLUMN);
        map.put("backup-trend-curve", BACKUP_TREND_CURVE);
        map.put("backup-details", BACKUP_DETAILS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TemplateItemEnum(String value) {
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
    public static TemplateItemEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TemplateItemEnum(value));
    }

    public static TemplateItemEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TemplateItemEnum) {
            return this.value.equals(((TemplateItemEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
