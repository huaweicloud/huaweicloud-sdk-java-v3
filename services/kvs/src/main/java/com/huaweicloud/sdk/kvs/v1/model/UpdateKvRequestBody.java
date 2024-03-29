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
 * UpdateKvRequestBody
 */
public class UpdateKvRequestBody {

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
    @JsonProperty(value = "kv_options")
    @BsonProperty(value = "kv_options")

    private KvOptions kvOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_fields")
    @BsonProperty(value = "update_fields")

    private UpdateFields updateFields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projection_fields")
    @BsonProperty(value = "projection_fields")

    private List<String> projectionFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_blob")
    @BsonProperty(value = "update_blob")

    private UpdateBlob updateBlob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projection_blob")
    @BsonProperty(value = "projection_blob")

    private ProjectionBlob projectionBlob;

    public UpdateKvRequestBody withTableName(String tableName) {
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

    public UpdateKvRequestBody withPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * 用户自定义的主键名及值。 > 内容字段：主键字段名和值，组合索引多个元素。
     * @return primaryKey
     */
    public Document getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
    }

    public UpdateKvRequestBody withConditionExpression(ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    public UpdateKvRequestBody withConditionExpression(Consumer<ConditionExpression> conditionExpressionSetter) {
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

    public UpdateKvRequestBody withKvOptions(KvOptions kvOptions) {
        this.kvOptions = kvOptions;
        return this;
    }

    public UpdateKvRequestBody withKvOptions(Consumer<KvOptions> kvOptionsSetter) {
        if (this.kvOptions == null) {
            this.kvOptions = new KvOptions();
            kvOptionsSetter.accept(this.kvOptions);
        }

        return this;
    }

    /**
     * Get kvOptions
     * @return kvOptions
     */
    public KvOptions getKvOptions() {
        return kvOptions;
    }

    public void setKvOptions(KvOptions kvOptions) {
        this.kvOptions = kvOptions;
    }

    public UpdateKvRequestBody withUpdateFields(UpdateFields updateFields) {
        this.updateFields = updateFields;
        return this;
    }

    public UpdateKvRequestBody withUpdateFields(Consumer<UpdateFields> updateFieldsSetter) {
        if (this.updateFields == null) {
            this.updateFields = new UpdateFields();
            updateFieldsSetter.accept(this.updateFields);
        }

        return this;
    }

    /**
     * Get updateFields
     * @return updateFields
     */
    public UpdateFields getUpdateFields() {
        return updateFields;
    }

    public void setUpdateFields(UpdateFields updateFields) {
        this.updateFields = updateFields;
    }

    public UpdateKvRequestBody withProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
        return this;
    }

    public UpdateKvRequestBody addProjectionFieldsItem(String projectionFieldsItem) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        this.projectionFields.add(projectionFieldsItem);
        return this;
    }

    public UpdateKvRequestBody withProjectionFields(Consumer<List<String>> projectionFieldsSetter) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        projectionFieldsSetter.accept(this.projectionFields);
        return this;
    }

    /**
     * 对kv_doc有效，返回哪些字段列表，默认全部。 > 字段名或嵌套字段路径用'/'分割 ，e_name为下标。
     * @return projectionFields
     */
    public List<String> getProjectionFields() {
        return projectionFields;
    }

    public void setProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
    }

    public UpdateKvRequestBody withUpdateBlob(UpdateBlob updateBlob) {
        this.updateBlob = updateBlob;
        return this;
    }

    public UpdateKvRequestBody withUpdateBlob(Consumer<UpdateBlob> updateBlobSetter) {
        if (this.updateBlob == null) {
            this.updateBlob = new UpdateBlob();
            updateBlobSetter.accept(this.updateBlob);
        }

        return this;
    }

    /**
     * Get updateBlob
     * @return updateBlob
     */
    public UpdateBlob getUpdateBlob() {
        return updateBlob;
    }

    public void setUpdateBlob(UpdateBlob updateBlob) {
        this.updateBlob = updateBlob;
    }

    public UpdateKvRequestBody withProjectionBlob(ProjectionBlob projectionBlob) {
        this.projectionBlob = projectionBlob;
        return this;
    }

    public UpdateKvRequestBody withProjectionBlob(Consumer<ProjectionBlob> projectionBlobSetter) {
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
        UpdateKvRequestBody that = (UpdateKvRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.primaryKey, that.primaryKey)
            && Objects.equals(this.conditionExpression, that.conditionExpression)
            && Objects.equals(this.kvOptions, that.kvOptions) && Objects.equals(this.updateFields, that.updateFields)
            && Objects.equals(this.projectionFields, that.projectionFields)
            && Objects.equals(this.updateBlob, that.updateBlob)
            && Objects.equals(this.projectionBlob, that.projectionBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName,
            primaryKey,
            conditionExpression,
            kvOptions,
            updateFields,
            projectionFields,
            updateBlob,
            projectionBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKvRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    kvOptions: ").append(toIndentedString(kvOptions)).append("\n");
        sb.append("    updateFields: ").append(toIndentedString(updateFields)).append("\n");
        sb.append("    projectionFields: ").append(toIndentedString(projectionFields)).append("\n");
        sb.append("    updateBlob: ").append(toIndentedString(updateBlob)).append("\n");
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
