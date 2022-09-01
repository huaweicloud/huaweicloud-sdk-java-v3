package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPipelineJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_id")

    @JacksonXmlProperty(localName = "data_store_id")

    private String dataStoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_group_id")

    @JacksonXmlProperty(localName = "data_store_group_id")

    private String dataStoreGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_id")

    @JacksonXmlProperty(localName = "data_source_id")

    private String dataSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_name")

    @JacksonXmlProperty(localName = "pipeline_name")

    private String pipelineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator_class_name")

    @JacksonXmlProperty(localName = "operator_class_name")

    private String operatorClassName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_status")

    @JacksonXmlProperty(localName = "sync_status")

    private Boolean syncStatus;

    public ListPipelineJobsRequest withDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
        return this;
    }

    /**
     * 数据存储Id
     * @return dataStoreId
     */
    public String getDataStoreId() {
        return dataStoreId;
    }

    public void setDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
    }

    public ListPipelineJobsRequest withDataStoreGroupId(String dataStoreGroupId) {
        this.dataStoreGroupId = dataStoreGroupId;
        return this;
    }

    /**
     * 存储组Id
     * @return dataStoreGroupId
     */
    public String getDataStoreGroupId() {
        return dataStoreGroupId;
    }

    public void setDataStoreGroupId(String dataStoreGroupId) {
        this.dataStoreGroupId = dataStoreGroupId;
    }

    public ListPipelineJobsRequest withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * 数据源Id
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public ListPipelineJobsRequest withPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }

    /**
     * 管道名称
     * @return pipelineName
     */
    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    public ListPipelineJobsRequest withOperatorClassName(String operatorClassName) {
        this.operatorClassName = operatorClassName;
        return this;
    }

    /**
     * 包含的管道类名
     * @return operatorClassName
     */
    public String getOperatorClassName() {
        return operatorClassName;
    }

    public void setOperatorClassName(String operatorClassName) {
        this.operatorClassName = operatorClassName;
    }

    public ListPipelineJobsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，offset大于等于0
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListPipelineJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPipelineJobsRequest withSyncStatus(Boolean syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * 立即同步作业状态，默认是false
     * @return syncStatus
     */
    public Boolean getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(Boolean syncStatus) {
        this.syncStatus = syncStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPipelineJobsRequest listPipelineJobsRequest = (ListPipelineJobsRequest) o;
        return Objects.equals(this.dataStoreId, listPipelineJobsRequest.dataStoreId)
            && Objects.equals(this.dataStoreGroupId, listPipelineJobsRequest.dataStoreGroupId)
            && Objects.equals(this.dataSourceId, listPipelineJobsRequest.dataSourceId)
            && Objects.equals(this.pipelineName, listPipelineJobsRequest.pipelineName)
            && Objects.equals(this.operatorClassName, listPipelineJobsRequest.operatorClassName)
            && Objects.equals(this.offset, listPipelineJobsRequest.offset)
            && Objects.equals(this.limit, listPipelineJobsRequest.limit)
            && Objects.equals(this.syncStatus, listPipelineJobsRequest.syncStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataStoreId,
            dataStoreGroupId,
            dataSourceId,
            pipelineName,
            operatorClassName,
            offset,
            limit,
            syncStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelineJobsRequest {\n");
        sb.append("    dataStoreId: ").append(toIndentedString(dataStoreId)).append("\n");
        sb.append("    dataStoreGroupId: ").append(toIndentedString(dataStoreGroupId)).append("\n");
        sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
        sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
        sb.append("    operatorClassName: ").append(toIndentedString(operatorClassName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
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
