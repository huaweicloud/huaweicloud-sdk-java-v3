package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ModifyInstanceConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dynamic_config")

    private Integer dynamicConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_config")

    private Integer staticConfig;

    public ModifyInstanceConfigsResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 配置修改任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ModifyInstanceConfigsResponse withDynamicConfig(Integer dynamicConfig) {
        this.dynamicConfig = dynamicConfig;
        return this;
    }

    /**
     * 本次修改动态配置参数个数。
     * @return dynamicConfig
     */
    public Integer getDynamicConfig() {
        return dynamicConfig;
    }

    public void setDynamicConfig(Integer dynamicConfig) {
        this.dynamicConfig = dynamicConfig;
    }

    public ModifyInstanceConfigsResponse withStaticConfig(Integer staticConfig) {
        this.staticConfig = staticConfig;
        return this;
    }

    /**
     * 本次修改静态配置参数个数。
     * @return staticConfig
     */
    public Integer getStaticConfig() {
        return staticConfig;
    }

    public void setStaticConfig(Integer staticConfig) {
        this.staticConfig = staticConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyInstanceConfigsResponse that = (ModifyInstanceConfigsResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.dynamicConfig, that.dynamicConfig)
            && Objects.equals(this.staticConfig, that.staticConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, dynamicConfig, staticConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyInstanceConfigsResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    dynamicConfig: ").append(toIndentedString(dynamicConfig)).append("\n");
        sb.append("    staticConfig: ").append(toIndentedString(staticConfig)).append("\n");
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
