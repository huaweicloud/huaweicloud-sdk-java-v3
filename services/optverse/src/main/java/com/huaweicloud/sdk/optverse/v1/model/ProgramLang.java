package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 编程语言，包含python，c++，java **约束限制**： 不涉及 **取值范围**： * python： python编程语言。 * c++:   c++编程语言。 * java:  java编程语言。 **默认取值**： 不涉及 
 */
public class ProgramLang {

    /**
     * Enum C_ for value: "c++"
     */
    public static final ProgramLang C_ = new ProgramLang("c++");

    /**
     * Enum PYTHON for value: "python"
     */
    public static final ProgramLang PYTHON = new ProgramLang("python");

    /**
     * Enum JAVA for value: "java"
     */
    public static final ProgramLang JAVA = new ProgramLang("java");

    private static final Map<String, ProgramLang> STATIC_FIELDS = createStaticFields();

    private static Map<String, ProgramLang> createStaticFields() {
        Map<String, ProgramLang> map = new HashMap<>();
        map.put("c++", C_);
        map.put("python", PYTHON);
        map.put("java", JAVA);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ProgramLang(String value) {
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
    public static ProgramLang fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProgramLang(value));
    }

    public static ProgramLang valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ProgramLang) {
            return this.value.equals(((ProgramLang) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
