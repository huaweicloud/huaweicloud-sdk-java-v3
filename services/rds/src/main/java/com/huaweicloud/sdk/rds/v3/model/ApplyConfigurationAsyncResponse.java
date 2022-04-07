package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ApplyConfigurationAsyncResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_id")

    private String configurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_name")

    private String configurationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public ApplyConfigurationAsyncResponse withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /** 参数组ID。
     * 
     * @return configurationId */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public ApplyConfigurationAsyncResponse withConfigurationName(String configurationName) {
        this.configurationName = configurationName;
        return this;
    }

    /** 参数组名称。
     * 
     * @return configurationName */
    public String getConfigurationName() {
        return configurationName;
    }

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    public ApplyConfigurationAsyncResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /** 参数模板是否都应用成功。 - “true”表示参数模板都应用成功。 - “false”表示存在应用失败的参数模板。
     * 
     * @return success */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ApplyConfigurationAsyncResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 任务流id
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplyConfigurationAsyncResponse applyConfigurationAsyncResponse = (ApplyConfigurationAsyncResponse) o;
        return Objects.equals(this.configurationId, applyConfigurationAsyncResponse.configurationId)
            && Objects.equals(this.configurationName, applyConfigurationAsyncResponse.configurationName)
            && Objects.equals(this.success, applyConfigurationAsyncResponse.success)
            && Objects.equals(this.jobId, applyConfigurationAsyncResponse.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurationId, configurationName, success, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyConfigurationAsyncResponse {\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
