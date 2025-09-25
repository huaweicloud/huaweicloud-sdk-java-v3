package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 计费资产状态。 **约束限制**： 不涉及 **取值范围**： - Normal：正常 - Freeze：冻结 - Deleted：删除 **默认取值**： 不涉及 
 */
public class AssetResourceStatusEnum {

    /**
     * Enum NORMAL for value: "Normal"
     */
    public static final AssetResourceStatusEnum NORMAL = new AssetResourceStatusEnum("Normal");

    /**
     * Enum FREEZE for value: "Freeze"
     */
    public static final AssetResourceStatusEnum FREEZE = new AssetResourceStatusEnum("Freeze");

    /**
     * Enum DELETED for value: "Deleted"
     */
    public static final AssetResourceStatusEnum DELETED = new AssetResourceStatusEnum("Deleted");

    private static final Map<String, AssetResourceStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AssetResourceStatusEnum> createStaticFields() {
        Map<String, AssetResourceStatusEnum> map = new HashMap<>();
        map.put("Normal", NORMAL);
        map.put("Freeze", FREEZE);
        map.put("Deleted", DELETED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AssetResourceStatusEnum(String value) {
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
    public static AssetResourceStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssetResourceStatusEnum(value));
    }

    public static AssetResourceStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AssetResourceStatusEnum) {
            return this.value.equals(((AssetResourceStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
