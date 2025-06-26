package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteInstanceRegistryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_id")

    private Integer registryId;

    public DeleteInstanceRegistryRequest withInstanceId(String instanceId) {
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

    public DeleteInstanceRegistryRequest withRegistryId(Integer registryId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteInstanceRegistryRequest that = (DeleteInstanceRegistryRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.registryId, that.registryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, registryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteInstanceRegistryRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
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
