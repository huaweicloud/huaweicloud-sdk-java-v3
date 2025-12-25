package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListDirectoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    /**
     * **参数解释**: 目录类型 - TABLE 表 - PIPE 管道 - RETRIEVE_SCRIPT 检索脚本 - ANALYSIS_SCRIPT 分析脚本 - DATA_TRANSFORMATION 数据加工 - ALERT_RULE 告警规则  **约束限制** 不涉及 **取值范围**: - TABLE - PIPE - RETRIEVE_SCRIPT - ANALYSIS_SCRIPT - DATA_TRANSFORMATION - ALERT_RULE  **默认值** 不涉及        
     */
    public static final class CategoryEnum {

        /**
         * Enum TABLE for value: "TABLE"
         */
        public static final CategoryEnum TABLE = new CategoryEnum("TABLE");

        /**
         * Enum PIPE for value: "PIPE"
         */
        public static final CategoryEnum PIPE = new CategoryEnum("PIPE");

        /**
         * Enum RETRIEVE_SCRIPT for value: "RETRIEVE_SCRIPT"
         */
        public static final CategoryEnum RETRIEVE_SCRIPT = new CategoryEnum("RETRIEVE_SCRIPT");

        /**
         * Enum ANALYSIS_SCRIPT for value: "ANALYSIS_SCRIPT"
         */
        public static final CategoryEnum ANALYSIS_SCRIPT = new CategoryEnum("ANALYSIS_SCRIPT");

        /**
         * Enum DATA_TRANSFORMATION for value: "DATA_TRANSFORMATION"
         */
        public static final CategoryEnum DATA_TRANSFORMATION = new CategoryEnum("DATA_TRANSFORMATION");

        /**
         * Enum ALERT_RULE for value: "ALERT_RULE"
         */
        public static final CategoryEnum ALERT_RULE = new CategoryEnum("ALERT_RULE");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("TABLE", TABLE);
            map.put("PIPE", PIPE);
            map.put("RETRIEVE_SCRIPT", RETRIEVE_SCRIPT);
            map.put("ANALYSIS_SCRIPT", ANALYSIS_SCRIPT);
            map.put("DATA_TRANSFORMATION", DATA_TRANSFORMATION);
            map.put("ALERT_RULE", ALERT_RULE);
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

    public ListDirectoriesRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListDirectoriesRequest withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**: 目录类型 - TABLE 表 - PIPE 管道 - RETRIEVE_SCRIPT 检索脚本 - ANALYSIS_SCRIPT 分析脚本 - DATA_TRANSFORMATION 数据加工 - ALERT_RULE 告警规则  **约束限制** 不涉及 **取值范围**: - TABLE - PIPE - RETRIEVE_SCRIPT - ANALYSIS_SCRIPT - DATA_TRANSFORMATION - ALERT_RULE  **默认值** 不涉及        
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
        ListDirectoriesRequest that = (ListDirectoriesRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDirectoriesRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
