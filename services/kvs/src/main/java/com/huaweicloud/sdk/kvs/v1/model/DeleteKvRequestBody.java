package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteKvRequestBody
 */
public class DeleteKvRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")
    @BsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key")
    @BsonProperty(value = "primary_key")

    private Document primaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression")
    @BsonProperty(value = "condition_expression")

    private ConditionExpression conditionExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projection_fields")
    @BsonProperty(value = "projection_fields")

    private List<String> projectionFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projection_blob")
    @BsonProperty(value = "projection_blob")

    private ProjectionBlob projectionBlob;

    public DeleteKvRequestBody withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名，仓内唯一。 - 长度：[3, 63] - 取值字符限制：[a-z0-9_-]+
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DeleteKvRequestBody withPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * 用户自定义的主键名及值。 > 内容字段为主键字段名和值，组合索引多个元素。
     * @return primaryKey
     */
    public Document getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
    }

    public DeleteKvRequestBody withConditionExpression(ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    public DeleteKvRequestBody withConditionExpression(Consumer<ConditionExpression> conditionExpressionSetter) {
        if (this.conditionExpression == null) {
            this.conditionExpression = new ConditionExpression();
            conditionExpressionSetter.accept(this.conditionExpression);
        }

        return this;
    }

    /**
     * Get conditionExpression
     * @return conditionExpression
     */
    public ConditionExpression getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public DeleteKvRequestBody withProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
        return this;
    }

    public DeleteKvRequestBody addProjectionFieldsItem(String projectionFieldsItem) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        this.projectionFields.add(projectionFieldsItem);
        return this;
    }

    public DeleteKvRequestBody withProjectionFields(Consumer<List<String>> projectionFieldsSetter) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        projectionFieldsSetter.accept(this.projectionFields);
        return this;
    }

    /**
     * 对kv_doc有效，返回哪些字段列表，默认全部。
     * @return projectionFields
     */
    public List<String> getProjectionFields() {
        return projectionFields;
    }

    public void setProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
    }

    public DeleteKvRequestBody withProjectionBlob(ProjectionBlob projectionBlob) {
        this.projectionBlob = projectionBlob;
        return this;
    }

    public DeleteKvRequestBody withProjectionBlob(Consumer<ProjectionBlob> projectionBlobSetter) {
        if (this.projectionBlob == null) {
            this.projectionBlob = new ProjectionBlob();
            projectionBlobSetter.accept(this.projectionBlob);
        }

        return this;
    }

    /**
     * Get projectionBlob
     * @return projectionBlob
     */
    public ProjectionBlob getProjectionBlob() {
        return projectionBlob;
    }

    public void setProjectionBlob(ProjectionBlob projectionBlob) {
        this.projectionBlob = projectionBlob;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteKvRequestBody that = (DeleteKvRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.primaryKey, that.primaryKey)
            && Objects.equals(this.conditionExpression, that.conditionExpression)
            && Objects.equals(this.projectionFields, that.projectionFields)
            && Objects.equals(this.projectionBlob, that.projectionBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, primaryKey, conditionExpression, projectionFields, projectionBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteKvRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    projectionFields: ").append(toIndentedString(projectionFields)).append("\n");
        sb.append("    projectionBlob: ").append(toIndentedString(projectionBlob)).append("\n");
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
