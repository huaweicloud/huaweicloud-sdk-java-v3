package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 自定义告警模板类型 **约束限制**： 不涉及。 **取值范围**： 0：指标；2： 事件。 **默认取值**： 0 
 */
public class TemplateTypeUpdate {

    /**
     * Enum NUMBER_0 for value: 0
     */
    public static final TemplateTypeUpdate NUMBER_0 = new TemplateTypeUpdate(0);

    /**
     * Enum NUMBER_2 for value: 2
     */
    public static final TemplateTypeUpdate NUMBER_2 = new TemplateTypeUpdate(2);

    private static final Map<Integer, TemplateTypeUpdate> STATIC_FIELDS = createStaticFields();

    private static Map<Integer, TemplateTypeUpdate> createStaticFields() {
        Map<Integer, TemplateTypeUpdate> map = new HashMap<>();
        map.put(0, NUMBER_0);
        map.put(2, NUMBER_2);
        return Collections.unmodifiableMap(map);
    }

    private Integer value;

    TemplateTypeUpdate(Integer value) {
        this.value = value;
    }

    @JsonValue
    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TemplateTypeUpdate fromValue(Integer value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TemplateTypeUpdate(value));
    }

    public static TemplateTypeUpdate valueOf(Integer value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TemplateTypeUpdate) {
            return this.value.equals(((TemplateTypeUpdate) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
