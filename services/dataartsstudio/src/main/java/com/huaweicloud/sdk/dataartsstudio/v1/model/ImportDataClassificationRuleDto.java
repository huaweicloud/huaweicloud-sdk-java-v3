package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 导入成功的识别规则。
 */
public class ImportDataClassificationRuleDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    /**
     * 识别规则类型 * BUILTIN 内置 * CUSTOM 自定义
     */
    public static final class ClassificationTypeEnum {

        /**
         * Enum BUILTIN for value: "BUILTIN"
         */
        public static final ClassificationTypeEnum BUILTIN = new ClassificationTypeEnum("BUILTIN");

        /**
         * Enum CUSTOM for value: "CUSTOM"
         */
        public static final ClassificationTypeEnum CUSTOM = new ClassificationTypeEnum("CUSTOM");

        private static final Map<String, ClassificationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClassificationTypeEnum> createStaticFields() {
            Map<String, ClassificationTypeEnum> map = new HashMap<>();
            map.put("BUILTIN", BUILTIN);
            map.put("CUSTOM", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClassificationTypeEnum(String value) {
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
        public static ClassificationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClassificationTypeEnum(value));
        }

        public static ClassificationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClassificationTypeEnum) {
                return this.value.equals(((ClassificationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification_type")

    private ClassificationTypeEnum classificationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level")

    private String secrecyLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    /**
     * 识别规则类型 * NONE 无 * REGULAR 正则表达式 * DEFAULT 默认
     */
    public static final class MethodEnum {

        /**
         * Enum NONE for value: "NONE"
         */
        public static final MethodEnum NONE = new MethodEnum("NONE");

        /**
         * Enum REGULAR for value: "REGULAR"
         */
        public static final MethodEnum REGULAR = new MethodEnum("REGULAR");

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final MethodEnum DEFAULT = new MethodEnum("DEFAULT");

        private static final Map<String, MethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MethodEnum> createStaticFields() {
            Map<String, MethodEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("REGULAR", REGULAR);
            map.put("DEFAULT", DEFAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MethodEnum(String value) {
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
        public static MethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MethodEnum(value));
        }

        public static MethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MethodEnum) {
                return this.value.equals(((MethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private MethodEnum method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private String categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "builtin_rule_id")

    private String builtinRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_by")

    private String updatedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    public ImportDataClassificationRuleDto withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 数据识别规则id。
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ImportDataClassificationRuleDto withClassificationType(ClassificationTypeEnum classificationType) {
        this.classificationType = classificationType;
        return this;
    }

    /**
     * 识别规则类型 * BUILTIN 内置 * CUSTOM 自定义
     * @return classificationType
     */
    public ClassificationTypeEnum getClassificationType() {
        return classificationType;
    }

    public void setClassificationType(ClassificationTypeEnum classificationType) {
        this.classificationType = classificationType;
    }

    public ImportDataClassificationRuleDto withSecrecyLevel(String secrecyLevel) {
        this.secrecyLevel = secrecyLevel;
        return this;
    }

    /**
     * 数据密级id。
     * @return secrecyLevel
     */
    public String getSecrecyLevel() {
        return secrecyLevel;
    }

    public void setSecrecyLevel(String secrecyLevel) {
        this.secrecyLevel = secrecyLevel;
    }

    public ImportDataClassificationRuleDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据识别规则名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImportDataClassificationRuleDto withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否启用。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ImportDataClassificationRuleDto withMethod(MethodEnum method) {
        this.method = method;
        return this;
    }

    /**
     * 识别规则类型 * NONE 无 * REGULAR 正则表达式 * DEFAULT 默认
     * @return method
     */
    public MethodEnum getMethod() {
        return method;
    }

    public void setMethod(MethodEnum method) {
        this.method = method;
    }

    public ImportDataClassificationRuleDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImportDataClassificationRuleDto withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 数据分类id。
     * @return categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public ImportDataClassificationRuleDto withBuiltinRuleId(String builtinRuleId) {
        this.builtinRuleId = builtinRuleId;
        return this;
    }

    /**
     * 预置规则id。
     * @return builtinRuleId
     */
    public String getBuiltinRuleId() {
        return builtinRuleId;
    }

    public void setBuiltinRuleId(String builtinRuleId) {
        this.builtinRuleId = builtinRuleId;
    }

    public ImportDataClassificationRuleDto withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * 更新人。
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public ImportDataClassificationRuleDto withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间。
     * minimum: 0
     * maximum: 4070880010000
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public ImportDataClassificationRuleDto withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建人。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ImportDataClassificationRuleDto withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间。
     * minimum: 0
     * maximum: 4070880010000
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportDataClassificationRuleDto that = (ImportDataClassificationRuleDto) obj;
        return Objects.equals(this.uuid, that.uuid) && Objects.equals(this.classificationType, that.classificationType)
            && Objects.equals(this.secrecyLevel, that.secrecyLevel) && Objects.equals(this.name, that.name)
            && Objects.equals(this.enable, that.enable) && Objects.equals(this.method, that.method)
            && Objects.equals(this.description, that.description) && Objects.equals(this.categoryId, that.categoryId)
            && Objects.equals(this.builtinRuleId, that.builtinRuleId) && Objects.equals(this.updatedBy, that.updatedBy)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.createAt, that.createAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid,
            classificationType,
            secrecyLevel,
            name,
            enable,
            method,
            description,
            categoryId,
            builtinRuleId,
            updatedBy,
            updateAt,
            createdBy,
            createAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportDataClassificationRuleDto {\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    classificationType: ").append(toIndentedString(classificationType)).append("\n");
        sb.append("    secrecyLevel: ").append(toIndentedString(secrecyLevel)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    builtinRuleId: ").append(toIndentedString(builtinRuleId)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
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
