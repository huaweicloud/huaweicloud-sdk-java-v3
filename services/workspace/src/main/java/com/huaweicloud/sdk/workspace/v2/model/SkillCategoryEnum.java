package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 技能分类枚举。
 */
public class SkillCategoryEnum {

    /**
     * Enum SYSTEM_CORE for value: "SYSTEM_CORE"
     */
    public static final SkillCategoryEnum SYSTEM_CORE = new SkillCategoryEnum("SYSTEM_CORE");

    /**
     * Enum AI_COGNITIVE for value: "AI_COGNITIVE"
     */
    public static final SkillCategoryEnum AI_COGNITIVE = new SkillCategoryEnum("AI_COGNITIVE");

    /**
     * Enum WEB_SEARCH for value: "WEB_SEARCH"
     */
    public static final SkillCategoryEnum WEB_SEARCH = new SkillCategoryEnum("WEB_SEARCH");

    /**
     * Enum BROWSER_AUTOMATION for value: "BROWSER_AUTOMATION"
     */
    public static final SkillCategoryEnum BROWSER_AUTOMATION = new SkillCategoryEnum("BROWSER_AUTOMATION");

    /**
     * Enum DEV_CODE for value: "DEV_CODE"
     */
    public static final SkillCategoryEnum DEV_CODE = new SkillCategoryEnum("DEV_CODE");

    /**
     * Enum DOC_KNOWLEDGE for value: "DOC_KNOWLEDGE"
     */
    public static final SkillCategoryEnum DOC_KNOWLEDGE = new SkillCategoryEnum("DOC_KNOWLEDGE");

    /**
     * Enum OFFICE_COLLAB for value: "OFFICE_COLLAB"
     */
    public static final SkillCategoryEnum OFFICE_COLLAB = new SkillCategoryEnum("OFFICE_COLLAB");

    /**
     * Enum WORKFLOW_AUTOMATION for value: "WORKFLOW_AUTOMATION"
     */
    public static final SkillCategoryEnum WORKFLOW_AUTOMATION = new SkillCategoryEnum("WORKFLOW_AUTOMATION");

    /**
     * Enum MULTIMEDIA_CREATIVE for value: "MULTIMEDIA_CREATIVE"
     */
    public static final SkillCategoryEnum MULTIMEDIA_CREATIVE = new SkillCategoryEnum("MULTIMEDIA_CREATIVE");

    /**
     * Enum SYSTEM_TOOLS for value: "SYSTEM_TOOLS"
     */
    public static final SkillCategoryEnum SYSTEM_TOOLS = new SkillCategoryEnum("SYSTEM_TOOLS");

    private static final Map<String, SkillCategoryEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, SkillCategoryEnum> createStaticFields() {
        Map<String, SkillCategoryEnum> map = new HashMap<>();
        map.put("SYSTEM_CORE", SYSTEM_CORE);
        map.put("AI_COGNITIVE", AI_COGNITIVE);
        map.put("WEB_SEARCH", WEB_SEARCH);
        map.put("BROWSER_AUTOMATION", BROWSER_AUTOMATION);
        map.put("DEV_CODE", DEV_CODE);
        map.put("DOC_KNOWLEDGE", DOC_KNOWLEDGE);
        map.put("OFFICE_COLLAB", OFFICE_COLLAB);
        map.put("WORKFLOW_AUTOMATION", WORKFLOW_AUTOMATION);
        map.put("MULTIMEDIA_CREATIVE", MULTIMEDIA_CREATIVE);
        map.put("SYSTEM_TOOLS", SYSTEM_TOOLS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SkillCategoryEnum(String value) {
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
    public static SkillCategoryEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SkillCategoryEnum(value));
    }

    public static SkillCategoryEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SkillCategoryEnum) {
            return this.value.equals(((SkillCategoryEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
