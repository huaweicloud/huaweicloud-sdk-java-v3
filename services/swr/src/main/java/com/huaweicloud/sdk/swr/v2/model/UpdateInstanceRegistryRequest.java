package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateInstanceRegistryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_id")

    private Integer registryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateRegistryRequestBody body;

    public UpdateInstanceRegistryRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 企业仓库实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateInstanceRegistryRequest withRegistryId(Integer registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * 同步仓库ID
     * @return registryId
     */
    public Integer getRegistryId() {
        return registryId;
    }

    public void setRegistryId(Integer registryId) {
        this.registryId = registryId;
    }

    public UpdateInstanceRegistryRequest withBody(UpdateRegistryRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateInstanceRegistryRequest withBody(Consumer<UpdateRegistryRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateRegistryRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateRegistryRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateRegistryRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateInstanceRegistryRequest that = (UpdateInstanceRegistryRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.registryId, that.registryId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, registryId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceRegistryRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
