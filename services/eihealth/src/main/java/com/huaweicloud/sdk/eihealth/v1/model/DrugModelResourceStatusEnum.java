package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 模型状态。 **约束限制**： 不涉及 **取值范围**： - Normal：正常。 - Freeze：冻结。 - Deleted：删除。 **默认取值**： 不涉及 
 */
public class DrugModelResourceStatusEnum {

    /**
     * Enum NORMAL for value: "Normal"
     */
    public static final DrugModelResourceStatusEnum NORMAL = new DrugModelResourceStatusEnum("Normal");

    /**
     * Enum FREEZE for value: "Freeze"
     */
    public static final DrugModelResourceStatusEnum FREEZE = new DrugModelResourceStatusEnum("Freeze");

    /**
     * Enum DELETED for value: "Deleted"
     */
    public static final DrugModelResourceStatusEnum DELETED = new DrugModelResourceStatusEnum("Deleted");

    private static final Map<String, DrugModelResourceStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, DrugModelResourceStatusEnum> createStaticFields() {
        Map<String, DrugModelResourceStatusEnum> map = new HashMap<>();
        map.put("Normal", NORMAL);
        map.put("Freeze", FREEZE);
        map.put("Deleted", DELETED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DrugModelResourceStatusEnum(String value) {
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
    public static DrugModelResourceStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DrugModelResourceStatusEnum(value));
    }

    public static DrugModelResourceStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DrugModelResourceStatusEnum) {
            return this.value.equals(((DrugModelResourceStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
