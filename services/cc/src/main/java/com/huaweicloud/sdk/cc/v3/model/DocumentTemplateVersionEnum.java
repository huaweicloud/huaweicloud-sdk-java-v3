package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 文档模板版本。 - 2022.08.30 (2022.08.30)
 */
public class DocumentTemplateVersionEnum {

    /**
     * Enum _2022_08_30 for value: "2022.08.30"
     */
    public static final DocumentTemplateVersionEnum _2022_08_30 = new DocumentTemplateVersionEnum("2022.08.30");

    private static final Map<String, DocumentTemplateVersionEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, DocumentTemplateVersionEnum> createStaticFields() {
        Map<String, DocumentTemplateVersionEnum> map = new HashMap<>();
        map.put("2022.08.30", _2022_08_30);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DocumentTemplateVersionEnum(String value) {
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
    public static DocumentTemplateVersionEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DocumentTemplateVersionEnum(value));
    }

    public static DocumentTemplateVersionEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DocumentTemplateVersionEnum) {
            return this.value.equals(((DocumentTemplateVersionEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
