package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * - **参数解释**：渲染格式。 - **取值范围**：|   - STRING 按字符串格式渲染   - TABLE 按表格格式渲染 
 */
public class RenderFormat {

    /**
     * Enum TABLE for value: "TABLE"
     */
    public static final RenderFormat TABLE = new RenderFormat("TABLE");

    /**
     * Enum STRING for value: "STRING"
     */
    public static final RenderFormat STRING = new RenderFormat("STRING");

    private static final Map<String, RenderFormat> STATIC_FIELDS = createStaticFields();

    private static Map<String, RenderFormat> createStaticFields() {
        Map<String, RenderFormat> map = new HashMap<>();
        map.put("TABLE", TABLE);
        map.put("STRING", STRING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RenderFormat(String value) {
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
    public static RenderFormat fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RenderFormat(value));
    }

    public static RenderFormat valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RenderFormat) {
            return this.value.equals(((RenderFormat) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
