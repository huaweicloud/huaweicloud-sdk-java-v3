package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListApiRuntimeDefinitionV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    public ListApiRuntimeDefinitionV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例编号
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListApiRuntimeDefinitionV2Request withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /** API的编号
     * 
     * @return apiId */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public ListApiRuntimeDefinitionV2Request withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /** API的发布环境编号
     * 
     * @return envId */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApiRuntimeDefinitionV2Request listApiRuntimeDefinitionV2Request = (ListApiRuntimeDefinitionV2Request) o;
        return Objects.equals(this.instanceId, listApiRuntimeDefinitionV2Request.instanceId)
            && Objects.equals(this.apiId, listApiRuntimeDefinitionV2Request.apiId)
            && Objects.equals(this.envId, listApiRuntimeDefinitionV2Request.envId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, apiId, envId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApiRuntimeDefinitionV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
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
