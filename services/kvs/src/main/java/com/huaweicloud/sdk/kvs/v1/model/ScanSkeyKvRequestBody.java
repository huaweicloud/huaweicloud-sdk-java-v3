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
 * ScanSkeyKvRequestBody
 */
public class ScanSkeyKvRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")
    @BsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hint_index_name")
    @BsonProperty(value = "hint_index_name")

    private String hintIndexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")
    @BsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_key")
    @BsonProperty(value = "shard_key")

    private Document shardKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_sort_key")
    @BsonProperty(value = "start_sort_key")

    private Document startSortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_sort_key")
    @BsonProperty(value = "end_sort_key")

    private Document endSortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_expression")
    @BsonProperty(value = "filter_expression")

    private ConditionExpression filterExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projection_fields")
    @BsonProperty(value = "projection_fields")

    private List<String> projectionFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projection_blob")
    @BsonProperty(value = "projection_blob")

    private ProjectionBlob projectionBlob;

    public ScanSkeyKvRequestBody withTableName(String tableName) {
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

    public ScanSkeyKvRequestBody withHintIndexName(String hintIndexName) {
        this.hintIndexName = hintIndexName;
        return this;
    }

    /**
     * create_table时指定的索引名。
     * @return hintIndexName
     */
    public String getHintIndexName() {
        return hintIndexName;
    }

    public void setHintIndexName(String hintIndexName) {
        this.hintIndexName = hintIndexName;
    }

    public ScanSkeyKvRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 数据量不超过_1_mb时，返回的文档个数，最大_100_个，默认_1_mb_或者_100_个文档。
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ScanSkeyKvRequestBody withShardKey(Document shardKey) {
        this.shardKey = shardKey;
        return this;
    }

    /**
     * 要遍历的指定分区键下的kv。
     * @return shardKey
     */
    public Document getShardKey() {
        return shardKey;
    }

    public void setShardKey(Document shardKey) {
        this.shardKey = shardKey;
    }

    public ScanSkeyKvRequestBody withStartSortKey(Document startSortKey) {
        this.startSortKey = startSortKey;
        return this;
    }

    /**
     * 起始排序键值，默认空表示从头遍历，左闭。 > 分页返回时，该值使用上次响应返回的cursor_sort_key
     * @return startSortKey
     */
    public Document getStartSortKey() {
        return startSortKey;
    }

    public void setStartSortKey(Document startSortKey) {
        this.startSortKey = startSortKey;
    }

    public ScanSkeyKvRequestBody withEndSortKey(Document endSortKey) {
        this.endSortKey = endSortKey;
        return this;
    }

    /**
     * 终止主键或索引键值，默认空表示直到最后，右开。
     * @return endSortKey
     */
    public Document getEndSortKey() {
        return endSortKey;
    }

    public void setEndSortKey(Document endSortKey) {
        this.endSortKey = endSortKey;
    }

    public ScanSkeyKvRequestBody withFilterExpression(ConditionExpression filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }

    public ScanSkeyKvRequestBody withFilterExpression(Consumer<ConditionExpression> filterExpressionSetter) {
        if (this.filterExpression == null) {
            this.filterExpression = new ConditionExpression();
            filterExpressionSetter.accept(this.filterExpression);
        }

        return this;
    }

    /**
     * Get filterExpression
     * @return filterExpression
     */
    public ConditionExpression getFilterExpression() {
        return filterExpression;
    }

    public void setFilterExpression(ConditionExpression filterExpression) {
        this.filterExpression = filterExpression;
    }

    public ScanSkeyKvRequestBody withProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
        return this;
    }

    public ScanSkeyKvRequestBody addProjectionFieldsItem(String projectionFieldsItem) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        this.projectionFields.add(projectionFieldsItem);
        return this;
    }

    public ScanSkeyKvRequestBody withProjectionFields(Consumer<List<String>> projectionFieldsSetter) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        projectionFieldsSetter.accept(this.projectionFields);
        return this;
    }

    /**
     * 对kv_doc有效，返回哪些字段列表，默认全部。 - 数组元素的字段名或嵌套字段路径用'/'分割，e_name为下标。
     * @return projectionFields
     */
    public List<String> getProjectionFields() {
        return projectionFields;
    }

    public void setProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
    }

    public ScanSkeyKvRequestBody withProjectionBlob(ProjectionBlob projectionBlob) {
        this.projectionBlob = projectionBlob;
        return this;
    }

    public ScanSkeyKvRequestBody withProjectionBlob(Consumer<ProjectionBlob> projectionBlobSetter) {
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
        ScanSkeyKvRequestBody that = (ScanSkeyKvRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.hintIndexName, that.hintIndexName)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.shardKey, that.shardKey)
            && Objects.equals(this.startSortKey, that.startSortKey) && Objects.equals(this.endSortKey, that.endSortKey)
            && Objects.equals(this.filterExpression, that.filterExpression)
            && Objects.equals(this.projectionFields, that.projectionFields)
            && Objects.equals(this.projectionBlob, that.projectionBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName,
            hintIndexName,
            limit,
            shardKey,
            startSortKey,
            endSortKey,
            filterExpression,
            projectionFields,
            projectionBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanSkeyKvRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    hintIndexName: ").append(toIndentedString(hintIndexName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    shardKey: ").append(toIndentedString(shardKey)).append("\n");
        sb.append("    startSortKey: ").append(toIndentedString(startSortKey)).append("\n");
        sb.append("    endSortKey: ").append(toIndentedString(endSortKey)).append("\n");
        sb.append("    filterExpression: ").append(toIndentedString(filterExpression)).append("\n");
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
