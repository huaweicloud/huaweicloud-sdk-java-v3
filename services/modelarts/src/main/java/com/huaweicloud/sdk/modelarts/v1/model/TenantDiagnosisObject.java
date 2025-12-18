package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * - **参数解释**：诊断对象。 - **约束限制**：不涉及。 - **取值范围**：   - TRAIN_JOB：作业诊断，诊断指定的训练作业   - TENANT_POOL：资源池诊断，包括物理资源池和逻辑资源池，nodes必填，诊断指定的节点   - LITE_SERVER_SINGLE：轻量算力节点——单节点诊断，node_ids必填，诊断指定单节点   - LITE_SERVER_SUPER：轻量算力节点——超节点诊断，node_ids必填，诊断指定超节点下的子节点 - **默认取值**：不涉及。 
 */
public class TenantDiagnosisObject {

    /**
     * Enum TRAIN_JOB for value: "TRAIN_JOB"
     */
    public static final TenantDiagnosisObject TRAIN_JOB = new TenantDiagnosisObject("TRAIN_JOB");

    /**
     * Enum TENANT_POOL for value: "TENANT_POOL"
     */
    public static final TenantDiagnosisObject TENANT_POOL = new TenantDiagnosisObject("TENANT_POOL");

    /**
     * Enum LITE_SERVER_SINGLE for value: "LITE_SERVER_SINGLE"
     */
    public static final TenantDiagnosisObject LITE_SERVER_SINGLE = new TenantDiagnosisObject("LITE_SERVER_SINGLE");

    /**
     * Enum LITE_SERVER_SUPER for value: "LITE_SERVER_SUPER"
     */
    public static final TenantDiagnosisObject LITE_SERVER_SUPER = new TenantDiagnosisObject("LITE_SERVER_SUPER");

    private static final Map<String, TenantDiagnosisObject> STATIC_FIELDS = createStaticFields();

    private static Map<String, TenantDiagnosisObject> createStaticFields() {
        Map<String, TenantDiagnosisObject> map = new HashMap<>();
        map.put("TRAIN_JOB", TRAIN_JOB);
        map.put("TENANT_POOL", TENANT_POOL);
        map.put("LITE_SERVER_SINGLE", LITE_SERVER_SINGLE);
        map.put("LITE_SERVER_SUPER", LITE_SERVER_SUPER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TenantDiagnosisObject(String value) {
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
    public static TenantDiagnosisObject fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TenantDiagnosisObject(value));
    }

    public static TenantDiagnosisObject valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TenantDiagnosisObject) {
            return this.value.equals(((TenantDiagnosisObject) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
