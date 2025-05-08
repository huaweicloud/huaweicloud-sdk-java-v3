package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListExecutionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_name")

    private String documentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_id")

    private String documentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_child_executions")

    private Boolean excludeChildExecutions;

    public ListExecutionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页参数：每页返回记录个数限制 不传默认第一页查10个
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListExecutionsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页参数：从offset指定的下一条数据开始查询，不传默认0
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListExecutionsRequest withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人，模糊查询
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ListExecutionsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间，大于
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListExecutionsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，小于
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListExecutionsRequest withDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * 作业名称，模糊查询
     * @return documentName
     */
    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public ListExecutionsRequest withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * 作业id
     * @return documentId
     */
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public ListExecutionsRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 标签过滤条件，例：?tags=key1=value1,key2=value2
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListExecutionsRequest withExcludeChildExecutions(Boolean excludeChildExecutions) {
        this.excludeChildExecutions = excludeChildExecutions;
        return this;
    }

    /**
     * 列表查询不返回子工单
     * @return excludeChildExecutions
     */
    public Boolean getExcludeChildExecutions() {
        return excludeChildExecutions;
    }

    public void setExcludeChildExecutions(Boolean excludeChildExecutions) {
        this.excludeChildExecutions = excludeChildExecutions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListExecutionsRequest that = (ListExecutionsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.documentName, that.documentName)
            && Objects.equals(this.documentId, that.documentId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.excludeChildExecutions, that.excludeChildExecutions);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(limit, offset, creator, startTime, endTime, documentName, documentId, tags, excludeChildExecutions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExecutionsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    excludeChildExecutions: ").append(toIndentedString(excludeChildExecutions)).append("\n");
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
