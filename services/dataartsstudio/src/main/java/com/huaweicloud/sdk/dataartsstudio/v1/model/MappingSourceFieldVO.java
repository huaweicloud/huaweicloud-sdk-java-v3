package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MappingSourceFieldVO
 */
public class MappingSourceFieldVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_field_id")

    private String targetFieldId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_field_name")

    private String targetFieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_ids")

    private String fieldIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform_expression")

    private String transformExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_names")

    private List<String> fieldNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changed")

    private Boolean changed;

    public MappingSourceFieldVO withTargetFieldId(String targetFieldId) {
        this.targetFieldId = targetFieldId;
        return this;
    }

    /**
     * 目标字段ID，当前表的某个字段，ID字符串。
     * @return targetFieldId
     */
    public String getTargetFieldId() {
        return targetFieldId;
    }

    public void setTargetFieldId(String targetFieldId) {
        this.targetFieldId = targetFieldId;
    }

    public MappingSourceFieldVO withTargetFieldName(String targetFieldName) {
        this.targetFieldName = targetFieldName;
        return this;
    }

    /**
     * 目标字段编码。
     * @return targetFieldName
     */
    public String getTargetFieldName() {
        return targetFieldName;
    }

    public void setTargetFieldName(String targetFieldName) {
        this.targetFieldName = targetFieldName;
    }

    public MappingSourceFieldVO withFieldIds(String fieldIds) {
        this.fieldIds = fieldIds;
        return this;
    }

    /**
     * 来源字段ID，多个ID以逗号分隔。
     * @return fieldIds
     */
    public String getFieldIds() {
        return fieldIds;
    }

    public void setFieldIds(String fieldIds) {
        this.fieldIds = fieldIds;
    }

    public MappingSourceFieldVO withTransformExpression(String transformExpression) {
        this.transformExpression = transformExpression;
        return this;
    }

    /**
     * 转换表达式。
     * @return transformExpression
     */
    public String getTransformExpression() {
        return transformExpression;
    }

    public void setTransformExpression(String transformExpression) {
        this.transformExpression = transformExpression;
    }

    public MappingSourceFieldVO withFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
        return this;
    }

    public MappingSourceFieldVO addFieldNamesItem(String fieldNamesItem) {
        if (this.fieldNames == null) {
            this.fieldNames = new ArrayList<>();
        }
        this.fieldNames.add(fieldNamesItem);
        return this;
    }

    public MappingSourceFieldVO withFieldNames(Consumer<List<String>> fieldNamesSetter) {
        if (this.fieldNames == null) {
            this.fieldNames = new ArrayList<>();
        }
        fieldNamesSetter.accept(this.fieldNames);
        return this;
    }

    /**
     * 来源字段名称列表。
     * @return fieldNames
     */
    public List<String> getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    public MappingSourceFieldVO withChanged(Boolean changed) {
        this.changed = changed;
        return this;
    }

    /**
     * 字段是否发生变化。
     * @return changed
     */
    public Boolean getChanged() {
        return changed;
    }

    public void setChanged(Boolean changed) {
        this.changed = changed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MappingSourceFieldVO that = (MappingSourceFieldVO) obj;
        return Objects.equals(this.targetFieldId, that.targetFieldId)
            && Objects.equals(this.targetFieldName, that.targetFieldName)
            && Objects.equals(this.fieldIds, that.fieldIds)
            && Objects.equals(this.transformExpression, that.transformExpression)
            && Objects.equals(this.fieldNames, that.fieldNames) && Objects.equals(this.changed, that.changed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetFieldId, targetFieldName, fieldIds, transformExpression, fieldNames, changed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MappingSourceFieldVO {\n");
        sb.append("    targetFieldId: ").append(toIndentedString(targetFieldId)).append("\n");
        sb.append("    targetFieldName: ").append(toIndentedString(targetFieldName)).append("\n");
        sb.append("    fieldIds: ").append(toIndentedString(fieldIds)).append("\n");
        sb.append("    transformExpression: ").append(toIndentedString(transformExpression)).append("\n");
        sb.append("    fieldNames: ").append(toIndentedString(fieldNames)).append("\n");
        sb.append("    changed: ").append(toIndentedString(changed)).append("\n");
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
