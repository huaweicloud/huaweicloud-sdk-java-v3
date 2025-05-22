package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DownloadRealTimeLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_no")

    private Integer buildNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "length")

    private Integer length;

    public DownloadRealTimeLogRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 构建的任务ID； 编辑构建任务时，浏览器URL末尾的32位数字、字母组合的字符串。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public DownloadRealTimeLogRequest withBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
        return this;
    }

    /**
     * 构建任务的构建编号，从1开始，每次构建递增1
     * minimum: 1
     * maximum: 2147483647
     * @return buildNo
     */
    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    public DownloadRealTimeLogRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，传入前一次请求返回的offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public DownloadRealTimeLogRequest withLength(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * 可控制返回内容长度，默认值为1000000
     * @return length
     */
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadRealTimeLogRequest that = (DownloadRealTimeLogRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.buildNo, that.buildNo)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.length, that.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, buildNo, offset, length);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadRealTimeLogRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    buildNo: ").append(toIndentedString(buildNo)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
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
