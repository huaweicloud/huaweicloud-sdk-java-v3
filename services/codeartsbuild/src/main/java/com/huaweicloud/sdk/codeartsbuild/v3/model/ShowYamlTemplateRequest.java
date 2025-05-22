package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowYamlTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_host")

    private String defaultHost;

    public ShowYamlTemplateRequest withJobId(String jobId) {
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

    public ShowYamlTemplateRequest withDefaultHost(String defaultHost) {
        this.defaultHost = defaultHost;
        return this;
    }

    /**
     * 默认主机类型
     * @return defaultHost
     */
    public String getDefaultHost() {
        return defaultHost;
    }

    public void setDefaultHost(String defaultHost) {
        this.defaultHost = defaultHost;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowYamlTemplateRequest that = (ShowYamlTemplateRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.defaultHost, that.defaultHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, defaultHost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowYamlTemplateRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    defaultHost: ").append(toIndentedString(defaultHost)).append("\n");
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
