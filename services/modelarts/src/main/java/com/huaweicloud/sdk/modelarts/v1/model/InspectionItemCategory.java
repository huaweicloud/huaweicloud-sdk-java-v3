package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：巡检类目。 **取值范围**：   - HOST_CONFIG_STATUS：主机配置和状态   - NPU_HEALTH_CHECK：NPU健康检查   - NPU_PERFORMANCE：NPU性能诊断   - NPU_STRESS_TEST：NPU压测   - NETWORK_STRESS_TEST：网络压测 
 */
public class InspectionItemCategory {

    /**
     * Enum HOST_CONFIG_STATUS for value: "HOST_CONFIG_STATUS"
     */
    public static final InspectionItemCategory HOST_CONFIG_STATUS = new InspectionItemCategory("HOST_CONFIG_STATUS");

    /**
     * Enum NPU_HEALTH_CHECK for value: "NPU_HEALTH_CHECK"
     */
    public static final InspectionItemCategory NPU_HEALTH_CHECK = new InspectionItemCategory("NPU_HEALTH_CHECK");

    /**
     * Enum NPU_PERFORMANCE for value: "NPU_PERFORMANCE"
     */
    public static final InspectionItemCategory NPU_PERFORMANCE = new InspectionItemCategory("NPU_PERFORMANCE");

    /**
     * Enum NPU_STRESS_TEST for value: "NPU_STRESS_TEST"
     */
    public static final InspectionItemCategory NPU_STRESS_TEST = new InspectionItemCategory("NPU_STRESS_TEST");

    /**
     * Enum NETWORK_STRESS_TEST for value: "NETWORK_STRESS_TEST"
     */
    public static final InspectionItemCategory NETWORK_STRESS_TEST = new InspectionItemCategory("NETWORK_STRESS_TEST");

    private static final Map<String, InspectionItemCategory> STATIC_FIELDS = createStaticFields();

    private static Map<String, InspectionItemCategory> createStaticFields() {
        Map<String, InspectionItemCategory> map = new HashMap<>();
        map.put("HOST_CONFIG_STATUS", HOST_CONFIG_STATUS);
        map.put("NPU_HEALTH_CHECK", NPU_HEALTH_CHECK);
        map.put("NPU_PERFORMANCE", NPU_PERFORMANCE);
        map.put("NPU_STRESS_TEST", NPU_STRESS_TEST);
        map.put("NETWORK_STRESS_TEST", NETWORK_STRESS_TEST);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InspectionItemCategory(String value) {
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
    public static InspectionItemCategory fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InspectionItemCategory(value));
    }

    public static InspectionItemCategory valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InspectionItemCategory) {
            return this.value.equals(((InspectionItemCategory) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
