package com.huaweicloud.sdk.cloudbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowJobSuccessRatioRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    public ShowJobSuccessRatioRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 构建的任务ID [获取项目下构建任务列表](https://support.huaweicloud.com/api-codeci/ShowJobListByProjectId.html)； 编辑构建任务时，浏览器URL末尾的32位数字、字母组合的字符串。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowJobSuccessRatioRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 区间开始时间，格式yyyy-MM-dd。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowJobSuccessRatioRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 区间结束时间，格式yyyy-MM-dd。
     * @return endTime
     */
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
        ShowJobSuccessRatioRequest showJobSuccessRatioRequest = (ShowJobSuccessRatioRequest) o;
        return Objects.equals(this.jobId, showJobSuccessRatioRequest.jobId)
            && Objects.equals(this.startTime, showJobSuccessRatioRequest.startTime)
            && Objects.equals(this.endTime, showJobSuccessRatioRequest.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobSuccessRatioRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
