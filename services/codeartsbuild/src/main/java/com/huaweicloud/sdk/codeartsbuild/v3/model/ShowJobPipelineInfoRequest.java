package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowJobPipelineInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all")

    private String all;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_param_used")

    private String checkParamUsed;

    public ShowJobPipelineInfoRequest withJobId(String jobId) {
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

    public ShowJobPipelineInfoRequest withAll(String all) {
        this.all = all;
        return this;
    }

    /**
     * 输入\"true\"或者\"false\"来控制返回参数是不是完整的
     * @return all
     */
    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public ShowJobPipelineInfoRequest withCheckParamUsed(String checkParamUsed) {
        this.checkParamUsed = checkParamUsed;
        return this;
    }

    /**
     * 移除未使用的参数
     * @return checkParamUsed
     */
    public String getCheckParamUsed() {
        return checkParamUsed;
    }

    public void setCheckParamUsed(String checkParamUsed) {
        this.checkParamUsed = checkParamUsed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobPipelineInfoRequest that = (ShowJobPipelineInfoRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.all, that.all)
            && Objects.equals(this.checkParamUsed, that.checkParamUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, all, checkParamUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobPipelineInfoRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    all: ").append(toIndentedString(all)).append("\n");
        sb.append("    checkParamUsed: ").append(toIndentedString(checkParamUsed)).append("\n");
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
