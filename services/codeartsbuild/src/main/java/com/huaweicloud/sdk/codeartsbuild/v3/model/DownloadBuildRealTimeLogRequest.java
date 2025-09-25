package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DownloadBuildRealTimeLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_no")

    private Integer buildNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_offset")

    private Integer startOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_offset")

    private Integer endOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    public DownloadBuildRealTimeLogRequest withJobId(String jobId) {
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

    public DownloadBuildRealTimeLogRequest withBuildNo(Integer buildNo) {
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

    public DownloadBuildRealTimeLogRequest withStartOffset(Integer startOffset) {
        this.startOffset = startOffset;
        return this;
    }

    /**
     * **参数解释**： 起始偏移量，表示从此开始查询。 **约束限制**： 不涉及。 **取值范围**： 只能使用数字，大于等于0。
     * minimum: 0
     * @return startOffset
     */
    public Integer getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(Integer startOffset) {
        this.startOffset = startOffset;
    }

    public DownloadBuildRealTimeLogRequest withEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * **参数解释**： 结束偏移量，表示查询到此结束。 **约束限制**： 不涉及。 **取值范围**： 只能使用数字，大于等于0。
     * minimum: 0
     * @return endOffset
     */
    public Integer getEndOffset() {
        return endOffset;
    }

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    public DownloadBuildRealTimeLogRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * **参数解释**： 排序方式。 **约束限制**： 不涉及。 **取值范围**： AES|DESC。
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public DownloadBuildRealTimeLogRequest withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**： 可控制返回内容长度，固定1000。 **约束限制**： 不涉及。 **取值范围**： 只能使用数字，大于等于0。 **默认取值**： 1000
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadBuildRealTimeLogRequest that = (DownloadBuildRealTimeLogRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.buildNo, that.buildNo)
            && Objects.equals(this.startOffset, that.startOffset) && Objects.equals(this.endOffset, that.endOffset)
            && Objects.equals(this.sort, that.sort) && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, buildNo, startOffset, endOffset, sort, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadBuildRealTimeLogRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    buildNo: ").append(toIndentedString(buildNo)).append("\n");
        sb.append("    startOffset: ").append(toIndentedString(startOffset)).append("\n");
        sb.append("    endOffset: ").append(toIndentedString(endOffset)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
