package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 应用分类： * &#x60;GAME&#x60; - 游戏 * &#x60;BUSSINESS_INTELLIGENCE&#x60; - 商业智能 * &#x60;SECURE_STORAGE&#x60; - 安全与存储 * &#x60;MULTIMEDIA_AND_CODING&#x60; - 多媒体与编解码 * &#x60;PROJECT_MANAGEMENT&#x60; - 项目管理 * &#x60;PRODUCTIVITY_AND_COLLABORATION&#x60; - 生产力与协作 * &#x60;WEB_ADN_APPLICATION&#x60; - 网页与应用开发 * &#x60;GRAPHIC_DESIGN&#x60; - 图形设计 * &#x60;OTHER&#x60; - 其它
 */
public class AppCategoryEnum {

    /**
     * Enum GAME for value: "GAME"
     */
    public static final AppCategoryEnum GAME = new AppCategoryEnum("GAME");

    /**
     * Enum BUSSINESS_INTELLIGENCE for value: "BUSSINESS_INTELLIGENCE"
     */
    public static final AppCategoryEnum BUSSINESS_INTELLIGENCE = new AppCategoryEnum("BUSSINESS_INTELLIGENCE");

    /**
     * Enum SECURE_STORAGE for value: "SECURE_STORAGE"
     */
    public static final AppCategoryEnum SECURE_STORAGE = new AppCategoryEnum("SECURE_STORAGE");

    /**
     * Enum MULTIMEDIA_AND_CODING for value: "MULTIMEDIA_AND_CODING"
     */
    public static final AppCategoryEnum MULTIMEDIA_AND_CODING = new AppCategoryEnum("MULTIMEDIA_AND_CODING");

    /**
     * Enum PROJECT_MANAGEMENT for value: "PROJECT_MANAGEMENT"
     */
    public static final AppCategoryEnum PROJECT_MANAGEMENT = new AppCategoryEnum("PROJECT_MANAGEMENT");

    /**
     * Enum PRODUCTIVITY_AND_COLLABORATION for value: "PRODUCTIVITY_AND_COLLABORATION"
     */
    public static final AppCategoryEnum PRODUCTIVITY_AND_COLLABORATION =
        new AppCategoryEnum("PRODUCTIVITY_AND_COLLABORATION");

    /**
     * Enum WEB_ADN_APPLICATION for value: "WEB_ADN_APPLICATION"
     */
    public static final AppCategoryEnum WEB_ADN_APPLICATION = new AppCategoryEnum("WEB_ADN_APPLICATION");

    /**
     * Enum GRAPHIC_DESIGN for value: "GRAPHIC_DESIGN"
     */
    public static final AppCategoryEnum GRAPHIC_DESIGN = new AppCategoryEnum("GRAPHIC_DESIGN");

    /**
     * Enum OTHER for value: "OTHER"
     */
    public static final AppCategoryEnum OTHER = new AppCategoryEnum("OTHER");

    private static final Map<String, AppCategoryEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AppCategoryEnum> createStaticFields() {
        Map<String, AppCategoryEnum> map = new HashMap<>();
        map.put("GAME", GAME);
        map.put("BUSSINESS_INTELLIGENCE", BUSSINESS_INTELLIGENCE);
        map.put("SECURE_STORAGE", SECURE_STORAGE);
        map.put("MULTIMEDIA_AND_CODING", MULTIMEDIA_AND_CODING);
        map.put("PROJECT_MANAGEMENT", PROJECT_MANAGEMENT);
        map.put("PRODUCTIVITY_AND_COLLABORATION", PRODUCTIVITY_AND_COLLABORATION);
        map.put("WEB_ADN_APPLICATION", WEB_ADN_APPLICATION);
        map.put("GRAPHIC_DESIGN", GRAPHIC_DESIGN);
        map.put("OTHER", OTHER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AppCategoryEnum(String value) {
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
    public static AppCategoryEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AppCategoryEnum(value));
    }

    public static AppCategoryEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AppCategoryEnum) {
            return this.value.equals(((AppCategoryEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
