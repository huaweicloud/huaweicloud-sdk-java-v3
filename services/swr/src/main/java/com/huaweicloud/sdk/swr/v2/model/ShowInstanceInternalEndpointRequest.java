package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowInstanceInternalEndpointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_endpoints_id")

    private String internalEndpointsId;

    public ShowInstanceInternalEndpointRequest withInstanceId(String instanceId) {
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

    public ShowInstanceInternalEndpointRequest withInternalEndpointsId(String internalEndpointsId) {
        this.internalEndpointsId = internalEndpointsId;
        return this;
    }

    /**
     * 内网访问ID
     * @return internalEndpointsId
     */
    public String getInternalEndpointsId() {
        return internalEndpointsId;
    }

    public void setInternalEndpointsId(String internalEndpointsId) {
        this.internalEndpointsId = internalEndpointsId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceInternalEndpointRequest that = (ShowInstanceInternalEndpointRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.internalEndpointsId, that.internalEndpointsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, internalEndpointsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceInternalEndpointRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    internalEndpointsId: ").append(toIndentedString(internalEndpointsId)).append("\n");
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
