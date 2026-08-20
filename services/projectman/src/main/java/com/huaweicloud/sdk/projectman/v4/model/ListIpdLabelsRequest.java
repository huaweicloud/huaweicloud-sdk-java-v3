package com.huaweicloud.sdk.projectman.v4.model;

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
public class ListIpdLabelsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    /**
     * 标签归属的工作项分类，不传该参数时默认查询所有类型下的标签。不推荐使用此参数，建议使用category_types参数。
     */
    public static final class LabelTypeEnum {

        /**
         * Enum FEATURE for value: "feature"
         */
        public static final LabelTypeEnum FEATURE = new LabelTypeEnum("feature");

        /**
         * Enum RAW_REQUIREMENT for value: "raw requirement"
         */
        public static final LabelTypeEnum RAW_REQUIREMENT = new LabelTypeEnum("raw requirement");

        /**
         * Enum REQUIREMENT for value: "requirement"
         */
        public static final LabelTypeEnum REQUIREMENT = new LabelTypeEnum("requirement");

        /**
         * Enum TASK for value: "task"
         */
        public static final LabelTypeEnum TASK = new LabelTypeEnum("task");

        /**
         * Enum BUG for value: "bug"
         */
        public static final LabelTypeEnum BUG = new LabelTypeEnum("bug");

        private static final Map<String, LabelTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LabelTypeEnum> createStaticFields() {
            Map<String, LabelTypeEnum> map = new HashMap<>();
            map.put("feature", FEATURE);
            map.put("raw requirement", RAW_REQUIREMENT);
            map.put("requirement", REQUIREMENT);
            map.put("task", TASK);
            map.put("bug", BUG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LabelTypeEnum(String value) {
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
        public static LabelTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LabelTypeEnum(value));
        }

        public static LabelTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LabelTypeEnum) {
                return this.value.equals(((LabelTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_type")

    private LabelTypeEnum labelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_types")

    private String categoryTypes;

    public ListIpdLabelsRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目32位ID，项目唯一标识。通过查询IPD项目列表获取，响应消息体中的id字段的值就是项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListIpdLabelsRequest withLabelType(LabelTypeEnum labelType) {
        this.labelType = labelType;
        return this;
    }

    /**
     * 标签归属的工作项分类，不传该参数时默认查询所有类型下的标签。不推荐使用此参数，建议使用category_types参数。
     * @return labelType
     */
    public LabelTypeEnum getLabelType() {
        return labelType;
    }

    public void setLabelType(LabelTypeEnum labelType) {
        this.labelType = labelType;
    }

    public ListIpdLabelsRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标签名称
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ListIpdLabelsRequest withCategoryTypes(String categoryTypes) {
        this.categoryTypes = categoryTypes;
        return this;
    }

    /**
     * 工作项类型编码。
     * @return categoryTypes
     */
    public String getCategoryTypes() {
        return categoryTypes;
    }

    public void setCategoryTypes(String categoryTypes) {
        this.categoryTypes = categoryTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIpdLabelsRequest that = (ListIpdLabelsRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.labelType, that.labelType)
            && Objects.equals(this.title, that.title) && Objects.equals(this.categoryTypes, that.categoryTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, labelType, title, categoryTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIpdLabelsRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    categoryTypes: ").append(toIndentedString(categoryTypes)).append("\n");
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
