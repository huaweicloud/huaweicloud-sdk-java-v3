package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuleGroupRequest
 */
public class RuleGroupRequest {

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
    @JsonProperty(value = "default_status")

    private Boolean defaultStatus;

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
    @JsonProperty(value = "rule_ids")

    private List<String> ruleIds = null;

    public RuleGroupRequest withCategory(CategoryEnum category) {
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

    public RuleGroupRequest withDefaultStatus(Boolean defaultStatus) {
        this.defaultStatus = defaultStatus;
        return this;
    }

    /**
     * 是否默认规则组
     * @return defaultStatus
     */
    public Boolean getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Boolean defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public RuleGroupRequest withGroupDesc(String groupDesc) {
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

    public RuleGroupRequest withGroupName(String groupName) {
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

    public RuleGroupRequest withId(String id) {
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

    public RuleGroupRequest withRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    public RuleGroupRequest addRuleIdsItem(String ruleIdsItem) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        this.ruleIds.add(ruleIdsItem);
        return this;
    }

    public RuleGroupRequest withRuleIds(Consumer<List<String>> ruleIdsSetter) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        ruleIdsSetter.accept(this.ruleIds);
        return this;
    }

    /**
     * 包含的规则ID列表
     * @return ruleIds
     */
    public List<String> getRuleIds() {
        return ruleIds;
    }

    public void setRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleGroupRequest ruleGroupRequest = (RuleGroupRequest) o;
        return Objects.equals(this.category, ruleGroupRequest.category)
            && Objects.equals(this.defaultStatus, ruleGroupRequest.defaultStatus)
            && Objects.equals(this.groupDesc, ruleGroupRequest.groupDesc)
            && Objects.equals(this.groupName, ruleGroupRequest.groupName)
            && Objects.equals(this.id, ruleGroupRequest.id) && Objects.equals(this.ruleIds, ruleGroupRequest.ruleIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, defaultStatus, groupDesc, groupName, id, ruleIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleGroupRequest {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    defaultStatus: ").append(toIndentedString(defaultStatus)).append("\n");
        sb.append("    groupDesc: ").append(toIndentedString(groupDesc)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
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
