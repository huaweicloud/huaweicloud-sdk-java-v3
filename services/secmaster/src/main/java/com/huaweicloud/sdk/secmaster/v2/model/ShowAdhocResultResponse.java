package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAdhocResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch")

    private Object batch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private List<AdhocQueryAnalysisField> schema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datarows")

    private List<List<Object>> datarows = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datarows_upsert")

    private List<List<DataRow>> datarowsUpsert = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next")

    private Integer next;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tips")

    private ShowAdhocQueryResultResponseBodyTips tips;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public ShowAdhocResultResponse withBatch(Object batch) {
        this.batch = batch;
        return this;
    }

    /**
     * 获取数据的批次，为0则为第一次查询
     * @return batch
     */
    public Object getBatch() {
        return batch;
    }

    public void setBatch(Object batch) {
        this.batch = batch;
    }

    public ShowAdhocResultResponse withSchema(List<AdhocQueryAnalysisField> schema) {
        this.schema = schema;
        return this;
    }

    public ShowAdhocResultResponse addSchemaItem(AdhocQueryAnalysisField schemaItem) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        this.schema.add(schemaItem);
        return this;
    }

    public ShowAdhocResultResponse withSchema(Consumer<List<AdhocQueryAnalysisField>> schemaSetter) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        schemaSetter.accept(this.schema);
        return this;
    }

    /**
     * 统计分析结果字段类型
     * @return schema
     */
    public List<AdhocQueryAnalysisField> getSchema() {
        return schema;
    }

    public void setSchema(List<AdhocQueryAnalysisField> schema) {
        this.schema = schema;
    }

    public ShowAdhocResultResponse withDatarows(List<List<Object>> datarows) {
        this.datarows = datarows;
        return this;
    }

    public ShowAdhocResultResponse addDatarowsItem(List<Object> datarowsItem) {
        if (this.datarows == null) {
            this.datarows = new ArrayList<>();
        }
        this.datarows.add(datarowsItem);
        return this;
    }

    public ShowAdhocResultResponse withDatarows(Consumer<List<List<Object>>> datarowsSetter) {
        if (this.datarows == null) {
            this.datarows = new ArrayList<>();
        }
        datarowsSetter.accept(this.datarows);
        return this;
    }

    /**
     * 统计分析结果数据
     * @return datarows
     */
    public List<List<Object>> getDatarows() {
        return datarows;
    }

    public void setDatarows(List<List<Object>> datarows) {
        this.datarows = datarows;
    }

    public ShowAdhocResultResponse withDatarowsUpsert(List<List<DataRow>> datarowsUpsert) {
        this.datarowsUpsert = datarowsUpsert;
        return this;
    }

    public ShowAdhocResultResponse addDatarowsUpsertItem(List<DataRow> datarowsUpsertItem) {
        if (this.datarowsUpsert == null) {
            this.datarowsUpsert = new ArrayList<>();
        }
        this.datarowsUpsert.add(datarowsUpsertItem);
        return this;
    }

    public ShowAdhocResultResponse withDatarowsUpsert(Consumer<List<List<DataRow>>> datarowsUpsertSetter) {
        if (this.datarowsUpsert == null) {
            this.datarowsUpsert = new ArrayList<>();
        }
        datarowsUpsertSetter.accept(this.datarowsUpsert);
        return this;
    }

    /**
     * 统计分析结果数据
     * @return datarowsUpsert
     */
    public List<List<DataRow>> getDatarowsUpsert() {
        return datarowsUpsert;
    }

    public void setDatarowsUpsert(List<List<DataRow>> datarowsUpsert) {
        this.datarowsUpsert = datarowsUpsert;
    }

    public ShowAdhocResultResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 统计分析结果总数
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowAdhocResultResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 返回的统计分析结果条数
     * minimum: 0
     * maximum: 500
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ShowAdhocResultResponse withNext(Integer next) {
        this.next = next;
        return this;
    }

    /**
     * 是否有下一批数据
     * minimum: 0
     * maximum: 500
     * @return next
     */
    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    public ShowAdhocResultResponse withTips(ShowAdhocQueryResultResponseBodyTips tips) {
        this.tips = tips;
        return this;
    }

    public ShowAdhocResultResponse withTips(Consumer<ShowAdhocQueryResultResponseBodyTips> tipsSetter) {
        if (this.tips == null) {
            this.tips = new ShowAdhocQueryResultResponseBodyTips();
            tipsSetter.accept(this.tips);
        }

        return this;
    }

    /**
     * Get tips
     * @return tips
     */
    public ShowAdhocQueryResultResponseBodyTips getTips() {
        return tips;
    }

    public void setTips(ShowAdhocQueryResultResponseBodyTips tips) {
        this.tips = tips;
    }

    public ShowAdhocResultResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * UUID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAdhocResultResponse that = (ShowAdhocResultResponse) obj;
        return Objects.equals(this.batch, that.batch) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.datarows, that.datarows) && Objects.equals(this.datarowsUpsert, that.datarowsUpsert)
            && Objects.equals(this.total, that.total) && Objects.equals(this.size, that.size)
            && Objects.equals(this.next, that.next) && Objects.equals(this.tips, that.tips)
            && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batch, schema, datarows, datarowsUpsert, total, size, next, tips, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAdhocResultResponse {\n");
        sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    datarows: ").append(toIndentedString(datarows)).append("\n");
        sb.append("    datarowsUpsert: ").append(toIndentedString(datarowsUpsert)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    next: ").append(toIndentedString(next)).append("\n");
        sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
