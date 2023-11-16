package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListJobConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "get_all_params")

    private String getAllParams;

    public ListJobConfigRequest withJobId(String jobId) {
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

    public ListJobConfigRequest withGetAllParams(String getAllParams) {
        this.getAllParams = getAllParams;
        return this;
    }

    /**
     * 输入\"true\"或者\"false\"来控制返回参数是不是完整的
     * @return getAllParams
     */
    public String getGetAllParams() {
        return getAllParams;
    }

    public void setGetAllParams(String getAllParams) {
        this.getAllParams = getAllParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobConfigRequest that = (ListJobConfigRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.getAllParams, that.getAllParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, getAllParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobConfigRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    getAllParams: ").append(toIndentedString(getAllParams)).append("\n");
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
