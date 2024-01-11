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
 * GetKvRequestBody
 */
public class GetKvRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")
    @BsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key")
    @BsonProperty(value = "primary_key")

    private Document primaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projection_fields")
    @BsonProperty(value = "projection_fields")

    private List<String> projectionFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projection_blob")
    @BsonProperty(value = "projection_blob")

    private ProjectionBlob projectionBlob;

    public GetKvRequestBody withTableName(String tableName) {
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

    public GetKvRequestBody withPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * 用户自定义的主键名及值。
     * @return primaryKey
     */
    public Document getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
    }

    public GetKvRequestBody withProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
        return this;
    }

    public GetKvRequestBody addProjectionFieldsItem(String projectionFieldsItem) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        this.projectionFields.add(projectionFieldsItem);
        return this;
    }

    public GetKvRequestBody withProjectionFields(Consumer<List<String>> projectionFieldsSetter) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        projectionFieldsSetter.accept(this.projectionFields);
        return this;
    }

    /**
     * 对kv_doc有效，返回哪些字段列表，默认全部。 > 字段名或嵌套字段路径用'/'分割。
     * @return projectionFields
     */
    public List<String> getProjectionFields() {
        return projectionFields;
    }

    public void setProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
    }

    public GetKvRequestBody withProjectionBlob(ProjectionBlob projectionBlob) {
        this.projectionBlob = projectionBlob;
        return this;
    }

    public GetKvRequestBody withProjectionBlob(Consumer<ProjectionBlob> projectionBlobSetter) {
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
        GetKvRequestBody that = (GetKvRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.primaryKey, that.primaryKey)
            && Objects.equals(this.projectionFields, that.projectionFields)
            && Objects.equals(this.projectionBlob, that.projectionBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, primaryKey, projectionFields, projectionBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetKvRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
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
