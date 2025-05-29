package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowJobConfigDiffRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revisedl_no")

    private String revisedlNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_no")

    private String originalNo;

    public ShowJobConfigDiffRequest withJobId(String jobId) {
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

    public ShowJobConfigDiffRequest withRevisedlNo(String revisedlNo) {
        this.revisedlNo = revisedlNo;
        return this;
    }

    /**
     * 新记录的序号
     * @return revisedlNo
     */
    public String getRevisedlNo() {
        return revisedlNo;
    }

    public void setRevisedlNo(String revisedlNo) {
        this.revisedlNo = revisedlNo;
    }

    public ShowJobConfigDiffRequest withOriginalNo(String originalNo) {
        this.originalNo = originalNo;
        return this;
    }

    /**
     * 原记录的序号
     * @return originalNo
     */
    public String getOriginalNo() {
        return originalNo;
    }

    public void setOriginalNo(String originalNo) {
        this.originalNo = originalNo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobConfigDiffRequest that = (ShowJobConfigDiffRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.revisedlNo, that.revisedlNo)
            && Objects.equals(this.originalNo, that.originalNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, revisedlNo, originalNo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobConfigDiffRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    revisedlNo: ").append(toIndentedString(revisedlNo)).append("\n");
        sb.append("    originalNo: ").append(toIndentedString(originalNo)).append("\n");
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
