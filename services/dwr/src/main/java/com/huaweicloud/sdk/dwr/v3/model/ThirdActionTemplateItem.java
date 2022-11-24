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
 * ThirdActionTemplateItem
 */
public class ThirdActionTemplateItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 算子分类。默认分类为FileProcess,MediaProcess,ImageProcess,ContentReview,NotificationProcess,VoiceInteraction
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
            CategoryEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CategoryEnum(value);
            }
            return result;
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CategoryEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_status")

    private PublicTemplateRegisterType registerStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_name")

    private String providerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modify_time")

    private String lastModifyTime;

    public ThirdActionTemplateItem withName(String name) {
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

    public ThirdActionTemplateItem withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 算子分类。默认分类为FileProcess,MediaProcess,ImageProcess,ContentReview,NotificationProcess,VoiceInteraction
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public ThirdActionTemplateItem withRegisterStatus(PublicTemplateRegisterType registerStatus) {
        this.registerStatus = registerStatus;
        return this;
    }

    /**
     * Get registerStatus
     * @return registerStatus
     */
    public PublicTemplateRegisterType getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(PublicTemplateRegisterType registerStatus) {
        this.registerStatus = registerStatus;
    }

    public ThirdActionTemplateItem withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * 算子提供方
     * @return providerName
     */
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public ThirdActionTemplateItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 算子描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ThirdActionTemplateItem withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 算子创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ThirdActionTemplateItem withLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }

    /**
     * 最后修改时间
     * @return lastModifyTime
     */
    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThirdActionTemplateItem thirdActionTemplateItem = (ThirdActionTemplateItem) o;
        return Objects.equals(this.name, thirdActionTemplateItem.name)
            && Objects.equals(this.category, thirdActionTemplateItem.category)
            && Objects.equals(this.registerStatus, thirdActionTemplateItem.registerStatus)
            && Objects.equals(this.providerName, thirdActionTemplateItem.providerName)
            && Objects.equals(this.description, thirdActionTemplateItem.description)
            && Objects.equals(this.createTime, thirdActionTemplateItem.createTime)
            && Objects.equals(this.lastModifyTime, thirdActionTemplateItem.lastModifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, registerStatus, providerName, description, createTime, lastModifyTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThirdActionTemplateItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    registerStatus: ").append(toIndentedString(registerStatus)).append("\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastModifyTime: ").append(toIndentedString(lastModifyTime)).append("\n");
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
