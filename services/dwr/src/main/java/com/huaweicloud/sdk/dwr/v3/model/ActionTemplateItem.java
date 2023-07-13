package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ActionTemplateItem
 */
public class ActionTemplateItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 第三方算子模板的分类。默认分类为FileProcess,MediaProcess,ImageProcess,ContentReview,NotificationProcess,VoiceInteraction
     */
    public static final class CategoryEnum {

        /**
         * Enum FILEPROCESS for value: "FileProcess"
         */
        public static final CategoryEnum FILEPROCESS = new CategoryEnum("FileProcess");

        /**
         * Enum MEDIAPROCESS for value: "MediaProcess"
         */
        public static final CategoryEnum MEDIAPROCESS = new CategoryEnum("MediaProcess");

        /**
         * Enum IMAGEPROCESS for value: "ImageProcess"
         */
        public static final CategoryEnum IMAGEPROCESS = new CategoryEnum("ImageProcess");

        /**
         * Enum CONTENTREVIEW for value: "ContentReview"
         */
        public static final CategoryEnum CONTENTREVIEW = new CategoryEnum("ContentReview");

        /**
         * Enum NOTIFICATIONPROCESS for value: "NotificationProcess"
         */
        public static final CategoryEnum NOTIFICATIONPROCESS = new CategoryEnum("NotificationProcess");

        /**
         * Enum VOICEINTERACTION for value: "VoiceInteraction"
         */
        public static final CategoryEnum VOICEINTERACTION = new CategoryEnum("VoiceInteraction");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("FileProcess", FILEPROCESS);
            map.put("MediaProcess", MEDIAPROCESS);
            map.put("ImageProcess", IMAGEPROCESS);
            map.put("ContentReview", CONTENTREVIEW);
            map.put("NotificationProcess", NOTIFICATIONPROCESS);
            map.put("VoiceInteraction", VOICEINTERACTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    public ActionTemplateItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionTemplateItem withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 第三方算子模板的分类。默认分类为FileProcess,MediaProcess,ImageProcess,ContentReview,NotificationProcess,VoiceInteraction
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionTemplateItem that = (ActionTemplateItem) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionTemplateItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
