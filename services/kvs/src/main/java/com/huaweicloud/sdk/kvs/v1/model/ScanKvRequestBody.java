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
 * ScanKvRequestBody
 */
public class ScanKvRequestBody {

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
    @JsonProperty(value = "start_key")
    @BsonProperty(value = "start_key")

    private Document startKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_key")
    @BsonProperty(value = "end_key")

    private Document endKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_expression")
    @BsonProperty(value = "filter_expression")

    private ConditionExpression filterExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projection_fields")
    @BsonProperty(value = "projection_fields")

    private List<String> projectionFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_segments_count")
    @BsonProperty(value = "sample_segments_count")

    private Integer sampleSegmentsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_count_only")
    @BsonProperty(value = "return_count_only")

    private Boolean returnCountOnly;

    public ScanKvRequestBody withTableName(String tableName) {
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

    public ScanKvRequestBody withHintIndexName(String hintIndexName) {
        this.hintIndexName = hintIndexName;
        return this;
    }

    /**
     * create_table时指定的索引名，默认空表示主索引。 - 长度：[3, 63] - 取值字符限制：[a-z0-9_-]+
     * @return hintIndexName
     */
    public String getHintIndexName() {
        return hintIndexName;
    }

    public void setHintIndexName(String hintIndexName) {
        this.hintIndexName = hintIndexName;
    }

    public ScanKvRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 数据量不超过1MB时，返回的文档个数，最大100个，默认1MB或者100个文档。
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ScanKvRequestBody withStartKey(Document startKey) {
        this.startKey = startKey;
        return this;
    }

    /**
     * 起始主键或索引键值。 - 默认空，表示从头遍历，左闭。 > 分页返回时，该值使用上次响应返回的cursor_key。
     * @return startKey
     */
    public Document getStartKey() {
        return startKey;
    }

    public void setStartKey(Document startKey) {
        this.startKey = startKey;
    }

    public ScanKvRequestBody withEndKey(Document endKey) {
        this.endKey = endKey;
        return this;
    }

    /**
     * 终止主键或索引键值。 - 默认空，表示直到最后，右开。
     * @return endKey
     */
    public Document getEndKey() {
        return endKey;
    }

    public void setEndKey(Document endKey) {
        this.endKey = endKey;
    }

    public ScanKvRequestBody withFilterExpression(ConditionExpression filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }

    public ScanKvRequestBody withFilterExpression(Consumer<ConditionExpression> filterExpressionSetter) {
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

    public ScanKvRequestBody withProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
        return this;
    }

    public ScanKvRequestBody addProjectionFieldsItem(String projectionFieldsItem) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        this.projectionFields.add(projectionFieldsItem);
        return this;
    }

    public ScanKvRequestBody withProjectionFields(Consumer<List<String>> projectionFieldsSetter) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        projectionFieldsSetter.accept(this.projectionFields);
        return this;
    }

    /**
     * 对kv_doc有效，返回指定字段列表，默认全部。
     * @return projectionFields
     */
    public List<String> getProjectionFields() {
        return projectionFields;
    }

    public void setProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
    }

    public ScanKvRequestBody withSampleSegmentsCount(Integer sampleSegmentsCount) {
        this.sampleSegmentsCount = sampleSegmentsCount;
        return this;
    }

    /**
     * 对表进行采样，尽最大努力保证返回的段列表均分整张表。举例：sample_segments_count=4，返回的段列表[MinKey, KV1)、[KV1,KV2)、[KV2,KV3)和[KV3,MaxKey)。用户可以使用scan-kv对这四个分区执行并发扫描，提高遍历效率。 - 范围: [1, 10000]。默认值：不执行采样。 - sample_segments_count仅能和table_name、start_key和end_key字段配合使用。Range分区模式下支持全表采样和范围采样；Hash分区模式仅支持全表扫描。 - 仅支持对Primary key进行采样，不支持本地/全局二级索引。 - 返回的段列表仅包含主键，不包含键值；且段列表是编码后的数据 ，不可修改。
     * minimum: 1
     * maximum: 10000
     * @return sampleSegmentsCount
     */
    public Integer getSampleSegmentsCount() {
        return sampleSegmentsCount;
    }

    public void setSampleSegmentsCount(Integer sampleSegmentsCount) {
        this.sampleSegmentsCount = sampleSegmentsCount;
    }

    public ScanKvRequestBody withReturnCountOnly(Boolean returnCountOnly) {
        this.returnCountOnly = returnCountOnly;
        return this;
    }

    /**
     * 返回查询条件对应的KV总数. - 当KV总数小于limit条件时，返回KV查询结果和KV总数。 - 当KV总数多于limit条件时，只返回KV总数。
     * @return returnCountOnly
     */
    public Boolean getReturnCountOnly() {
        return returnCountOnly;
    }

    public void setReturnCountOnly(Boolean returnCountOnly) {
        this.returnCountOnly = returnCountOnly;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScanKvRequestBody that = (ScanKvRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.hintIndexName, that.hintIndexName)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.startKey, that.startKey)
            && Objects.equals(this.endKey, that.endKey) && Objects.equals(this.filterExpression, that.filterExpression)
            && Objects.equals(this.projectionFields, that.projectionFields)
            && Objects.equals(this.sampleSegmentsCount, that.sampleSegmentsCount)
            && Objects.equals(this.returnCountOnly, that.returnCountOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName,
            hintIndexName,
            limit,
            startKey,
            endKey,
            filterExpression,
            projectionFields,
            sampleSegmentsCount,
            returnCountOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanKvRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    hintIndexName: ").append(toIndentedString(hintIndexName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    startKey: ").append(toIndentedString(startKey)).append("\n");
        sb.append("    endKey: ").append(toIndentedString(endKey)).append("\n");
        sb.append("    filterExpression: ").append(toIndentedString(filterExpression)).append("\n");
        sb.append("    projectionFields: ").append(toIndentedString(projectionFields)).append("\n");
        sb.append("    sampleSegmentsCount: ").append(toIndentedString(sampleSegmentsCount)).append("\n");
        sb.append("    returnCountOnly: ").append(toIndentedString(returnCountOnly)).append("\n");
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
