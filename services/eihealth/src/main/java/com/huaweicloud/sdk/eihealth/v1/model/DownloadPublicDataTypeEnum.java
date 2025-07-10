package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：   下载类型，仅支持PUBLIC、EXTRANET。   **约束限制**：   不涉及   **取值范围**：   * PUBLIC：公共数据   * EXTRANET：外部数据   **默认取值**：   不涉及 
 */
public class DownloadPublicDataTypeEnum {

    /**
     * Enum PUBLIC for value: "PUBLIC"
     */
    public static final DownloadPublicDataTypeEnum PUBLIC = new DownloadPublicDataTypeEnum("PUBLIC");

    /**
     * Enum EXTRANET for value: "EXTRANET"
     */
    public static final DownloadPublicDataTypeEnum EXTRANET = new DownloadPublicDataTypeEnum("EXTRANET");

    private static final Map<String, DownloadPublicDataTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, DownloadPublicDataTypeEnum> createStaticFields() {
        Map<String, DownloadPublicDataTypeEnum> map = new HashMap<>();
        map.put("PUBLIC", PUBLIC);
        map.put("EXTRANET", EXTRANET);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DownloadPublicDataTypeEnum(String value) {
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
    public static DownloadPublicDataTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DownloadPublicDataTypeEnum(value));
    }

    public static DownloadPublicDataTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DownloadPublicDataTypeEnum) {
            return this.value.equals(((DownloadPublicDataTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
