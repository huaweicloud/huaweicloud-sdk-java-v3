package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowScanJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ShowScanJobsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /** 页码
     * 
     * @return page */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ShowScanJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 分页大小
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowScanJobsRequest withContent(String content) {
        this.content = content;
        return this;
    }

    /** 内容
     * 
     * @return content */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ShowScanJobsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 预留，待启用
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowScanJobsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 预留，待启用
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowScanJobsRequest showScanJobsRequest = (ShowScanJobsRequest) o;
        return Objects.equals(this.page, showScanJobsRequest.page)
            && Objects.equals(this.limit, showScanJobsRequest.limit)
            && Objects.equals(this.content, showScanJobsRequest.content)
            && Objects.equals(this.startTime, showScanJobsRequest.startTime)
            && Objects.equals(this.endTime, showScanJobsRequest.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, limit, content, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScanJobsRequest {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
