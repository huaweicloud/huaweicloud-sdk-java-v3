package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ResponseGroup
 */
public class ResponseGroup {

    /**
     * 规则类别，内置规则(BUILT_IN)或自建规则(BUILT_SELF)
     */
    public static final class CategoryEnum {

        /**
         * Enum BUILT_IN for value: "BUILT_IN"
         */
        public static final CategoryEnum BUILT_IN = new CategoryEnum("BUILT_IN");

        /**
         * Enum BUILT_SELF for value: "BUILT_SELF"
         */
        public static final CategoryEnum BUILT_SELF = new CategoryEnum("BUILT_SELF");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("BUILT_IN", BUILT_IN);
            map.put("BUILT_SELF", BUILT_SELF);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_allowed")

    private Boolean deleteAllowed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_desc")

    private String groupDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_names")

    private String ruleNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_names")

    private String taskNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    public ResponseGroup withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 规则类别，内置规则(BUILT_IN)或自建规则(BUILT_SELF)
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public ResponseGroup withDeleteAllowed(Boolean deleteAllowed) {
        this.deleteAllowed = deleteAllowed;
        return this;
    }

    /**
     * 是否允许删除
     * @return deleteAllowed
     */
    public Boolean getDeleteAllowed() {
        return deleteAllowed;
    }

    public void setDeleteAllowed(Boolean deleteAllowed) {
        this.deleteAllowed = deleteAllowed;
    }

    public ResponseGroup withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }

    /**
     * 规则组描述
     * @return groupDesc
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public ResponseGroup withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 规则组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ResponseGroup withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则组ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResponseGroup withRuleNames(String ruleNames) {
        this.ruleNames = ruleNames;
        return this;
    }

    /**
     * 规则名称
     * @return ruleNames
     */
    public String getRuleNames() {
        return ruleNames;
    }

    public void setRuleNames(String ruleNames) {
        this.ruleNames = ruleNames;
    }

    public ResponseGroup withTaskNames(String taskNames) {
        this.taskNames = taskNames;
        return this;
    }

    /**
     * 扫描任务名称
     * @return taskNames
     */
    public String getTaskNames() {
        return taskNames;
    }

    public void setTaskNames(String taskNames) {
        this.taskNames = taskNames;
    }

    public ResponseGroup withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * 是否为默认规则组
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseGroup that = (ResponseGroup) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.deleteAllowed, that.deleteAllowed)
            && Objects.equals(this.groupDesc, that.groupDesc) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.id, that.id) && Objects.equals(this.ruleNames, that.ruleNames)
            && Objects.equals(this.taskNames, that.taskNames) && Objects.equals(this.isDefault, that.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, deleteAllowed, groupDesc, groupName, id, ruleNames, taskNames, isDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseGroup {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    deleteAllowed: ").append(toIndentedString(deleteAllowed)).append("\n");
        sb.append("    groupDesc: ").append(toIndentedString(groupDesc)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ruleNames: ").append(toIndentedString(ruleNames)).append("\n");
        sb.append("    taskNames: ").append(toIndentedString(taskNames)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
