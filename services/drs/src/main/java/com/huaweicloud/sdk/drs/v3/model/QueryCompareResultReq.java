package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class QueryCompareResultReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_level_compare_id")

    private String objectLevelCompareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_compare_id")

    private String lineCompareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_compare_id")

    private String contentCompareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_page")

    private Integer currentPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private Integer perPage;

    public QueryCompareResultReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public QueryCompareResultReq withObjectLevelCompareId(String objectLevelCompareId) {
        this.objectLevelCompareId = objectLevelCompareId;
        return this;
    }

    /**
     * 请求查询结果的对象级对比任务id。
     * @return objectLevelCompareId
     */
    public String getObjectLevelCompareId() {
        return objectLevelCompareId;
    }

    public void setObjectLevelCompareId(String objectLevelCompareId) {
        this.objectLevelCompareId = objectLevelCompareId;
    }

    public QueryCompareResultReq withLineCompareId(String lineCompareId) {
        this.lineCompareId = lineCompareId;
        return this;
    }

    /**
     * 请求查询结果的行对比任务id。
     * @return lineCompareId
     */
    public String getLineCompareId() {
        return lineCompareId;
    }

    public void setLineCompareId(String lineCompareId) {
        this.lineCompareId = lineCompareId;
    }

    public QueryCompareResultReq withContentCompareId(String contentCompareId) {
        this.contentCompareId = contentCompareId;
        return this;
    }

    /**
     * 请求查询结果的内容对比任务id。
     * @return contentCompareId
     */
    public String getContentCompareId() {
        return contentCompareId;
    }

    public void setContentCompareId(String contentCompareId) {
        this.contentCompareId = contentCompareId;
    }

    public QueryCompareResultReq withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /**
     * 分页查询的当前页码，对查询对比任务的结果生效。
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public QueryCompareResultReq withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 分页查询的每页个数，对查询对比任务的结果生效。
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryCompareResultReq that = (QueryCompareResultReq) obj;
        return Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.objectLevelCompareId, that.objectLevelCompareId)
            && Objects.equals(this.lineCompareId, that.lineCompareId)
            && Objects.equals(this.contentCompareId, that.contentCompareId)
            && Objects.equals(this.currentPage, that.currentPage) && Objects.equals(this.perPage, that.perPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, objectLevelCompareId, lineCompareId, contentCompareId, currentPage, perPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCompareResultReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    objectLevelCompareId: ").append(toIndentedString(objectLevelCompareId)).append("\n");
        sb.append("    lineCompareId: ").append(toIndentedString(lineCompareId)).append("\n");
        sb.append("    contentCompareId: ").append(toIndentedString(contentCompareId)).append("\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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
