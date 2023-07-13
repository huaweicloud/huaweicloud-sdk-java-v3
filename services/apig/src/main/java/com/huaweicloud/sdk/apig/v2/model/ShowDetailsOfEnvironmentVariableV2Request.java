package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDetailsOfEnvironmentVariableV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_variable_id")

    private String envVariableId;

    public ShowDetailsOfEnvironmentVariableV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，在API网关控制台的“实例信息”中获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowDetailsOfEnvironmentVariableV2Request withEnvVariableId(String envVariableId) {
        this.envVariableId = envVariableId;
        return this;
    }

    /**
     * 环境变量的编号
     * @return envVariableId
     */
    public String getEnvVariableId() {
        return envVariableId;
    }

    public void setEnvVariableId(String envVariableId) {
        this.envVariableId = envVariableId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDetailsOfEnvironmentVariableV2Request that = (ShowDetailsOfEnvironmentVariableV2Request) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.envVariableId, that.envVariableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, envVariableId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailsOfEnvironmentVariableV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    envVariableId: ").append(toIndentedString(envVariableId)).append("\n");
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
