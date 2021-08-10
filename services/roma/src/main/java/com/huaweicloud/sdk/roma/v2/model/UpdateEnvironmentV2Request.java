package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateEnvironmentV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EnvCreate body;

    public UpdateEnvironmentV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateEnvironmentV2Request withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /** 环境的ID
     * 
     * @return envId */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public UpdateEnvironmentV2Request withBody(EnvCreate body) {
        this.body = body;
        return this;
    }

    public UpdateEnvironmentV2Request withBody(Consumer<EnvCreate> bodySetter) {
        if (this.body == null) {
            this.body = new EnvCreate();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public EnvCreate getBody() {
        return body;
    }

    public void setBody(EnvCreate body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEnvironmentV2Request updateEnvironmentV2Request = (UpdateEnvironmentV2Request) o;
        return Objects.equals(this.instanceId, updateEnvironmentV2Request.instanceId)
            && Objects.equals(this.envId, updateEnvironmentV2Request.envId)
            && Objects.equals(this.body, updateEnvironmentV2Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, envId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEnvironmentV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
