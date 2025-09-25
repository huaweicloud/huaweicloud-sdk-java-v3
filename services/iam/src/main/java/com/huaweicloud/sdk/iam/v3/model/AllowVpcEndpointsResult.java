package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class AllowVpcEndpointsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_endpoint_id")

    private String vpcEndpointId;

    public AllowVpcEndpointsResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AllowVpcEndpointsResult withVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * VPC端点，例如：8di3jdu38d7jhfa7df68adyfiadfia6d。
     * @return vpcEndpointId
     */
    public String getVpcEndpointId() {
        return vpcEndpointId;
    }

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AllowVpcEndpointsResult that = (AllowVpcEndpointsResult) obj;
        return Objects.equals(this.description, that.description)
            && Objects.equals(this.vpcEndpointId, that.vpcEndpointId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, vpcEndpointId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllowVpcEndpointsResult {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vpcEndpointId: ").append(toIndentedString(vpcEndpointId)).append("\n");
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
