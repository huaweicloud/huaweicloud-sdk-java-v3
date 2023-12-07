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
 * DataClassificationRuleQueryDTO
 */
public class DataClassificationRuleQueryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    /**
     * 规则类型, CUSTOM, BUILTIN
     */
    public static final class RuleTypeEnum {

        /**
         * Enum CUSTOM for value: "CUSTOM"
         */
        public static final RuleTypeEnum CUSTOM = new RuleTypeEnum("CUSTOM");

        /**
         * Enum BUILTIN for value: "BUILTIN"
         */
        public static final RuleTypeEnum BUILTIN = new RuleTypeEnum("BUILTIN");

        private static final Map<String, RuleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuleTypeEnum> createStaticFields() {
            Map<String, RuleTypeEnum> map = new HashMap<>();
            map.put("CUSTOM", CUSTOM);
            map.put("BUILTIN", BUILTIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuleTypeEnum(String value) {
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
        public static RuleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuleTypeEnum(value));
        }

        public static RuleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RuleTypeEnum) {
                return this.value.equals(((RuleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private RuleTypeEnum ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level")

    private String secrecyLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level_num")

    private Long secrecyLevelNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    /**
     * 规则方式, REGULAR, NONE, DEFAULT
     */
    public static final class MethodEnum {

        /**
         * Enum REGULAR for value: "REGULAR"
         */
        public static final MethodEnum REGULAR = new MethodEnum("REGULAR");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final MethodEnum NONE = new MethodEnum("NONE");

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final MethodEnum DEFAULT = new MethodEnum("DEFAULT");

        private static final Map<String, MethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MethodEnum> createStaticFields() {
            Map<String, MethodEnum> map = new HashMap<>();
            map.put("REGULAR", REGULAR);
            map.put("NONE", NONE);
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
    @JsonProperty(value = "content_expression")

    private String contentExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_expression")

    private String columnExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_expression")

    private String commitExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_by")

    private String updatedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Long updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "builtin_rule_id")

    private String builtinRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private String categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    private String matchType;

    public DataClassificationRuleQueryDTO withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 规则ID
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public DataClassificationRuleQueryDTO withRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 规则类型, CUSTOM, BUILTIN
     * @return ruleType
     */
    public RuleTypeEnum getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
    }

    public DataClassificationRuleQueryDTO withSecrecyLevel(String secrecyLevel) {
        this.secrecyLevel = secrecyLevel;
        return this;
    }

    /**
     * 密级
     * @return secrecyLevel
     */
    public String getSecrecyLevel() {
        return secrecyLevel;
    }

    public void setSecrecyLevel(String secrecyLevel) {
        this.secrecyLevel = secrecyLevel;
    }

    public DataClassificationRuleQueryDTO withSecrecyLevelNum(Long secrecyLevelNum) {
        this.secrecyLevelNum = secrecyLevelNum;
        return this;
    }

    /**
     * 密级层级
     * minimum: 1
     * maximum: 128
     * @return secrecyLevelNum
     */
    public Long getSecrecyLevelNum() {
        return secrecyLevelNum;
    }

    public void setSecrecyLevelNum(Long secrecyLevelNum) {
        this.secrecyLevelNum = secrecyLevelNum;
    }

    public DataClassificationRuleQueryDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataClassificationRuleQueryDTO withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * guid
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public DataClassificationRuleQueryDTO withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 规则是否开启
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public DataClassificationRuleQueryDTO withMethod(MethodEnum method) {
        this.method = method;
        return this;
    }

    /**
     * 规则方式, REGULAR, NONE, DEFAULT
     * @return method
     */
    public MethodEnum getMethod() {
        return method;
    }

    public void setMethod(MethodEnum method) {
        this.method = method;
    }

    public DataClassificationRuleQueryDTO withContentExpression(String contentExpression) {
        this.contentExpression = contentExpression;
        return this;
    }

    /**
     * 内容表达式
     * @return contentExpression
     */
    public String getContentExpression() {
        return contentExpression;
    }

    public void setContentExpression(String contentExpression) {
        this.contentExpression = contentExpression;
    }

    public DataClassificationRuleQueryDTO withColumnExpression(String columnExpression) {
        this.columnExpression = columnExpression;
        return this;
    }

    /**
     * 列表达式
     * @return columnExpression
     */
    public String getColumnExpression() {
        return columnExpression;
    }

    public void setColumnExpression(String columnExpression) {
        this.columnExpression = columnExpression;
    }

    public DataClassificationRuleQueryDTO withCommitExpression(String commitExpression) {
        this.commitExpression = commitExpression;
        return this;
    }

    /**
     * 备注表达式
     * @return commitExpression
     */
    public String getCommitExpression() {
        return commitExpression;
    }

    public void setCommitExpression(String commitExpression) {
        this.commitExpression = commitExpression;
    }

    public DataClassificationRuleQueryDTO withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DataClassificationRuleQueryDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DataClassificationRuleQueryDTO withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 策略创建人
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public DataClassificationRuleQueryDTO withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 策略创建时间
     * minimum: 0
     * maximum: 2147483647
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public DataClassificationRuleQueryDTO withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * 策略更新人
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public DataClassificationRuleQueryDTO withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 策略更新时间
     * minimum: 0
     * maximum: 2147483647
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DataClassificationRuleQueryDTO withBuiltinRuleId(String builtinRuleId) {
        this.builtinRuleId = builtinRuleId;
        return this;
    }

    /**
     * 内置规则ID
     * @return builtinRuleId
     */
    public String getBuiltinRuleId() {
        return builtinRuleId;
    }

    public void setBuiltinRuleId(String builtinRuleId) {
        this.builtinRuleId = builtinRuleId;
    }

    public DataClassificationRuleQueryDTO withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 分类ID
     * @return categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public DataClassificationRuleQueryDTO withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DataClassificationRuleQueryDTO withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * 匹配类型
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataClassificationRuleQueryDTO that = (DataClassificationRuleQueryDTO) obj;
        return Objects.equals(this.uuid, that.uuid) && Objects.equals(this.ruleType, that.ruleType)
            && Objects.equals(this.secrecyLevel, that.secrecyLevel)
            && Objects.equals(this.secrecyLevelNum, that.secrecyLevelNum) && Objects.equals(this.name, that.name)
            && Objects.equals(this.guid, that.guid) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.method, that.method)
            && Objects.equals(this.contentExpression, that.contentExpression)
            && Objects.equals(this.columnExpression, that.columnExpression)
            && Objects.equals(this.commitExpression, that.commitExpression)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedBy, that.updatedBy) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.builtinRuleId, that.builtinRuleId)
            && Objects.equals(this.categoryId, that.categoryId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.matchType, that.matchType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid,
            ruleType,
            secrecyLevel,
            secrecyLevelNum,
            name,
            guid,
            enable,
            method,
            contentExpression,
            columnExpression,
            commitExpression,
            projectId,
            description,
            createdBy,
            createdAt,
            updatedBy,
            updatedAt,
            builtinRuleId,
            categoryId,
            instanceId,
            matchType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataClassificationRuleQueryDTO {\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    secrecyLevel: ").append(toIndentedString(secrecyLevel)).append("\n");
        sb.append("    secrecyLevelNum: ").append(toIndentedString(secrecyLevelNum)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    contentExpression: ").append(toIndentedString(contentExpression)).append("\n");
        sb.append("    columnExpression: ").append(toIndentedString(columnExpression)).append("\n");
        sb.append("    commitExpression: ").append(toIndentedString(commitExpression)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    builtinRuleId: ").append(toIndentedString(builtinRuleId)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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
